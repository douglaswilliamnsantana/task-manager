package com.douglassantana.task_manager.designsystem.theme.typography

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val letterSpacing1 = (-0.01).sp
private val letterSpacing2 = (-0.02).sp

/**
 * Font sizes
 */
@Composable
fun TaskManagerTypography(): Typography {

    val fontFamily = TaskManagerFontFamily()

    return Typography(
        displayLarge = TextStyle(
            fontFamily = fontFamily,
            fontSize = displayLargeSize,
            fontWeight = FontWeight.Medium,
            letterSpacing = letterSpacing2,
            lineHeight = displayLineHeight,
            textDecoration = null
        ),
        displayMedium = TextStyle(
            fontFamily = fontFamily,
            fontSize = displayMediumSize,
            fontWeight = FontWeight.Medium,
            letterSpacing = letterSpacing2,
            lineHeight = displayMediumLineHeight,
            textDecoration = null
        ),
        displaySmall = TextStyle(
            fontFamily = fontFamily,
            fontSize = displaySmallSize,
            fontWeight = FontWeight.Medium,
            letterSpacing = letterSpacing2,
            lineHeight = displaySmallLineHeight,
            textDecoration = null
        ),
        headlineLarge = TextStyle(
            fontFamily = fontFamily,
            fontSize = headlineLargeSize,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = letterSpacing2,
            lineHeight = headlineLargeLineHeight,
            textDecoration = null
        ),
        headlineMedium = TextStyle(
            fontFamily = fontFamily,
            fontSize = headlineMediumSize,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = letterSpacing1,
            lineHeight = 28.sp,
            textDecoration = null
        ),
        headlineSmall = TextStyle(
            fontFamily = fontFamily,
            fontSize = headlineSmallSize,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = letterSpacing1,
            lineHeight = headlineMediumLineHeight,
            textDecoration = null
        ),
        titleLarge = TextStyle(
            fontFamily = fontFamily,
            fontSize = titleLargeSize,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = letterSpacing2,
            lineHeight = titleLargeLineHeight,
            textDecoration = null
        ),
        titleMedium = TextStyle(
            fontFamily =fontFamily,
            fontSize = titleMediumSize,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = letterSpacing1,
            lineHeight = titleMediumLineHeight,
            textDecoration = null
        ),
        titleSmall = TextStyle(
            fontFamily = fontFamily,
            fontSize = titleSmallSize,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = letterSpacing1,
            lineHeight = titleSmallLineHeight,
            textDecoration = null
        ),
        bodyLarge = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = bodyLargeSize,
            lineHeight = bodyLargeLineHeight,
            letterSpacing = 0.5.sp
        ),
        bodyMedium = TextStyle(
            fontFamily = fontFamily,
            fontSize = bodyMediumSize,
            fontWeight = FontWeight.Normal,
            lineHeight = bodyMediumLineHeight,
            textDecoration = null
        ),
        bodySmall = TextStyle(
            fontFamily = fontFamily,
            fontSize = bodySmallSize,
            fontWeight = FontWeight.Normal,
            lineHeight = bodySmallLineHeight,
            textDecoration = null
        ),
        labelLarge = TextStyle(
            fontFamily = fontFamily,
            fontSize = labelLargeSize,
            fontWeight = FontWeight.Normal,
            lineHeight = labelLargeLineHeight,
            textDecoration = null
        ),
        labelMedium = TextStyle(
            fontFamily = fontFamily,
            fontSize = labelMediumSize,
            fontWeight = FontWeight.Normal,
            lineHeight = labelMediumSizeLineHeight,
            textDecoration = null
        ),
        labelSmall = TextStyle(
            fontFamily = fontFamily,
            fontSize = labelSmallSize,
            fontWeight = FontWeight.Normal,
            lineHeight = labelSmallLineHeight,
            textDecoration = null
        ),
    )
}
