package com.example.superheroes

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_superhero.view.*

class HeroAdapter(private val superhero: List<SuperHeroe>) :
    RecyclerView.Adapter<HeroAdapter.HeroHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun getItemCount(): Int = superhero.size


    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superhero[position])
    }


    class HeroHolder(var vista: View) : RecyclerView.ViewHolder(vista) {

        fun render(superhero: SuperHeroe) {

            vista.tvRealName.text = superhero.realName
            vista.tvsuperHeroname.text = superhero.superHeroName
            vista.tvPublisher.text = superhero.publisher
            Picasso.get().load(superhero.image).into(vista.imgHero)

            vista.setOnClickListener {
              //  Toast.makeText(vista.context,"Has seleccionado a ${superhero.superHeroName}",Toast.LENGTH_SHORT).show()
                val intent:Intent = Intent(vista.context,DetalleHeroActivity::class.java)
                intent.putExtra("nombre",superhero.superHeroName)
                intent.putExtra("foto",superhero.image)
                vista.context.startActivity(intent)
            }


        }


    }

}