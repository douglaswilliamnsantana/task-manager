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
import com.douglassantana.task_manager.designsystem.common.isNotNullOrEmpty
import com.douglassantana.task_manager.designsystem.theme.TaskManagerTheme
import com.douglassantana.task_manager.designsystem.theme.space2
import com.douglassantana.task_manager.designsystem.theme.space4
import com.douglassantana.task_manager.designsystem.theme.space6
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun TaskManagerList(
    modifier: Modifier = Modifier,
    taskTitle: String,
    taskSubtitle: String? = null,
    showDivider: Boolean = true,
) = Column(
    modifier = modifier.fillMaxWidth()
) {
    Text(
        text = taskTitle,
        overflow = TextOverflow.Ellipsis,
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier.fillMaxWidth()
    )

    taskSubtitle.takeIf { it.isNotNullOrEmpty() }?.let { subtitle ->
        Text(
            text = subtitle,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = space4)
        )
    }

    showDivider.takeIf { it }?.let {
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = space6),
            thickness = space2
        )
    }
}

@Composable
@Preview
private fun TaskManagerListPreview() {
    TaskManagerTheme {
        Surface {
            TaskManagerList(
                taskTitle = "Title",
            )
        }
    }
}

@Composable
@Preview
private fun TaskManagerListDescriptionPreview() {
    TaskManagerTheme {
        Surface {
            TaskManagerList(
                taskTitle = "Title",
                taskSubtitle = "Description"
            )
        }
    }
}

@Composable
@Preview
private fun TaskManagerListShowDividerPreview() {
    TaskManagerTheme {
        Surface {
            TaskManagerList(
                taskTitle = "Title",
                taskSubtitle = "Description",
                showDivider = false
            )
        }
    }
}
