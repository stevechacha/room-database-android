package com.steve.roomdatabaseandroid.relation

import androidx.room.Entity

@Entity(primaryKeys = ["studentName","subjectName"])
data class StudentSubjectCrossRef(
    val studentName:String,
    val SubjectName:String
)
