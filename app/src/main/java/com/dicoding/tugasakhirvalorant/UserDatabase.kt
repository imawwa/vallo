package com.dicoding.tugasakhirvalorant

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext

@Database(
    entities = [FavUser::class],
    version = 1
)
abstract class UserDatabase: RoomDatabase() {
    companion object {
        var INSTANCE : UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase? {
            if (INSTANCE == null) {
                synchronized(UserDatabase::class.java)
                    INSTANCE = Room.databaseBuilder(context.applicationContext, UserDatabase::class.java, "user_database").build()

                }
            return INSTANCE as UserDatabase
        }
    }
abstract fun favDao(): FavDao
}