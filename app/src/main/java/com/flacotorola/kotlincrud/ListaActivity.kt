package com.flacotorola.kotlincrud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
    }

    fun nuevo(view: View) {
        val intent = Intent(this, NuevoActivity::class.java)
        startActivity(intent)
    }
}