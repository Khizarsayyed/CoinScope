package com.example.coinscope.di

import com.example.coinscope.core.data.networking.HttpClientFactory
import com.example.coinscope.crypto.data.networking.RemoteCoinDataSource
import com.example.coinscope.crypto.domain.CoinDataSource
import com.example.coinscope.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}