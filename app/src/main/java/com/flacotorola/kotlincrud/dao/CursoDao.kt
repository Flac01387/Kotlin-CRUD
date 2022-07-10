package com.flacotorola.kotlincrud.dao

import androidx.room.*
import com.flacotorola.kotlincrud.model.Curso

@Dao
interface CursoDao {

    @Query("SELECT * FROM Curso")
    fun getAll(): List<Curso>

    @Query("SELECT * FROM Curso WHERE id= :id")
    fun getById(id: Int): Curso

    @Update
    fun update(curso: Curso)

    @Insert
    fun insert(curso: List<Curso>)

    @Delete
    fun delete(curso: Curso)
}