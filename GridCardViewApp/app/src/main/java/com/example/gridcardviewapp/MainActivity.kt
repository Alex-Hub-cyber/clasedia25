package com.example.gridcardviewapp

import android.content.Intent
import android.icu.text.Transliterator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.view.WindowId
import android.widget.AdapterView
import android.widget.GridView
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {
    private lateinit var gtTabla:GridView

    var nombre = arrayListOf<String>("Kemberly","Nelson","Cristina","William")
    var departamento= arrayListOf<String>("San Vicente", "San Salvdor","Chalatenango","Santa Ana")
    var imagenes= arrayListOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,

    )
    var myimagesLista= arrayListOf(
        IngItems(imagenes.get(0), nombre.get(0),departamento.get(0)),
        IngItems(imagenes.get(1), nombre.get(1),departamento.get(1)),
        IngItems(imagenes.get(2), nombre.get(2),departamento.get(2)),
        IngItems(imagenes.get(3), nombre.get(3),departamento.get(3))



    )

    var ImagenLista= ArrayList<IngItems>()
    var adaptador:Adaptadorimagen?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (imagen in myimagesLista){
            ImagenLista
        }
        gtTabla= findViewById(R.id.gtTabla)
        adaptador=Adaptadorimagen(myimagesLista, this)
        gtTabla.onItemClickListener=object :AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                    View: View?,
                position: Int,
                id: Long) {

            }
        }
        var ventana :Intent = Intent(applicationContext,Detalles::class.java)
      //  ventana.putExtra("Imagen",imagenes.get(position)
        //ventana.putExtra()



    }
}