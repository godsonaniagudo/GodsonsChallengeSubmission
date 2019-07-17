package com.codefroyo.alcandroidproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.title = "ALC 4 Phase 1"

        about_alc_button.setOnClickListener {
            val intent = Intent(this,ActivityB::class.java)
            startActivity(intent)
        }

        myProfile_button.setOnClickListener {
            val intent = Intent(this,ActivityC::class.java)
            startActivity(intent)
        }
    }
}
