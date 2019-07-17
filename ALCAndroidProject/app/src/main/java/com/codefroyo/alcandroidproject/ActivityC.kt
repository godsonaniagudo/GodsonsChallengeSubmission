package com.codefroyo.alcandroidproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)


        supportActionBar!!.title = "My Profile"
    }
}
