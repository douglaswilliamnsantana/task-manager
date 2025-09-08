package com.douglassantana.task_manager.di

import com.douglassantana.task_manager.feature.home.ui.HomeViewModel
import com.douglassantana.task_manager.feature.register.ui.RegisterViewModel
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(config: KoinAppDeclaration? = null) =
    startKoin {
        config?.invoke(this)
        modules(
            provideViewModelModules
        )
    }

val provideViewModelModules = module {
    viewModelOf(::HomeViewModel)
    viewModelOf(::RegisterViewModel)
}