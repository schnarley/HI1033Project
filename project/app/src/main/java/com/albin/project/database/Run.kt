package com.albin.project.database

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "runTable")
data class Run (
    var img: Bitmap? = null,
    var timeT0: Long = 0L,
    var avgSpeed: Float = 0f,
    var distance: Int = 0,
    var timeMS: Long = 0L
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}