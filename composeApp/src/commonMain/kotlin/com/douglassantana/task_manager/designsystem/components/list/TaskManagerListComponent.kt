package com.douglassantana.task_manager.designsystem.components.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.douglassantana.task_manager.designsystem.theme.TaskManagerTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun TaskManagerListComponent(
    modifier: Modifier = Modifier,
) = Column(
    modifier = modifier.fillMaxWidth()
) {
    Text(
        text = "Title",
        overflow = TextOverflow.Ellipsis,
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier.fillMaxWidth()
    )

    Text(
        text = "Subtitle",
        overflow = TextOverflow.Ellipsis,
        style = MaterialTheme.typography.bodySmall,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 4.dp)
    )

    HorizontalDivider(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 6.dp),
        thickness = 2.dp
    )
}

@Composable
@Preview
private fun TaskListComponentPreview() {
    TaskManagerTheme {
        Surface {
            TaskManagerListComponent()
        }
    }
}