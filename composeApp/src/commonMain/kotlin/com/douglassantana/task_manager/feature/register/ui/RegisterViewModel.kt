package com.douglassantana.task_manager.feature.register.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RegisterViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(RegisterUiState())
    val uiState: StateFlow<RegisterUiState> = _uiState.asStateFlow()

    fun updateTaskName(taskNameText: String) {
        _uiState.update { currentState ->
            currentState.copy(
                taskName = taskNameText,
            )
        }
    }

    fun updateTaskSubtitle(taskSubtitleText: String) {
        _uiState.update { currentState ->
            currentState.copy(taskSubtitle = taskSubtitleText)
        }
    }
}