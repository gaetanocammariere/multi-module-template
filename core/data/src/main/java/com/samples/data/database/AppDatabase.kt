package com.samples.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1)
internal abstract class AppDatabase : RoomDatabase()