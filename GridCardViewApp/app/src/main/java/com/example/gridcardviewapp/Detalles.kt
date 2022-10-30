package com.example.gridcardviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detalles : AppCompatActivity() {
    lateinit var  ivIngFoto :ImageView
    lateinit var tvNombre:TextView
    lateinit var tvDepartaento:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)
        ivIngFoto = findViewById(R.id.ivImagen)
        tvNombre = findViewById(R.id.tvNombre)
        tvDepartaento= findViewById(R.id.tvDepartamento)

        val bundle:Bundle= getIntent().getExtras()!!

        //ivIngFoto.setImageResource((bundle.getInt("imagen"))


    }
}