package com.dicoding.tugasakhirvalorant

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface FavDao {
    @Insert
    fun addToFavorite(favUser: FavUser)

    @Query("SELECT * FROM  fav_user")
    fun getFavUser(): LiveData<List<FavUser>>

    @Query("SELECT count(*) FROM fav_user WHERE fav_user.agentname= :id")
        fun checkUser(id: Int): Int


            @Query("DELETE FROM FAV_USER WHERE fav_user.agentname= :id")
            fun removeFromFavorite (id: Int): Int

}