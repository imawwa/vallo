package com.dicoding.tugasakhirvalorant.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "fav_user")
class FavUser(
    @PrimaryKey
    val agentname:String,
    val fotoagent: Int,
): Serializable