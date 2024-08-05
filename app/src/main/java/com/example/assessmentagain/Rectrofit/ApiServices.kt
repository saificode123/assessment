package com.example.assessmentagain.Rectrofit

import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {

    @GET("v2/everything")
    suspend fun getData(): Response<ApiDataClass>
}