package com.dicoding.tugasakhirvalorant.database

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface FavDao {
    @Insert
     fun addFavorite(favUser: FavUser)

    @Query("SELECT * FROM  fav_user")
    fun getFavorites(): List<FavUser>

    @Update
    fun updateFavorite(favUser: FavUser)

    @Delete
    fun deleteFavorite(favUser: FavUser)

}