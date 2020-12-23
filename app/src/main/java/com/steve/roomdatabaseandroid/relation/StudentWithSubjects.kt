package com.steve.roomdatabaseandroid.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.steve.roomdatabaseandroid.entities.Student
import com.steve.roomdatabaseandroid.entities.Subject

data class StudentWithSubjects(
    @Embedded val student:Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)

    )

    val subjects:List<Subject>
)
