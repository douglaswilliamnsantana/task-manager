package com.douglassantana.task_manager.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.douglassantana.task_manager.feature.home.ui.HomeScreen
import kotlinx.serialization.Serializable

@Serializable
data object HomeRoute

fun NavController.navigateToTaskHome(
    navOptions: NavOptions? = null
) = navigate(HomeRoute, navOptions)

fun NavGraphBuilder.taskHomeScreen(
    onNavigationRegister: () -> Unit
) = composable<HomeRoute> {
    HomeScreen(
        onNavigationRegister = onNavigationRegister
    )
}