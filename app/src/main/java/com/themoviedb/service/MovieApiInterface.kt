package com.themoviedb.service

import com.themoviedb.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=4e8c3457ace2ed3fe7e74102a020f711")
    fun getMovieList() : Call<MovieResponse>
}