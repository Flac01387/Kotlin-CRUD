package com.flacotorola.kotlincrud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class NuevoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevo)
    }

    fun guardar() {
        //Toast.makeText(this,"Click en guardar", Toast.LENGTH_SHORT).show()
    }
}