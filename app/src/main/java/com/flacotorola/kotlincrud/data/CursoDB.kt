package com.flacotorola.kotlincrud.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.flacotorola.kotlincrud.dao.CursoDao
import com.flacotorola.kotlincrud.model.Curso

@Database(
    entities = [Curso::class],
    version = 1
)
abstract class CursoDB : RoomDatabase(){
    abstract fun cursoDao():CursoDao
}