package com.adncoding.moviewithtmdb.movieList.data.remote

import com.adncoding.moviewithtmdb.movieList.data.remote.respond.MovieListDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by AidenChang 2024/02/01
 */
interface MovieApi {

    @GET("movie/{category}")
    suspend fun getMovieList(
        @Path("category") category: String,
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = API_KEY
    ): MovieListDto

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val IMAGE_BASE_URL = "https://api.themoviedb.org/3/movie/"
        const val API_KEY = "6d0b3794f8dbf199d125db45b3769c62"
    }
}