package com.douglassantana.task_manager.feature.home

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
import androidx.compose.ui.unit.dp
import com.douglassantana.task_manager.designsystem.components.header.TaskManagerHeader
import com.douglassantana.task_manager.designsystem.components.list.TaskManagerListComponent

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onNavigationRegister: () -> Unit,
) = Scaffold(
    topBar = { TaskManagerHeader(title = "Task Manager") },
    floatingActionButton = {
        ExtendedFloatingActionButton(
            onClick = onNavigationRegister,
            icon = {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                )
            },
            text = { Text(text = "Add Item") }
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
                TaskManagerListComponent(
                    modifier = Modifier
                        .padding(
                            horizontal = 16.dp,
                            vertical = 8.dp
                        )
                )
            }
        }
    }
}
