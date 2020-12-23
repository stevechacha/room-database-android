package com.steve.roomdatabaseandroid.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.steve.roomdatabaseandroid.entities.School
import com.steve.roomdatabaseandroid.entities.Student


data class SchoolWithStudent (
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students:List<Student>
    )