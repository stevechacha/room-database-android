package com.steve.roomdatabaseandroid.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.steve.roomdatabaseandroid.entities.Student
import com.steve.roomdatabaseandroid.entities.Subject

data class SubjectWithStudents(

    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)

    )

    val students:List<Student>
)

