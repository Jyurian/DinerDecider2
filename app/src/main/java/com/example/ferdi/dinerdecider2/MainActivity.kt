package com.example.ferdi.dinerdecider2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTxt.text="this is my first app"

        decideBtn.setOnClickListener(){
            helloTxt.text = editTxt.text
        }

    }
}
