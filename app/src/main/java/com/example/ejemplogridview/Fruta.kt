package com.example.ejemplogridview

import androidx.annotation.VisibleForTesting

class Fruta(nombre:String,imagen:Int) {
    var nombre:String? = null
    var imagen:Int = 0

    init {
        this.nombre = nombre
        this.imagen = imagen
    }
}