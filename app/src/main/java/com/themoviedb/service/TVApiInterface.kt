package com.themoviedb.service

import com.themoviedb.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET


interface TVApiInterface {
    @GET("/3/tv/popular?api_key=4e8c3457ace2ed3fe7e74102a020f711")
    fun getTVList() : Call<TVResponse>
}