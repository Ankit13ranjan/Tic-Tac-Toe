package com.example.tic_tac_toe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gamepage.*
import kotlinx.android.synthetic.main.activity_gamepage.view.*
import java.util.*
import kotlin.collections.ArrayList

class gamepage : AppCompatActivity() {
    var board = arrayListOf<String>("","","","","","","","","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gamepage)



        var chance1 ="X"
        var chance2 ="O"


        btn0.setOnClickListener {
            if(board[0]=="") {
                board[0] = "X"
                btn0.text = "X"
                if(!winner(board,"X") && !isBoardFull()) {
                    val random: Int = computerMove(board)
                    board[random] = chance2
                    displayrandommove(random)

                }
            }
            result(board)
        }

        btn1.setOnClickListener {
            if(board[1]=="") {
                board[1] = "X"
                btn1.text = "X"
                if(!winner(board,"X") && !isBoardFull())
                {
                    val random: Int = computerMove(board)
                    board[random] = chance2
                    displayrandommove(random)

                }
            }
            result(board)
        }

        btn2.setOnClickListener {
            if(board[2]=="") {
                board[2] = "X"
                btn2.text = "X"
                if(!winner(board,"X") && !isBoardFull())
                {
                    val random: Int = computerMove(board)
                    board[random] = chance2
                    displayrandommove(random)

                }
            }
            result(board)
        }

        btn3.setOnClickListener {
            if(board[3]=="") {
                board[3] = "X"
                btn3.text = "X"
                if(!winner(board,"X") && !isBoardFull())
                {
                    val random: Int = computerMove(board)
                    board[random] = chance2
                    displayrandommove(random)

                }
            }
            result(board)
        }

        btn4.setOnClickListener {
            if(board[4]=="") {
                board[4] = "X"
                btn4.text = "X"
                if(!winner(board,"X") && !isBoardFull())
                {
                    val random: Int = computerMove(board)
                    board[random] = chance2
                    displayrandommove(random)

                }
            }
            result(board)
        }

        btn5.setOnClickListener {
            if(board[5]=="") {
                board[5] = "X"
                btn5.text = "X"
                if(!winner(board,"X") && !isBoardFull())
                {
                    val random: Int = computerMove(board)
                    board[random] = chance2
                    displayrandommove(random)

                }
            }
            result(board)
        }

        btn6.setOnClickListener {
            if(board[6]=="") {
                board[6] = "X"
                btn6.text = "X"
                if(!winner(board,"X") && !isBoardFull())
                {
                    val random: Int = computerMove(board)
                    board[random] = chance2
                    displayrandommove(random)

                }
            }
            result(board)
        }

        btn7.setOnClickListener {
            if(board[7]=="") {
                board[7] = "X"
                btn7.text = "X"
                if(!winner(board,"X") && !isBoardFull())
                {
                    val random: Int = computerMove(board)
                    board[random] = chance2
                    displayrandommove(random)

                }
            }
            result(board)
        }

        btn8.setOnClickListener {
            if(board[8]=="") {
                board[8] = "X"
                btn8.text = "X"
                if(!winner(board,"X") && !isBoardFull())
                {
                    val random: Int = computerMove(board)
                    board[random] = chance2
                    displayrandommove(random)

                }
            }
            result(board)
        }
    }


    fun result(board: ArrayList<String>)
    {
        if(winner(board,"X"))
        {
            startActivity(Intent(this,Final::class.java) .putExtra("WON","YOU") )
        }
        else if(winner(board,"O"))
        {
            startActivity(Intent(this,Final::class.java) .putExtra("WON","COMPUTER") )

        }
        else if(isBoardFull())
        {
            startActivity(Intent(this,Final::class.java) .putExtra("WON","TIE") )

        }
    }

     private fun computerMove(board: ArrayList<String>): Int {

         //check if computer can win in this move
         for (i in 0..board.count()-1){
             var copy: ArrayList<String> = getBoardCopy(board)
             if(copy[i] == "") copy[i] = "O"
             if(winner(copy, "O")) return i
         }

         //check if player could win in the next move
         for (i in 0..board.count()-1){
             var copy2 = getBoardCopy(board)
             if(copy2[i] == "") copy2[i] = "X"
             if(winner(copy2, "X")) return i
         }

         //try to take corners if its free
         var move = choseRandomMove(board, arrayListOf<Int>(0, 2, 6, 8))
         if(move != -1)
             return move

         //try to take center if its free
         if(board[4] == "") return 4

         //move on one of the sides
         return choseRandomMove(board, arrayListOf<Int>(1, 3, 5, 7))
     }


     private fun choseRandomMove(board: ArrayList<String>, list: ArrayList<Int>): Int {
         var possibleMoves = arrayListOf<Int>()
         for (i in list){
             if(board[i] == "") possibleMoves.add(i)
         }
         if(possibleMoves.isEmpty()) return -1
         else {
             var index = Random().nextInt(possibleMoves.count())
             return possibleMoves[index]
         }
     }

     private fun getBoardCopy(board: ArrayList<String>): ArrayList<String> {
         var bd = arrayListOf<String>("", "", "", "", "", "", "", "", "")
         for (i in 0..board.count()-1) {
             bd[i] = board[i]
         }
         return bd
     }


     fun isBoardFull() : Boolean
    {
        val i:Int
        for(i in 1..9)
        {
            if(board[i]=="")
            {
                return false
            }
        }
        return true
    }

    fun winner(board : ArrayList<String>,letr : String): Boolean{

        return ((board[0] == letr && board[1] == letr && board[2] == letr)||

                (board[3] == letr && board[4] == letr && board[5] == letr)||
                (board[6] == letr && board[7] == letr && board[8] == letr)||

                (board[0] == letr && board[3] == letr && board[6] == letr)||

            (board[1] == letr && board[4] == letr && board[7] == letr) ||

                (board[2] == letr && board[5] == letr && board[8] == letr)||

            (board[0] == letr && board[4] == letr && board[8] == letr)||

                (board[2] == letr && board[4] == letr && board[6] == letr))

    }
    fun displayrandommove(random : Int)
    {
        if(random==0)
        {
            btn0.text="O"
        }
        if(random==1)
        {
            btn1.text="O"
        }
        if(random==2)
        {
            btn2.text="O"
        }
        if(random==3)
        {
            btn3.text="O"
        }
        if(random==4)
        {
            btn4.text="O"
        }
        if(random==5)
        {
            btn5.text="O"
        }
        if(random==6)
        {
            btn6.text="O"
        }
        if(random==7)
        {
            btn7.text="O"
        }
        if(random==8)
        {
            btn8.text="O"
        }

    }
}