package com.example.tic_tac_toe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_entergame.setOnClickListener {
            val intent = Intent(this,gamepage::class.java)
            startActivity(intent)

        }

        btn_with_player.setOnClickListener {
            val intent = Intent(this,gamepage2::class.java)
            startActivity(intent)
        }
    }
}