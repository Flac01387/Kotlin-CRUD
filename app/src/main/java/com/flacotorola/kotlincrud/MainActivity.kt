package com.flacotorola.kotlincrud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Esperar 3 segundos
        Handler(Looper.getMainLooper()).postDelayed({
            //Cambiar de esta pantalla a ListaActivity
            val intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
            //Finalizar esta pantalla
            finish()
        }, 3000)
    }
}