package com.douglassantana.task_manager

import androidx.compose.runtime.Composable
import com.douglassantana.task_manager.designsystem.theme.TaskManagerTheme

@Composable
fun TaskManagerApp() {
    TaskManagerTheme {
        TaskManagerNavigation()
    }
}