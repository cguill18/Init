package com.example.init.chapter1

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import com.example.init.R
import kotlinx.android.synthetic.main.activity_niveau1_1.*

class Niveau1_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveau1_1)
        title = "Chapitre 1 : Niveau 1"
    }

    fun openDescription(view: View) {
        val mypopup = AlertDialog.Builder(this)
        mypopup.setTitle("Le type integer")
        mypopup.setMessage("Le type integer ou int désigne les nombres entiers tel que 1, 2, 32 ou 650.")
        mypopup.setPositiveButton("Ok", { dialog, which ->})
        mypopup.setNegativeButton("Revoir la leçon ?", { dialog, which -> })
        mypopup.show()
    }


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun compile(view : View){
        val regex = Regex("int")
        if (regex.matches(editTextTextMultiLine.text)) {
            val mypopup = AlertDialog.Builder(this)
            mypopup.setTitle("Bien Joué ! ")
            mypopup.setMessage("Vous avez entré le bon type.")
            mypopup.setPositiveButton("Suivant", { dialog, which ->
                val intent = Intent(this, Niveau1_2::class.java)
                startActivity(intent)
            })
            mypopup.setNegativeButton("Réessayer", { dialog, which ->
                val intent = Intent(this, Niveau1_1::class.java)
                startActivity(intent)
            })
            mypopup.setNeutralButton("Chapitre", { dialog, which ->
                val intent = Intent(this, Chapter1activity::class.java)
                startActivity(intent)
            })
            mypopup.show()
        }
        else{
            editTextTextMultiLine.background.setTint(Color.RED)
            val mypopup = AlertDialog.Builder(this)
            mypopup.setTitle("Dommage")
            mypopup.setMessage("Vous n'avez  pas entré un entier.\nSoujhaitez-vous revoir la leçon ?")
            mypopup.setPositiveButton("Oui", { dialog, which ->  })
            mypopup.setNegativeButton("Non", { dialog, which ->  })
            mypopup.show()
        }

    }
}