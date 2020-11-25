package com.example.superrecycler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.superrecycler.R
import com.example.superrecycler.modelo.Pais
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.pais_item.view.*

class PaisAdapter(paises:ArrayList<Pais>, context:Context): RecyclerView.Adapter<PaisAdapter.ViewHolder>(){

    var paises:ArrayList<Pais>? = null
    var context:Context? = null

    init {
        this.paises = paises
        this.context = context
    }

    class ViewHolder(vista:View): RecyclerView.ViewHolder(vista){
        var imagenFondo:ImageView? = null
        var tvNombre:TextView? = null

        init {
            imagenFondo = vista.findViewById(R.id.imgFondo)
            tvNombre = vista.findViewById(R.id.tvPais)
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vistaPais:View = LayoutInflater
            .from(context)
            .inflate(R.layout.pais_item,parent,false)
        val paisViewHolder = ViewHolder(vistaPais)
        vistaPais.tag = paisViewHolder
        return paisViewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pais = paises!![position]
        holder.tvNombre!!.text = paises!![position].nombre
        Picasso.get().load(pais.url)
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.imagenFondo)

    }

    override fun getItemCount(): Int {
        return this.paises!!.count()
    }

}