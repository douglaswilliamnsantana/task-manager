package com.douglassantana.task_manager

import android.app.Application
import com.douglassantana.task_manager.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.component.KoinComponent

class TaskManagerApplication : Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidLogger()
            androidContext(this@TaskManagerApplication)
        }
    }
}