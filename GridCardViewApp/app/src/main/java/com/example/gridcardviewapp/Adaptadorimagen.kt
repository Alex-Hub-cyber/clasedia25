package com.example.gridcardviewapp

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.view.contentcapture.ContentCaptureContext
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

    class Adaptadorimagen(
    var imagenLista:ArrayList<IngItems>,
    var context:Context
) :BaseAdapter(){
    override fun getCount(): Int {
        return imagenLista.size
    }

    override fun getItem(position: Int): Any {
        return imagenLista[position]
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var vista=convertView
            if (vista==null){
                vista=LayoutInflater.from(context).inflate(R.layout.fila_item,parent, false)
            }
            var imagenVista:ImageView=vista!!.findViewById(R.id.ivImagen)
            var tvNombre:TextView=vista!!.findViewById(R.id.tvNombre)
            var tvDepartamento:TextView=vista!!.findViewById(R.id.tvDepartamento)

            val ingIdentificador = imagenLista[position]
            imagenVista.setImageResource(ingIdentificador.imagen)
            tvNombre.text=ingIdentificador.nombre
            tvDepartamento.text=ingIdentificador.departamento
            return vista
        }


}

