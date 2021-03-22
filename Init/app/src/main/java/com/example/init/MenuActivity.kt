package com.example.init

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.init.chapter1.Chapter1activity
import com.example.init.chapter2.Chapter2activity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun openChapter1(view: View) {
        val intent = Intent(this, Chapter1activity::class.java)
        startActivity(intent)
    }

    fun openChapter2(view: View) {
        val intent = Intent(this, Chapter2activity::class.java)
        startActivity(intent)
    }



}