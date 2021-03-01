package com.example.superheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val superheroes = listOf<SuperHeroe>(

        SuperHeroe("Spiderman","Peter Parker","Marvel","https://i.pinimg.com/originals/74/70/b3/7470b34f5ec641f667c2f162a594493d.png"),
        SuperHeroe("Wonder Woman","Desconocido","DC","https://i.pinimg.com/474x/30/fc/f6/30fcf613d9240fede6a7693b1160db5b--chibi-characters-wonder-women.jpg"),
        SuperHeroe("Capitan America","Steven sanders","Marvel","https://i.pinimg.com/originals/7e/3f/08/7e3f08a3af553566fb2d3017eb56a0e6.jpg"),
        SuperHeroe("Ironman","Tony Stark","Marvel","https://i.pinimg.com/564x/5b/b3/8b/5bb38b1e641569ccbe12263ec6d2f4d0.jpg"),
        SuperHeroe("Batman","Bruno Diaz","Marvel","https://i.pinimg.com/originals/56/41/d8/5641d8d94d67d6f9a1616cada1a9365a.jpg"),
        SuperHeroe("Flash","Desconocido","Marvel","https://i.pinimg.com/originals/98/14/c7/9814c7a66ef3f71d906a92c7ce144776.jpg"),
        SuperHeroe("DR.Strange","Desconocido","Marvel","https://i.pinimg.com/474x/b8/5c/52/b85c52221fcb648e1923121f0c70282f.jpg"),
        SuperHeroe("Hulk","Desconocido","Marvel","https://i.pinimg.com/originals/8a/1f/67/8a1f6784e10ec47e82a418410034813e.jpg"),
        SuperHeroe("Vision","DEsconocido","Marvel","https://i.pinimg.com/564x/61/43/5b/61435bdcbaaf262e7f15658249b8081f.jpg"),
        SuperHeroe("Spiderman","Peter Parker","Marvel","https://i.pinimg.com/originals/74/70/b3/7470b34f5ec641f667c2f162a594493d.png"),
        SuperHeroe("Wonder Woman","Desconocido","DC","https://i.pinimg.com/474x/30/fc/f6/30fcf613d9240fede6a7693b1160db5b--chibi-characters-wonder-women.jpg"),
        SuperHeroe("Capitan America","Steven sanders","Marvel","https://i.pinimg.com/originals/7e/3f/08/7e3f08a3af553566fb2d3017eb56a0e6.jpg"),
        SuperHeroe("Ironman","Tony Stark","Marvel","https://i.pinimg.com/564x/5b/b3/8b/5bb38b1e641569ccbe12263ec6d2f4d0.jpg"),
        SuperHeroe("Batman","Bruno Diaz","Marvel","https://i.pinimg.com/originals/56/41/d8/5641d8d94d67d6f9a1616cada1a9365a.jpg"),
        SuperHeroe("Flash","Desconocido","Marvel","https://i.pinimg.com/originals/98/14/c7/9814c7a66ef3f71d906a92c7ce144776.jpg"),
        SuperHeroe("DR.Strange","Desconocido","Marvel","https://i.pinimg.com/474x/b8/5c/52/b85c52221fcb648e1923121f0c70282f.jpg"),
        SuperHeroe("Hulk","Desconocido","Marvel","https://i.pinimg.com/originals/8a/1f/67/8a1f6784e10ec47e82a418410034813e.jpg"),
        SuperHeroe("Deadpool","Desconocido","Marvel","https://i.pinimg.com/originals/e5/ba/fa/e5bafa3f07df537da35194d3a43871bd.jpg"),
        SuperHeroe("Back Panter","Desconocido","Marvel","https://i.pinimg.com/originals/c6/10/d3/c610d39a6daa09a9e85b76511d67c11a.jpg")




    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()

    }

    fun initRecycler(){
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val adapter = HeroAdapter(superheroes)
        rvHeroes.adapter = adapter

    }
}