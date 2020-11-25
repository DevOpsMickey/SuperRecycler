package com.example.superrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.superrecycler.adapter.PaisAdapter
import com.example.superrecycler.modelo.Pais
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var miRecycler:RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miRecycler = findViewById(R.id.myRecycler)
        val listPaises = ArrayList<Pais>()

        listPaises.add(Pais("México", "https://www.tamaulipas.gob.mx/fomentocivico/wp-content/uploads/sites/20/2017/04/bandera-mexico-portavox-e1492461746506.jpg"))
        listPaises.add(Pais("Venezuela", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/1200px-Flag_of_Venezuela.svg.png"))
        listPaises.add(Pais("Perú", "https://upload.wikimedia.org/wikipedia/commons/f/f2/Bandera_peruana_DOS.jpg"))
        listPaises.add(Pais("Estados Unidos", "https://www.lifeder.com/wp-content/uploads/2018/11/bandera-1795-1818.png"))

        miRecycler!!.layoutManager = GridLayoutManager(this,1)
        miRecycler!!.setHasFixedSize(true)
        miRecycler!!.adapter = PaisAdapter(listPaises, this)
    }
}