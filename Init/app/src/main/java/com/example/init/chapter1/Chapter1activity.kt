package com.example.init.chapter1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.init.R

class Chapter1activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter1activity)
        title = "Chapitre 1 : Les types"
    }

    fun openNiveau1(view: View) {
        val intent = Intent(this, Niveau1_1::class.java)
        startActivity(intent)
    }

    fun openNiveau2(view: View) {
        val intent = Intent(this, Niveau1_2::class.java)
        startActivity(intent)
    }
    fun openNiveau3(view: View) {
        val intent = Intent(this, Niveau1_3::class.java)
        startActivity(intent)
    }
    fun openNiveau4(view: View) {
        val intent = Intent(this, Niveau1_4::class.java)
        startActivity(intent)
    }
    fun openNiveau5(view: View) {
        val intent = Intent(this, Niveau1_5::class.java)
        startActivity(intent)
    }

}