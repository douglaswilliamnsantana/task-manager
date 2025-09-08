package com.douglassantana.task_manager

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.douglassantana.task_manager.feature.home.navigation.HomeRoute
import com.douglassantana.task_manager.feature.home.navigation.taskHomeScreen
import com.douglassantana.task_manager.feature.register.navigation.navigateToTaskRegister
import com.douglassantana.task_manager.feature.register.navigation.taskRegisterScreen

@Composable
fun TaskManagerNavigation(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier,
) = NavHost(
    navController = navController,
    startDestination = HomeRoute,
    modifier = modifier.fillMaxSize()
) {
    taskHomeScreen(
        onNavigationRegister = navController::navigateToTaskRegister
    )

    taskRegisterScreen(
        onBackNavigate = { navController.popBackStack() },
        onNavigationHome = { navController.popBackStack() }
    )
}