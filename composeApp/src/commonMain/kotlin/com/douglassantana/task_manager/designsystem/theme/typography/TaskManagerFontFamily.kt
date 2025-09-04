package com.douglassantana.task_manager.designsystem.theme.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import taskmanager.composeapp.generated.resources.Res
import taskmanager.composeapp.generated.resources.open_sans_bold
import taskmanager.composeapp.generated.resources.open_sans_light
import taskmanager.composeapp.generated.resources.open_sans_medium
import taskmanager.composeapp.generated.resources.open_sans_regular
import taskmanager.composeapp.generated.resources.open_sans_semi_bold

/**
 * Define the font family for the application using Open Sans font in various weights.
 */
@Composable
fun TaskManagerFontFamily() = FontFamily(
    Font(Res.font.open_sans_light, weight = FontWeight.Light),
    Font(Res.font.open_sans_regular, weight = FontWeight.Normal),
    Font(Res.font.open_sans_medium, weight = FontWeight.Medium),
    Font(Res.font.open_sans_semi_bold, weight = FontWeight.SemiBold),
    Font(Res.font.open_sans_bold, weight = FontWeight.Bold),
)