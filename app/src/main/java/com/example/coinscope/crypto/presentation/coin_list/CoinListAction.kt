package com.example.coinscope.crypto.presentation.coin_list

import com.example.coinscope.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}