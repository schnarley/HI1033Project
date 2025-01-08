package com.albin.project.hiltshit

import android.content.Context
import androidx.room.Room
import com.albin.project.database.RunDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// Tell dagger this module lives as long as application, destroyed once app is destroyed
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun getRunDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        RunDatabase::class.java,
        "run_db"
    ).build()

    @Provides
    @Singleton
    fun getRunDao(rundb: RunDatabase) = rundb.getDao()
}