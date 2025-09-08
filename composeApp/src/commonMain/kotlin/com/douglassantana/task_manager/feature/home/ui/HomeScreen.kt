package com.douglassantana.task_manager.feature.home.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.douglassantana.task_manager.designsystem.components.header.TaskManagerHeader
import com.douglassantana.task_manager.designsystem.components.list.TaskManagerList
import com.douglassantana.task_manager.designsystem.theme.space16
import com.douglassantana.task_manager.designsystem.theme.space8
import org.jetbrains.compose.resources.stringResource
import taskmanager.composeapp.generated.resources.Res
import taskmanager.composeapp.generated.resources.btn_title_home
import taskmanager.composeapp.generated.resources.header_title_home

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onNavigationRegister: () -> Unit,
) = Scaffold(
    topBar = { TaskManagerHeader(title = stringResource(resource = Res.string.header_title_home)) },
    floatingActionButton = {
        ExtendedFloatingActionButton(
            onClick = onNavigationRegister,
            icon = {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                )
            },
            text = { Text(text = stringResource(resource = Res.string.btn_title_home)) }
        )
    }
) { paddingValues ->
    Column(
        modifier = Modifier
            .padding(paddingValues = paddingValues)
            .fillMaxSize()
    ) {
        LazyColumn {
            items(20) {
                TaskManagerList(
                    taskTitle = "Task $it",
                    taskSubtitle = "This is the description for task $it",
                    modifier = Modifier
                        .padding(
                            horizontal = space16,
                            vertical = space8
                        )
                )
            }
        }
    }
}
