package com.dicoding.tugasakhirvalorant.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [FavUser::class],
    version = 1
)
abstract class UserDatabase: RoomDatabase() {
    abstract fun favDao () : FavDao
    companion object {
        @Volatile private var instance: UserDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase (context).also{
                instance = it
            }
        }
        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,UserDatabase::class.java,"agentname1234.db").build()

    }

}