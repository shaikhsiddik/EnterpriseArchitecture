package com.example.domain.di

import com.example.domain.usecase.LoginUseCase
import com.example.domain.usecase.RegisterUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory { LoginUseCase(get()) }
    factory { RegisterUseCase(get()) }
}