package com.flacotorola.kotlincrud.data

import android.app.Application
import androidx.room.Room

class CursoApp: Application() {
    val room= Room.databaseBuilder(this,CursoDB::class.java,"cursos")
            .build()
}