package com.example.fragmentcallk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.oguzh.fragment_kotlin.R
import com.oguzh.fragmentcallk.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var acilis = findViewById<Button>(R.id.acilis)
        var bir = findViewById<Button>(R.id.button1)
        var iki = findViewById<Button>(R.id.button2)
        var uc = findViewById<Button>(R.id.button3)

        bir.setOnClickListener {
            fragmantcagir(frbir())
        }
        iki.setOnClickListener {
            fragmantcagir(friki())
        }
        uc.setOnClickListener {
            fragmantcagir(fruc())
        }
        acilis.setOnClickListener {
            fragmantcagir(acilis())
        }
    }
    fun fragmantcagir(fragment : Fragment){
        val fragmentgecis = supportFragmentManager.beginTransaction()
        fragmentgecis.replace(R.id.fragmentContainerView,fragment)
        fragmentgecis.commit()
    }
}