package com.example.gideonfingerprint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var logoutBtn: Button = findViewById(R.id.back)


            logoutBtn.setOnClickListener {
                val intent = Intent(this, SigninPage::class.java)
                startActivity(intent)
                finish()
            }
        }



    }

