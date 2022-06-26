package com.example.manycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kilogram_to_pounds.*

class Cmtomm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cmtomm)
    }
    fun buttooon(view: View) {

        val inputt = editTextTextPersonName.editableText.toString()
        val num = inputt.toInt()

        val solved = num*10

        answerkgtop.setText("$num cm in\n mms is $solved")
    }
}