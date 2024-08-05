package com.example.assessmentagain.Rectrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RectrofitHelper {

    val base_url="https://newsapi.org/"
    fun getinstance(): Retrofit {
        return Retrofit.Builder().baseUrl(base_url).addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}