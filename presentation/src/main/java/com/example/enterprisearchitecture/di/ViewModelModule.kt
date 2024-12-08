package com.example.oshopping.di


import com.example.enterprisearchitecture.ui.feature.account.login.LoginViewModel
import com.example.enterprisearchitecture.ui.feature.account.register.RegisterViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        LoginViewModel(get())
    }

    viewModel {
        RegisterViewModel(get())
    }


}