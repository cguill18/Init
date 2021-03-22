package com.example.init.chapter2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.init.R

class Chapter2activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter2activity)
        title = "Chapitre 2 : Les opérateurs"
    }

    fun openNiveau1(view: View) {
        val intent = Intent(this, Niveau2_1::class.java)
        startActivity(intent)
    }

    fun openNiveau2(view: View) {
        val intent = Intent(this, Niveau2_2::class.java)
        startActivity(intent)
    }
    fun openNiveau3(view: View) {
        val intent = Intent(this, Niveau2_3::class.java)
        startActivity(intent)
    }
    fun openNiveau4(view: View) {
        val intent = Intent(this, Niveau2_4::class.java)
        startActivity(intent)
    }
    fun openNiveau5(view: View) {
        val intent = Intent(this, Niveau2_5::class.java)
        startActivity(intent)
    }

}