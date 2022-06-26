package com.example.manycalculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun kgToPounds(view: View) {
        val intent = Intent(this,kilogramToPounds::class.java)
        startActivity(intent)
    }
    fun fToC(view: View) {
        val intent = Intent(this,FtoC::class.java)
        startActivity(intent)
    }
    fun kToC(view: View) {
        val intent = Intent(this,KtoC::class.java)
        startActivity(intent)
    }
    fun kmToM(view: View) {
        val intent = Intent(this,Kmtom::class.java)
        startActivity(intent)
    }
    fun mToCM(view: View) {
        val intent = Intent(this,MtoCm::class.java)
        startActivity(intent)
    }
    fun cmToMM(view: View) {
        val intent = Intent(this,Cmtomm::class.java)
        startActivity(intent)
    }


}