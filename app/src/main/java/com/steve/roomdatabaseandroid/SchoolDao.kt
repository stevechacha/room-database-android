package com.steve.roomdatabaseandroid

import androidx.room.*
import com.steve.roomdatabaseandroid.entities.Director
import com.steve.roomdatabaseandroid.entities.School
import com.steve.roomdatabaseandroid.entities.Student
import com.steve.roomdatabaseandroid.entities.Subject
import com.steve.roomdatabaseandroid.relation.*

@Dao

interface SchoolDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: Subject)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudentSubjectCrossRef(crossRef: StudentSubjectCrossRef)

    @Transaction
    @Query( "SELECT*FROM school WHERE schoolName=schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(schoolName: String):List<SchoolAndDirector>

    @Transaction
    @Query("SELECT*FROM school WHERE schoolName=schoolName")
    suspend fun getSchoolWithStudent(schoolName: String):List<SchoolWithStudent>

    @Transaction
    @Query("SELECT*FROM subject WHERE subjectName=subjectName")
    suspend fun getStudentOfSubject(subjectName: String):List<SubjectWithStudents>

    @Transaction
    @Query("SELECT*FROM student WHERE studentName=studentName")
    suspend fun getSubjecttOfStudent(studentName: String):List<StudentWithSubjects>
}