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
import com.example.init.chapter2.Chapter2activity
import kotlinx.android.synthetic.main.activity_niveau1_4.*
import kotlinx.android.synthetic.main.activity_niveau1_5.*
import kotlinx.android.synthetic.main.activity_niveau1_5.editTextTextMultiLine

class Niveau1_5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveau1_5)
        title = "Chapitre 1 : Niveau 5"
    }

    //TODO:fichier kt bool et layout 3-4-5
    fun openDescription(view: View) {
        val mypopup = AlertDialog.Builder(this)
        mypopup.setTitle("Le type bool")
        mypopup.setMessage("Le type bool correspond aux valeurs booléennes. Il n'y en a que 2 : true ou false. En particulier, le résultat d'une comparaison est un booléen." +
                "Nous y reviendrons peu après.")
        mypopup.setPositiveButton("Ok", { setdialog, which -> })
        mypopup.setNegativeButton("Revoir la leçon ?", { dialog, which -> })
        mypopup.show()
    }


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun compile(view: View) {
        val regex = Regex("(bool)")
        if (regex.matches(editTextTextMultiLine.text)) {
            val mypopup = AlertDialog.Builder(this)
            mypopup.setTitle("Bien Joué ! ")
            mypopup.setMessage("Vous avez correctement initialisé un booléen.")
            mypopup.setPositiveButton("Suivant", { dialog, which ->
                val intent = Intent(this, Chapter2activity::class.java)
                startActivity(intent)
            })
            mypopup.setNegativeButton("Réessayer", { dialog, which ->
                val intent = Intent(this, Niveau1_5::class.java)
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
            mypopup.setMessage("Le booléen n'est pas déclaré correctement.\nSoujhaitez-vous revoir la leçon ?")
            mypopup.setPositiveButton("Oui", { dialog, which -> })
            mypopup.setNegativeButton("Non", { dialog, which -> })
            mypopup.show()
        }
    }
}