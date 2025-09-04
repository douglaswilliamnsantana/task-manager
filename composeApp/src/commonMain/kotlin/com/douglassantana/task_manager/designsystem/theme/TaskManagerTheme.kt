package com.douglassantana.task_manager.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.douglassantana.task_manager.designsystem.theme.colors.darkColorScheme
import com.douglassantana.task_manager.designsystem.theme.colors.lightColorScheme
import com.douglassantana.task_manager.designsystem.theme.typography.TaskManagerTypography

@Composable
fun TaskManagerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> darkColorScheme
        else -> lightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = TaskManagerTypography(),
        content = content
    )
}