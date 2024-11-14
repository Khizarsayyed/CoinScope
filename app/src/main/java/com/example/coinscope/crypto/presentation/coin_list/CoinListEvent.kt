package com.example.coinscope.crypto.presentation.coin_list

import com.example.coinscope.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}