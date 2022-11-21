package com.example.blindr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun gotoLogin(view: View) {
        startActivity(Intent(this, LoginActivity::class.java))
    }
//
    public fun gotoSignUp(view: View) {
        startActivity(Intent(this, SignUpActivity::class.java))
    }
}
