package com.example.crypto.repository

import com.example.crypto.api.cryptoApi
import com.example.crypto.model1.USD

interface CryptoRepository {
    suspend fun getCryptoData(): USD

}
class CryptoRepositoryImpl(
    private val cryptoApi: cryptoApi
): CryptoRepository {
    override suspend fun getCryptoData(): USD {
        return cryptoApi.getCryptoData()
    }
}