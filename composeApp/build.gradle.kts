import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetTree

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    kotlin("plugin.serialization")
}

kotlin {
    jvmToolchain(jdkVersion = 21)

    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        instrumentedTestVariant.sourceSetTree.set(KotlinSourceSetTree.test)
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }
    
    sourceSets {
        all {
            languageSettings.optIn(annotationName = "kotlinx.cinterop.ExperimentalForeignApi")
        }

        androidMain.dependencies {
            implementation(dependencyNotation = compose.preview)
            implementation(dependencyNotation = libs.androidx.activity.compose)
            implementation(dependencyNotation = libs.koin.android)
            implementation(dependencyNotation = libs.koin.androidx.compose)
        }

        commonMain.dependencies {
            implementation(dependencyNotation = libs.compose.runtime)
            implementation(dependencyNotation = libs.compose.foundation)
            implementation(dependencyNotation = libs.compose.material3)
            implementation(dependencyNotation = libs.material.icons)
            implementation(dependencyNotation = libs.compose.ui)
            implementation(dependencyNotation = libs.components.resources)
            implementation(dependencyNotation = libs.compose.preview)
            implementation(dependencyNotation = libs.androidx.lifecycle.viewmodelCompose)
            implementation(dependencyNotation = libs.androidx.lifecycle.runtimeCompose)
            implementation(dependencyNotation = libs.navigation.compose)
            implementation(dependencyNotation = libs.kotlinx.coroutines.core)

            // koin
            api(dependencyNotation = libs.koin.core)
            implementation(dependencyNotation = libs.koin.compose)
            implementation(dependencyNotation = libs.koin.composeVM)
        }

        commonTest.dependencies {
            implementation(dependencyNotation = kotlin(simpleModuleName = "test"))

            @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
            implementation(dependencyNotation = libs.ui.test)
        }
    }
}

android {
    namespace = "com.douglassantana.task_manager"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.douglassantana.task_manager"
        minSdk = 31
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        compose = true
    }

    testOptions {
        unitTests {
            all {
                it.exclude("**/screen/**")
            }
        }
    }
}

dependencies {
    debugImplementation(libs.ui.tooling)
}
