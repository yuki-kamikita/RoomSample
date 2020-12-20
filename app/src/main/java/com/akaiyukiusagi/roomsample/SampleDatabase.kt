package com.akaiyukiusagi.roomsample

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [SampleEntity::class], version = 1)
abstract class SampleDatabase : RoomDatabase() {
    abstract fun sampleDao(): SampleDao

    companion object {
        fun buildDatabase(context: Context): SampleDatabase {
            return Room.databaseBuilder(
                    context,
                    SampleDatabase::class.java, "database-name"
            ).build()
        }
    }

}

