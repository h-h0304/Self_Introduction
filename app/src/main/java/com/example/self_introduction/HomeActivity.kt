package com.example.self_introduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat
import java.util.Random

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tv_id = findViewById<TextView>(R.id.tv_id)

        if (intent.hasExtra("id")){
            tv_id.text = "아이디 : " + intent.getStringExtra("id")
        }

        val btn_close = findViewById<Button>(R.id.btn_close)
        btn_close.setOnClickListener{
            finish()
        }

        val iv_logo = findViewById<ImageView>(R.id.iv_home_logo)

        val id = when((1..5).random()) {
            1 -> R.drawable._1
            2 -> R.drawable._2
            3 -> R.drawable._3
            4 -> R.drawable._4
            else -> R.drawable._1
        }

        iv_logo.setImageDrawable(ResourcesCompat.getDrawable(resources, id, null))
    }
}