package com.example.superheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detalle_hero.*

class DetalleHeroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_hero)

        var name =intent.extras?.getString("nombre")
        var foto = intent.extras?.getString("foto")

        detalletvName.text = name
        Picasso.get().load(foto).into(imgDetalleHero)
    }
}