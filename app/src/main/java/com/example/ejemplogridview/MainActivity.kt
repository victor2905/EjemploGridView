package com.example.ejemplogridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas = ArrayList<Fruta>()

        /*frutas.add("Manzana")
        frutas.add("Plátano")
        frutas.add("Sandía")
        frutas.add("Durazno")*/

        frutas.add(Fruta("Manzana",R.drawable.manzana))
        frutas.add(Fruta("Durazno",R.drawable.durazno))
        frutas.add(Fruta("Plátano",R.drawable.platano))
        frutas.add(Fruta("Sandia",R.drawable.sandia))

        var grid:GridView = findViewById(R.id.grid)
        //val adaptador = ArrayAdapter<String>( this,android.R.layout.simple_list_item_1,frutas)

        val adaptador = AdapterCustom(this,frutas)
        grid.adapter = adaptador

        grid.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this,frutas.get(position).imagen,Toast.LENGTH_LONG).show()
        }
    }
}