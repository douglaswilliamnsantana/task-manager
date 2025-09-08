package com.douglassantana.task_manager

import androidx.compose.ui.window.ComposeUIViewController
import com.douglassantana.task_manager.di.initKoin
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController(
    configure = { initKoin() }
) {
    TaskManagerApp()
}