package com.flacotorola.kotlincrud.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Curso(
    @PrimaryKey(autoGenerate = true) val uid: Int = 1,
    @ColumnInfo(name= "curso_nombre") val nombre: String?,
    @ColumnInfo(name= "curso_descripcion") val descripcion: String?,
    @ColumnInfo(name= "curso_duracion") val duracion: String?,
)
