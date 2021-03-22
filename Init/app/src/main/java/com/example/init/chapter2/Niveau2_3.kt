package com.example.init.chapter2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.init.R
import kotlinx.android.synthetic.main.activity_niveau1_1.*

class Niveau2_3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveau1_1)
    }

    fun openDescription(view: View) {
        val mypopup = AlertDialog.Builder(this)
        mypopup.setTitle("Description de Avancer")
        mypopup.setMessage("vous devez faire une fonction qui fait avancer votre personnage du nombre de pas indiqué")
        mypopup.setPositiveButton("ok", { dialog, which -> Toast.makeText(applicationContext, "ok", Toast.LENGTH_SHORT).show() })
      //  mypopup.setNegativeButton("non", { dialog, which -> Toast.makeText(applicationContext, "non", Toast.LENGTH_SHORT).show() })
        mypopup.show()
        //cette fonction marche pas, elle doit normalement ouvrir une fenetre popup
    }


    //TODO : https://developer.android.com/training/constraint-layout
    // https://blog.soat.fr/2017/01/transformez-vos-layouts-en-constraintlayout-partie-1/

    fun compile(view : View){
        val regex = Regex("[0-9]+")
        if (regex.containsMatchIn(editTextTextMultiLine.text)) {
            val mypopup = AlertDialog.Builder(this)
            mypopup.setTitle("Bien Joué ! ")
            mypopup.setMessage("Vous avez bien entré un entier.")
            mypopup.setPositiveButton("Suivant", { dialog, which ->  })
            mypopup.setNegativeButton("Réessayer", { dialog, which -> Toast.makeText(applicationContext, "Réessayer", Toast.LENGTH_SHORT).show() })
            mypopup.setNeutralButton("Menu", { dialog, which -> Toast.makeText(applicationContext, "Menu", Toast.LENGTH_SHORT).show() })
            mypopup.show()
        }
        else{
            editTextTextMultiLine.setTextColor(Color.RED)
            val mypopup = AlertDialog.Builder(this)
            mypopup.setTitle("Dommage")
            mypopup.setMessage("Vous n'avez  pas entré un entier.\nSoujhaitez-vous revoir la leçon ?")
            mypopup.setPositiveButton("Oui", { dialog, which -> Toast.makeText(applicationContext, "Oui", Toast.LENGTH_SHORT).show() })
            mypopup.setNegativeButton("Non", { dialog, which -> Toast.makeText(applicationContext, "Non", Toast.LENGTH_SHORT).show() })
            mypopup.show()
        }

    }
}