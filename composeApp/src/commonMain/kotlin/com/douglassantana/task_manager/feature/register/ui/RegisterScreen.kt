package com.douglassantana.task_manager.feature.register.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.douglassantana.task_manager.designsystem.components.header.TaskManagerHeader
import com.douglassantana.task_manager.designsystem.components.input.TaskManagerInput
import com.douglassantana.task_manager.designsystem.theme.TaskManagerTheme
import com.douglassantana.task_manager.designsystem.theme.space16
import com.douglassantana.task_manager.designsystem.theme.space8
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel
import taskmanager.composeapp.generated.resources.Res
import taskmanager.composeapp.generated.resources.btn_label_register
import taskmanager.composeapp.generated.resources.header_title_register
import taskmanager.composeapp.generated.resources.input_label_register
import taskmanager.composeapp.generated.resources.input_label_subtitle_register

@Composable
fun TaskManagerRegisterRoute(
    modifier: Modifier = Modifier,
    onNavigationHome: () -> Unit,
    onBackNavigate: () -> Unit,
) {
    val viewModel: RegisterViewModel = koinViewModel()

    val uiState = viewModel.uiState.collectAsStateWithLifecycle().value

    RegisterScreen(
        modifier = modifier,
        uiState = uiState,
        onValueChangeTaskName = viewModel::updateTaskName,
        onValueChangeTaskSubtitle = viewModel::updateTaskSubtitle,
        onNavigationHome = onNavigationHome,
        onBackNavigate = onBackNavigate
    )
}

@Composable
private fun RegisterScreen(
    modifier: Modifier = Modifier,
    uiState: RegisterUiState,
    onValueChangeTaskName: (String) -> Unit,
    onValueChangeTaskSubtitle: (String) -> Unit,
    onNavigationHome: () -> Unit,
    onBackNavigate: () -> Unit,
) = Scaffold(
    topBar = {
        TaskManagerHeader(
            title = stringResource(resource = Res.string.header_title_register),
            onBackStack = onBackNavigate
        )
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
                    .padding(horizontal = space16),
            ) {
                val text = remember { mutableStateOf("") }

                TaskManagerInput(
                    modifier = Modifier
                        .padding(top = space16),
                    value = uiState.taskName,
                    onValueChange = onValueChangeTaskName,
                    label = stringResource(resource = Res.string.input_label_register)
                )

                TaskManagerInput(
                    modifier = Modifier
                        .padding(top = space16),
                    value =uiState.taskSubtitle,
                    onValueChange = onValueChangeTaskSubtitle,
                    label = stringResource(resource = Res.string.input_label_subtitle_register)
                )

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = space16),
                    shape = RoundedCornerShape(size = space8),
                    content = { Text(text = stringResource(resource = Res.string.btn_label_register)) },
                    onClick = onNavigationHome,
                )
            }
        }
    }
}

@Composable
@Preview
private fun RegisterScreen() {
    TaskManagerTheme {
        RegisterScreen(
            uiState = RegisterUiState(),
            onValueChangeTaskName = { },
            onValueChangeTaskSubtitle = { },
            onNavigationHome = { },
            onBackNavigate = { }
        )
    }
}
