package com.douglassantana.task_manager

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController(configure = { }) {
    TaskManagerApp()
}