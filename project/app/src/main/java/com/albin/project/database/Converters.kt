package com.albin.project.database

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream

class Converters {

    // Convert bitmap to a bytearray then save in database
    @TypeConverter
    fun fromBitmap(btmp: Bitmap): ByteArray {
        val out = ByteArrayOutputStream()
        btmp.compress(Bitmap.CompressFormat.PNG, 100, out)
        return out.toByteArray()
    }

    // Grab from database, convert from bytearray to bitmap
    @TypeConverter
    fun toBitmap(byteArr: ByteArray): Bitmap {
        return BitmapFactory.decodeByteArray(byteArr, 0, byteArr.size)
    }
}