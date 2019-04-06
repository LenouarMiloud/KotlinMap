package com.societe.anonyme.mapkotlin

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit = findViewById<EditText>(R.id.edText)as EditText
        val btn =  findViewById<Button>(R.id.btnSearch)as Button

        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("geo:0,0?q="+edit.text.toString()))
            val intent2 = Intent.createChooser(intent,"Launch Maps")
            startActivity(intent2)
        }


    }
}
