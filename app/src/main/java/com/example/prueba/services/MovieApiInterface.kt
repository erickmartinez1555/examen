package com.example.prueba.services

import com.example.prueba.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=4cdefdf83a19c46f2ef44095f96b5767")
    fun getMovieList(): Call<MovieResponse>
}