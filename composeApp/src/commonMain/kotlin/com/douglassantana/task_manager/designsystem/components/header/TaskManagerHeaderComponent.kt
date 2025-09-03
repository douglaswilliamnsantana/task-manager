package com.douglassantana.task_manager.designsystem.components.header

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.douglassantana.task_manager.designsystem.theme.TaskManagerTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskManagerHeaderComponent(
    modifier: Modifier = Modifier,
    onBackNavigate: (() -> Unit)? = null,
) = CenterAlignedTopAppBar(
    modifier = modifier,
    navigationIcon = {
        if (onBackNavigate != null)
            IconButton(onClick = { onBackNavigate.invoke() }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Localized description"
                )
            }
    },
    title = {
        Text(
            text = "Task Manager",
            style = MaterialTheme.typography.titleSmall,
        )
    }
)

@Composable
@Preview
private fun TaskHeaderComponentPreview() {
    TaskManagerTheme {
        TaskManagerHeaderComponent()
    }
}