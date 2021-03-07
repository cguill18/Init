package com.example.init

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupWindow
import androidx.appcompat.app.AlertDialog

class Niveau1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveau1)
    }

    fun openDescription(view: View){
        /*val mypopup = AlertDialog.Builder(this)
        mypopup.setTitle("Description de Avancer")
        mypopup.setMessage("vous devez faire une fonction qui fait avancer votre personnage du nombre de pas indiqué")
        mypopup.setPositiveButton("ok",DialogInterface.OnClickListener {dialog, id -> })
        mypopup.setNegativeButton("non",DialogInterface.OnClickListener {dialog, id -> })
        mypopup.show()*/
        //cette fonction marche pas, elle doit normalement ouvrir une fenetre popup 
    }

}