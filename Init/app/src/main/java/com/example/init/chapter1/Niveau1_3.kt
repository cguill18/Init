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
import kotlinx.android.synthetic.main.activity_niveau1_3.*

class Niveau1_3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveau1_3)
        title = "Chapitre 1 : Niveau 3"
    }

    fun openDescription(view: View) {
        val mypopup = AlertDialog.Builder(this)
        mypopup.setTitle("Le type character")
        mypopup.setMessage("Le type character ou char désigne un unique characètre quelconque. Il est initialisé en l'entourant d'apostrophes, sous la forme '_'.")
        mypopup.setPositiveButton("Ok", { dialog, which -> })
        mypopup.setNegativeButton("Revoir la leçon ?", { dialog, which -> })
        mypopup.show()
    }


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun compile(view: View) {
        val regex = Regex("'")
        if (regex.matches(editTextTextMultiLine.text)&&regex.matches(editTextTextMultiLine2.text)) {
            val mypopup = AlertDialog.Builder(this)
            mypopup.setTitle("Bien Joué ! ")
            mypopup.setMessage("Vous avez correctement initialisé un characètre, en l'entourant d'apostrophes.")
            mypopup.setPositiveButton("Suivant", { dialog, which ->
                val intent = Intent(this, Niveau1_4::class.java)
                startActivity(intent)
            })
            mypopup.setNegativeButton("Réessayer", { dialog, which ->
                val intent = Intent(this, Niveau1_3::class.java)
                startActivity(intent)
            })
            mypopup.setNeutralButton("Chapitre", { dialog, which ->
                val intent = Intent(this, Chapter1activity::class.java)
                startActivity(intent)
            })
            mypopup.show()
        } else {
            editTextTextMultiLine.background.setTint(Color.RED)
            val mypopup = AlertDialog.Builder(this)
            mypopup.setTitle("Dommage")
            mypopup.setMessage("Vous n'avez pas entré les bons signes pour initialiser un charactère.\nSoujhaitez-vous revoir la leçon ?")
            mypopup.setPositiveButton("Oui", { dialog, which -> })
            mypopup.setNegativeButton("Non", { dialog, which -> })
            mypopup.show()
        }
    }
}