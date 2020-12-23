package com.steve.roomdatabaseandroid.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student(
    @PrimaryKey(autoGenerate = false)
    val studentName:String,
    val semister:Int,
    val schoolName:String
)
