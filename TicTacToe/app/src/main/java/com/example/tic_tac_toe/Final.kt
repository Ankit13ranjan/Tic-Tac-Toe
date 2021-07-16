package com.example.tic_tac_toe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class Final : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val win = intent.getStringExtra("WON")

        when (win) {
            "TIE" -> tv_win.text = "GAME TIE"
            "YOU" -> tv_win.text = "\t Congratulations!!! \n YOU WIN THE GAME"
            else -> tv_win.text = "COMPUTER WIN THE GAME !!!"
        }

        btn_finish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}