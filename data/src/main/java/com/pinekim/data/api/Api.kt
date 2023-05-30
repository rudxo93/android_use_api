package com.pinekim.data.api

import com.pinekim.data.model.CurrentPriceModel
import retrofit2.http.GET

interface Api {

    @GET("public/ticker/ALL_KRW")
    suspend fun getCurrentCoinList(): CurrentPriceModel

}