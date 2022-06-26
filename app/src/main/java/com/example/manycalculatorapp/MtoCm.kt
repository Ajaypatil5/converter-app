package com.example.manycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kilogram_to_pounds.*

class MtoCm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mto_cm)
    }
    fun buttooon(view: View) {

        val inputt = editTextTextPersonName.editableText.toString()
        val num = inputt.toInt()

        val solved = num*100

        answerkgtop.setText("$num meters in\n Centimeters is $solved")
    }
}