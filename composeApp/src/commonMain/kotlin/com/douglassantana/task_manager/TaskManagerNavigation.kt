package com.douglassantana.task_manager

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.douglassantana.task_manager.feature.home.HomeScreen
import com.douglassantana.task_manager.feature.register.RegisterScreen

@Composable
fun TaskManagerNavigation(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier,
) = NavHost(
    navController = navController,
    startDestination = "home",
    modifier = modifier.fillMaxSize()
) {
    composable(route = "home") {
        HomeScreen(
            onNavigationRegister = {
                navController.navigate("register")
            }
        )
    }
    composable(route = "register") {
        RegisterScreen(
            onNavigationHome = { navController.popBackStack() },
            onBackNavigate = { navController.popBackStack() }
        )
    }
}