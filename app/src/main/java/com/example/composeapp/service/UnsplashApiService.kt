package com.example.composeapp.service

import com.example.composeapp.model.UnSplashPhoto
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface UnsplashApiService {

    @GET("/photos/{id}")
    suspend fun getPhoto(
        @Path("id") id : String,
        @Query("client_id") client_id: String
    ): UnSplashPhoto
}
