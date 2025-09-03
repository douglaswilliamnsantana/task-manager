package com.douglassantana.task_manager.feature.register

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.douglassantana.task_manager.designsystem.components.header.TaskManagerHeaderComponent

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    onNavigationHome: () -> Unit,
    onBackNavigate: () -> Unit,
) = Scaffold(
    topBar = {
        TaskManagerHeaderComponent(onBackNavigate = onBackNavigate)
    }
) { paddingValues ->
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = modifier
                .padding(paddingValues = paddingValues)
                .verticalScroll(state = rememberScrollState())
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(horizontal = 16.dp),
            ) {
                val text = remember { mutableStateOf("") }

                TextField(
                    modifier = Modifier
                        .width(width = 230.dp),
                    value = text.value,
                    onValueChange = { text.value = it },
                    label = { Text("Enter your name") },
                )

                Button(
                    modifier = Modifier
                        .width(width = 230.dp)
                        .padding(top = 16.dp),
                    shape = RoundedCornerShape(8.dp),
                    content = { Text(text = "Save Task") },
                    onClick = onNavigationHome,
                )
            }
        }
    }
}
