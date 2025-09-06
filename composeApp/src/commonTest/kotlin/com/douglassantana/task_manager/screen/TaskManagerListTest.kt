package com.douglassantana.task_manager.screen

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.runComposeUiTest
import com.douglassantana.task_manager.designsystem.components.list.TaskManagerList
import kotlin.test.Test

@OptIn(ExperimentalTestApi::class)
class TaskManagerListTest {

    @Test
    fun `GIVEN list item WHEN defined THEN show task data correctly`() =
        runComposeUiTest {
            setContent {
                TaskManagerList(
                    taskTitle = "title",
                    taskSubtitle = "subtitle"
                )
            }

            onNodeWithText("title").assertExists()
            onNodeWithText("subtitle").assertExists()
        }
    }