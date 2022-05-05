package com.example.crypto

import com.example.crypto.api.cryptoApi
import com.example.crypto.repository.CryptoRepositoryImpl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object Instance {
    private const val BASE_URL = "https://pro-api.coinmarketcap.com/v1/"

    fun getCryptoRepository(): CryptoRepositoryImpl {
        val okHttpClient = OkHttpClient.Builder().build()

        val converterFactory = GsonConverterFactory.create()

        val retrofit = Retrofit.Builder().addConverterFactory(converterFactory).baseUrl(BASE_URL).client(okHttpClient).build()

        val cryptoApi = retrofit.create(cryptoApi::class.java)

        return CryptoRepositoryImpl(cryptoApi)

    }
}