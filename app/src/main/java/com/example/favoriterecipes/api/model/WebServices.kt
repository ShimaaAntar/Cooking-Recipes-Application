package com.example.favoriterecipes.api.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WebServices {
    @GET("random")
    fun getRecipeInformation(@Query("apiKey") key:String,
                             @Query("tags") tags:String,
                             @Query("number") num:Int): Call<RandomsResponse>
}