package com.example.manycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kilogram_to_pounds.*
import kotlinx.android.synthetic.main.activity_kilogram_to_pounds.view.*

class kilogramToPounds : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kilogram_to_pounds)
    }

    fun buttooon(view: View) {

        val inputt = editTextTextPersonName.editableText.toString()
        val num = inputt.toInt()

        val solved = num*2.2

        answerkgtop.setText("$num kg in\n pounds is $solved")
    }
}