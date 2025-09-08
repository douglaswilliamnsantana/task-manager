package com.douglassantana.task_manager.feature.register.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.douglassantana.task_manager.feature.register.ui.TaskManagerRegisterRoute
import kotlinx.serialization.Serializable

@Serializable
data object RegisterRoute

fun NavController.navigateToTaskRegister(
    navOptions: NavOptions? = null
) = navigate(RegisterRoute, navOptions)

fun NavGraphBuilder.taskRegisterScreen(
    onNavigationHome: () -> Unit,
    onBackNavigate: () -> Unit,
) = composable<RegisterRoute> {
    TaskManagerRegisterRoute(
        onNavigationHome = onNavigationHome,
        onBackNavigate = onBackNavigate
    )
}