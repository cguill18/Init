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
import kotlinx.android.synthetic.main.activity_niveau1_4.*
import kotlinx.android.synthetic.main.activity_niveau1_4.editTextTextMultiLine

class Niveau1_4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveau1_4)
        title = "Chapitre 1 : Niveau 4"
    }


    fun openDescription(view: View) {
        val mypopup = AlertDialog.Builder(this)
        mypopup.setTitle("Le type string")
        mypopup.setMessage("Le type string correspond à une chaîne de charactères, en quelque sorte un \"mot\" ou une suite de \"mots\".\n" +
                "Une suite d'un nombre quelconque de charactère quelconque est un string (même un character seul peut être un string, tout dépend du type qu'on lui attribue à la déclaration).\n" +
                "Pour initialiser une chaîne de charactères, on utilise des guillemets, comme \"bonjour\"."+
                "Par exemple, \"bonjour\" est un string, comme \"le ciel est bleu\" ou \"sdnfgusdfgnd f dfgdfghgvdf45 gù$^m;mlsdfg5sg4\" ou encore la chaîne vide \"\"")
        mypopup.setPositiveButton("Ok", { dialog, which -> })
        mypopup.setNegativeButton("Revoir la leçon ?", { dialog, which -> })
        mypopup.show()
    }


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun compile(view: View) {
        val regex = Regex("\".*\"")
        if (regex.matches(editTextTextMultiLine.text)) {
            val mypopup = AlertDialog.Builder(this)
            mypopup.setTitle("Bien Joué ! ")
            mypopup.setMessage("Vous avez entré une chaîne de charactères.")
            mypopup.setPositiveButton("Suivant", { dialog, which ->
                val intent = Intent(this, Niveau1_5::class.java)
                startActivity(intent)
            })
            mypopup.setNegativeButton("Réessayer", { dialog, which ->
                val intent = Intent(this, Niveau1_4::class.java)
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
            mypopup.setMessage("Vous n'avez  pas entré une chaîne de charactères.\nSoujhaitez-vous revoir la leçon ?")
            mypopup.setPositiveButton("Oui", { dialog, which -> })
            mypopup.setNegativeButton("Non", { dialog, which -> })
            mypopup.show()
        }
    }
}