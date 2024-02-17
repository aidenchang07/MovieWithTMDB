package com.adncoding.moviewithtmdb.movieList.domain.repository

import com.adncoding.moviewithtmdb.movieList.domain.model.Movie
import com.adncoding.moviewithtmdb.movieList.util.Resource
import kotlinx.coroutines.flow.Flow

/**
 * Created by AidenChang 2024/02/14
 */
interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}