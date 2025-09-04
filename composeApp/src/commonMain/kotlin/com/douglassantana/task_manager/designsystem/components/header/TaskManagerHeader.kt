package com.douglassantana.task_manager.designsystem.components.header

import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.douglassantana.task_manager.designsystem.theme.TaskManagerTheme
import com.douglassantana.task_manager.designsystem.theme.size24
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import taskmanager.composeapp.generated.resources.Res
import taskmanager.composeapp.generated.resources.ic_arrow_back

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskManagerHeader(
    modifier: Modifier = Modifier,
    title: String,
    onBackStack: (() -> Unit)? = null
) = CenterAlignedTopAppBar(
    modifier = modifier,
    navigationIcon = {
        if (onBackStack != null)
            IconButton(onClick = { onBackStack.invoke() }) {
                Icon(
                    painter = painterResource(resource = Res.drawable.ic_arrow_back),
                    contentDescription = "Back Icon",
                    modifier = Modifier
                        .size(size = size24)
                )
            }
    },
    title = {
        Text(
            text = title,
            style = MaterialTheme.typography.titleSmall,
        )
    }
)

@Composable
@Preview
private fun TaskHeaderComponentPreview() {
    TaskManagerTheme {
        TaskManagerHeader(
            title = "Header Title",
            onBackStack = {}
        )
    }
}
