package com.dicoding.tugasakhirvalorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val actionbar = supportActionBar
        actionbar!!.title = "Profile"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
