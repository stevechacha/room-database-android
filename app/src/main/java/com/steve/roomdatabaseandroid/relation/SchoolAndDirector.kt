package com.steve.roomdatabaseandroid.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.steve.roomdatabaseandroid.entities.Director
import com.steve.roomdatabaseandroid.entities.School

data class SchoolAndDirector (
  @Embedded  val school: School,
  @Relation(
      parentColumn = "schoolName",
      entityColumn = "schoolName"
  )
  val director: Director
        )