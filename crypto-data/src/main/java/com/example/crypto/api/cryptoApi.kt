package com.example.crypto.api

import com.example.crypto.model1.USD
import retrofit2.http.GET
import retrofit2.http.Headers

interface cryptoApi{
    @Headers("X-CMC_PRO_API_KEY: 48b26b53-8e34-4eca-8208-297f9ee460fb")
    @GET("cryptocurrency/listings/latest")
    suspend fun getCryptoData(): USD

}










