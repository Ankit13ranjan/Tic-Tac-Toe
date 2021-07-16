package com.example.tic_tac_toe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gamepage2.*

class gamepage2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gamepage2)


        var chance = "X"
        var board = arrayListOf<String>("","","","","","","","","")


        btn0.setOnClickListener {
            if(board[0]=="")
            {
                board[0]=chance
                btn0.text=chance
                if(chance=="X")
                {
                    chance="O"
                }
                else
                {
                    chance = "X"
                }
            }
            result(board)
        }

        btn1.setOnClickListener {
            if(board[1]=="")
            {
                board[1]=chance
                btn1.text=chance
                if(chance=="X")
                {
                    chance="O"
                }
                else
                {
                    chance = "X"
                }
            }
            result(board)
        }

        btn2.setOnClickListener {
            if(board[2]=="")
            {
                board[2]=chance
                btn2.text=chance
                if(chance=="X")
                {
                    chance="O"
                }
                else
                {
                    chance = "X"
                }
            }
            result(board)
        }

        btn3.setOnClickListener {
            if(board[3]=="")
            {
                board[3]=chance
                btn3.text=chance
                if(chance=="X")
                {
                    chance="O"
                }
                else
                {
                    chance = "X"
                }
            }
            result(board)
        }

        btn4.setOnClickListener {
            if(board[4]=="")
            {
                board[4]=chance
                btn4.text=chance
                if(chance=="X")
                {
                    chance="O"
                }
                else
                {
                    chance = "X"
                }
            }
            result(board)
        }

        btn5.setOnClickListener {
            if(board[5]=="")
            {
                board[5]=chance
                btn5.text=chance
                if(chance=="X")
                {
                    chance="O"
                }
                else
                {
                    chance = "X"
                }
            }
            result(board)
        }

        btn6.setOnClickListener {
            if(board[6]=="")
            {
                board[6]=chance
                btn6.text=chance
                if(chance=="X")
                {
                    chance="O"
                }
                else
                {
                    chance = "X"
                }
            }
            result(board)
        }

        btn7.setOnClickListener {
            if(board[7]=="")
            {
                board[7]=chance
                btn7.text=chance
                if(chance=="X")
                {
                    chance="O"
                }
                else
                {
                    chance = "X"
                }
            }
            result(board)
        }

        btn8.setOnClickListener {
            if(board[8]=="")
            {
                board[8]=chance
                btn8.text=chance
                if(chance=="X")
                {
                    chance="O"
                }
                else
                {
                    chance = "X"
                }
            }
            result(board)
        }
    }

    fun winner(board: ArrayList<String>, letr : String) : Boolean
    {
        return ((board[0] == letr && board[1] == letr && board[2] == letr)||

                (board[3] == letr && board[4] == letr && board[5] == letr)||
                (board[6] == letr && board[7] == letr && board[8] == letr)||

                (board[0] == letr && board[3] == letr && board[6] == letr)||

                (board[1] == letr && board[4] == letr && board[7] == letr) ||

                (board[2] == letr && board[5] == letr && board[8] == letr)||

                (board[0] == letr && board[4] == letr && board[8] == letr)||

                (board[2] == letr && board[4] == letr && board[6] == letr))
    }


    fun isBoardFull(board: ArrayList<String>):Boolean
    {
        for(i in 1..9)
        {
            if(board[i]=="")
                return false
        }
        return  true
    }

    fun result(board : ArrayList<String>)
    {
        if(winner(board,"X"))
        {
            startActivity(Intent(this,Final2::class.java).putExtra("players","Player 1"))
        }
        else if(winner(board,"O"))
        {
            startActivity(Intent(this,Final2::class.java).putExtra("players","Player 2"))
        }
        else if(isBoardFull(board))
        {
            startActivity(Intent(this,Final2::class.java).putExtra("players","DRAW"))
        }
    }
}