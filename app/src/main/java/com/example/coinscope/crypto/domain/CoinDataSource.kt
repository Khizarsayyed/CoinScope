package com.example.coinscope.crypto.domain


import androidx.compose.runtime.Composable
import com.example.coinscope.core.domain.util.NetworkError
import com.example.coinscope.core.domain.util.Result
import java.time.ZonedDateTime

interface CoinDataSource {
    suspend fun getCoins(): com.example.coinscope.core.domain.util.Result<List<Coin>, NetworkError>
    suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>, NetworkError>
}