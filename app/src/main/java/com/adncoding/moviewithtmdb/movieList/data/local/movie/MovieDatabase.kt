package com.adncoding.moviewithtmdb.movieList.data.local.movie

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by AidenChang 2024/02/14
 */

@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDatabase : RoomDatabase() {
    abstract val movieDao: MovieDao
}