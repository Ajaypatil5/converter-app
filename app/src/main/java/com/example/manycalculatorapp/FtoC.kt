package com.example.manycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kilogram_to_pounds.*

class FtoC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fto_c)
    }
    fun buttooon(view: View) {

        val inputt = editTextTextPersonName.editableText.toString()
        val num = inputt.toInt()

        val solved = ((num-32)*5)/9

        answerkgtop.setText("$num°F in\n Celcius is $solved°")
    }
}