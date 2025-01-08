package com.albin.project.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RunDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM runTable ORDER BY timeT0 DESC")
    fun getRuns_SortDate(): LiveData<List<Run>>

    @Query("SELECT * FROM runTable ORDER BY timeMS DESC")
    fun getRuns_SortTimeMS(): LiveData<List<Run>>

    @Query("SELECT * FROM runTable ORDER BY avgSpeed DESC")
    fun getRuns_SortavgSpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM runTable ORDER BY distance DESC")
    fun getRuns_SortDistance(): LiveData<List<Run>>


}