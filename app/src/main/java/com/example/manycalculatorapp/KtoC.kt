package com.example.manycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kilogram_to_pounds.*

class KtoC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kto_c)
    }
    fun buttooon(view: View) {

        val inputt = editTextTextPersonName.editableText.toString()
        val num = inputt.toInt()

        val solved = num-273

        answerkgtop.setText("$num Kelvin in\n Celcius is $solved")
    }
}