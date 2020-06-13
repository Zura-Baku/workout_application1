package com.example.workout_application1

import android.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimeryKey


@Entity
data class User(
    val title: String,
    val User: String
){
    @PrimaryKey(autoGenerate = true)
    var id : Int = 0
}
@ColumnInfo(name = "first_name") val firstName: String?,
@ColumnInfo(name = "last_name") val lastName: String?