package com.proway.gitrepoapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [], version = 1)
//@Database(entities = [Pokemon::class], version = 1)
abstract class AppDataBase : RoomDatabase() {

    // implementar dao abstract fun gitDAO(): gitDAO //implementacao de uma funcao do dao que é uma interface.

    companion object {
        fun getDatabase(context: Context): AppDataBase {
            return Room.databaseBuilder(
                context.applicationContext,
                AppDataBase::class.java,
                "gitDb_app_db"
            )
                .allowMainThreadQueries()
                .build()
        }
    }
}