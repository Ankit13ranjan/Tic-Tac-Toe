package com.example.tic_tac_toe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final2.*

class Final2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final2)


        val res : String? = intent.getStringExtra("players")
        when (res) {
            "DRAW" -> {
                players_win.text = "MATCH DRAW!!!"
            }
            "Player 1" -> {
                players_win.text = "$res Win!!!"
            }
            else -> {
                players_win.text = "$res Win!!!"
            }
        }



        btn_finish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }



    }
}