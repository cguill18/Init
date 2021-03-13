package com.example.init

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class contact : AppCompatActivity() {

    //bouton de retour
    lateinit var retour : Button

    //fonction de base de l'activite
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        //initialise le bouton
    retour = findViewById(R.id.retour)

        //retour dans MainActivity après clic sur le bouton
        retour.setOnClickListener{
            val intentRetour : Intent = Intent(this, MainActivity::class.java)
            startActivity(intentRetour)
        }
    }
}

