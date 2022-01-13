package com.example.finalproject

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat

class GameActivity : AppCompatActivity(), View.OnClickListener {
    var turn : Boolean = true
    var currentGridIndex : Int = 0
    var nextGridIndex : Int = 0
    val checkArray = Array(81, {i -> 0})
    val turnArray = Array(81, {i -> 0})
    val mainGridArray = Array(9, {i -> 0})
    val canPlayInGrid = Array(9, {i -> 0})

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)


        val backButton : Button = findViewById(R.id.backButton)
        backButton.setOnClickListener { view ->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val resetButton : Button = findViewById(R.id.resetButton)
        resetButton.setOnClickListener { view ->
            finish()
            startActivity(getIntent())
        }

        val button1 : Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            if (checkArray[0] == 0 && turnArray[0] == 0) {
                currentGridIndex = 0
                nextGridIndex = 0

                if (turn)
                    checkArray[0] = 1
                else
                    checkArray[0] = 2

                onClick(button1)
            }
        }
        val button2 : Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            if (checkArray[1] == 0 && turnArray[1] == 0) {
                currentGridIndex = 0
                nextGridIndex = 1

                if (turn)
                    checkArray[1] = 1
                else
                    checkArray[1] = 2

                onClick(button2)
            }
        }

        val button3 : Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            if (checkArray[2] == 0 && turnArray[2] == 0) {
                currentGridIndex = 0
                nextGridIndex = 2

                if (turn)
                    checkArray[2] = 1
                else
                    checkArray[2] = 2

                onClick(button3)
            }
        }

        val button4 : Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            if (checkArray[3] == 0 && turnArray[3] == 0) {
                currentGridIndex = 0
                nextGridIndex = 3

                if (turn)
                    checkArray[3] = 1
                else
                    checkArray[3] = 2

                onClick(button4)
            }
        }

        val button5 : Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            if (checkArray[4] == 0 && turnArray[4] == 0) {
                currentGridIndex = 0
                nextGridIndex = 4

                if (turn)
                    checkArray[4] = 1
                else
                    checkArray[4] = 2

                onClick(button5)
            }
        }

        val button6 : Button = findViewById(R.id.button6)
        button6.setOnClickListener {
            if (checkArray[5] == 0 && turnArray[5] == 0) {
                currentGridIndex = 0
                nextGridIndex = 5

                if (turn)
                    checkArray[5] = 1
                else
                    checkArray[5] = 2

                onClick(button6)
            }
        }

        val button7 : Button = findViewById(R.id.button7)
        button7.setOnClickListener {
            if (checkArray[6] == 0 && turnArray[6] == 0) {
                currentGridIndex = 0
                nextGridIndex = 6

                if (turn)
                    checkArray[6] = 1
                else
                    checkArray[6] = 2

                onClick(button7)
            }
        }

        val button8 : Button = findViewById(R.id.button8)
        button8.setOnClickListener {
            if (checkArray[7] == 0 && turnArray[7] == 0) {
                currentGridIndex = 0
                nextGridIndex = 7

                if (turn)
                    checkArray[7] = 1
                else
                    checkArray[7] = 2

                onClick(button8)
            }
        }

        val button9 : Button = findViewById(R.id.button9)
        button9.setOnClickListener {
            if (checkArray[8] == 0 && turnArray[8] == 0) {
                currentGridIndex = 0
                nextGridIndex = 8

                if (turn)
                    checkArray[8] = 1
                else
                    checkArray[8] = 2

                onClick(button9)
            }
        }

        val button10 : Button = findViewById(R.id.button10)
        button10.setOnClickListener {
            if (checkArray[9] == 0 && turnArray[9] == 0) {
                currentGridIndex = 1
                nextGridIndex = 0

                if (turn)
                    checkArray[9] = 1
                else
                    checkArray[9] = 2

                onClick(button10)
            }
        }

        val button11 : Button = findViewById(R.id.button11)
        button11.setOnClickListener {
            if (checkArray[10] == 0 && turnArray[10] == 0) {
                currentGridIndex = 1
                nextGridIndex = 1

                if (turn)
                    checkArray[10] = 1
                else
                    checkArray[10] = 2

                onClick(button11)
            }
        }

        val button12 : Button = findViewById(R.id.button12)
        button12.setOnClickListener {
            if (checkArray[11] == 0 && turnArray[11] == 0) {
                currentGridIndex = 1
                nextGridIndex = 2

                if (turn)
                    checkArray[11] = 1
                else
                    checkArray[11] = 2

                onClick(button12)
            }
        }

        val button13 : Button = findViewById(R.id.button13)
        button13.setOnClickListener {
            if (checkArray[12] == 0 && turnArray[12] == 0) {
                currentGridIndex = 1
                nextGridIndex = 3

                if (turn)
                    checkArray[12] = 1
                else
                    checkArray[12] = 2

                onClick(button13)
            }
        }

        val button14 : Button = findViewById(R.id.button14)
        button14.setOnClickListener {
            if (checkArray[13] == 0 && turnArray[13] == 0) {
                currentGridIndex = 1
                nextGridIndex = 4

                if (turn)
                    checkArray[13] = 1
                else
                    checkArray[13] = 2

                onClick(button14)
            }
        }

        val button15 : Button = findViewById(R.id.button15)
        button15.setOnClickListener {
            if (checkArray[14] == 0 && turnArray[14] == 0) {
                currentGridIndex = 1
                nextGridIndex = 5

                if (turn)
                    checkArray[14] = 1
                else
                    checkArray[14] = 2

                onClick(button15)
            }
        }

        val button16 : Button = findViewById(R.id.button16)
        button16.setOnClickListener {
            if (checkArray[15] == 0 && turnArray[15] == 0) {
                currentGridIndex = 1
                nextGridIndex = 6

                if (turn)
                    checkArray[15] = 1
                else
                    checkArray[15] = 2

                onClick(button16)
            }
        }

        val button17 : Button = findViewById(R.id.button17)
        button17.setOnClickListener {
            if (checkArray[16] == 0 && turnArray[16] == 0) {
                currentGridIndex = 1
                nextGridIndex = 7

                if (turn)
                    checkArray[16] = 1
                else
                    checkArray[16] = 2

                onClick(button17)
            }
        }

        val button18 : Button = findViewById(R.id.button18)
        button18.setOnClickListener {
            if (checkArray[17] == 0 && turnArray[17] == 0) {
                currentGridIndex = 1
                nextGridIndex = 8

                if (turn)
                    checkArray[17] = 1
                else
                    checkArray[17] = 2

                onClick(button18)
            }
        }

        val button19 : Button = findViewById(R.id.button19)
        button19.setOnClickListener {
            if (checkArray[18] == 0 && turnArray[18] == 0) {
                currentGridIndex = 2
                nextGridIndex = 0

                if (turn)
                    checkArray[18] = 1
                else
                    checkArray[18] = 2

                onClick(button19)
            }
        }

        val button20 : Button = findViewById(R.id.button20)
        button20.setOnClickListener {
            if (checkArray[19] == 0 && turnArray[19] == 0) {
                currentGridIndex = 2
                nextGridIndex = 1

                if (turn)
                    checkArray[19] = 1
                else
                    checkArray[19] = 2

                onClick(button20)
            }
        }

        val button21 : Button = findViewById(R.id.button21)
        button21.setOnClickListener {
            if (checkArray[20] == 0 && turnArray[20] == 0) {
                currentGridIndex = 2
                nextGridIndex = 2

                if (turn)
                    checkArray[20] = 1
                else
                    checkArray[20] = 2

                onClick(button21)
            }
        }

        val button22 : Button = findViewById(R.id.button22)
        button22.setOnClickListener {
            if (checkArray[21] == 0 && turnArray[21] == 0) {
                currentGridIndex = 2
                nextGridIndex = 3

                if (turn)
                    checkArray[21] = 1
                else
                    checkArray[21] = 2

                onClick(button22)
            }
        }

        val button23 : Button = findViewById(R.id.button23)
        button23.setOnClickListener {
            if (checkArray[22] == 0 && turnArray[22] == 0) {
                currentGridIndex = 2
                nextGridIndex = 4

                if (turn)
                    checkArray[22] = 1
                else
                    checkArray[22] = 2

                onClick(button23)
            }
        }

        val button24 : Button = findViewById(R.id.button24)
        button24.setOnClickListener {
            if (checkArray[23] == 0 && turnArray[23] == 0) {
                currentGridIndex = 2
                nextGridIndex = 5

                if (turn)
                    checkArray[23] = 1
                else
                    checkArray[23] = 2

                onClick(button24)
            }
        }

        val button25 : Button = findViewById(R.id.button25)
        button25.setOnClickListener {
            if (checkArray[24] == 0 && turnArray[24] == 0) {
                currentGridIndex = 2
                nextGridIndex = 6

                if (turn)
                    checkArray[24] = 1
                else
                    checkArray[24] = 2

                onClick(button25)
            }
        }

        val button26 : Button = findViewById(R.id.button26)
        button26.setOnClickListener {
            if (checkArray[25] == 0 && turnArray[25] == 0) {
                currentGridIndex = 2
                nextGridIndex = 7

                if (turn)
                    checkArray[25] = 1
                else
                    checkArray[25] = 2

                onClick(button26)
            }
        }

        val button27 : Button = findViewById(R.id.button27)
        button27.setOnClickListener {
            if (checkArray[26] == 0 && turnArray[26] == 0) {
                currentGridIndex = 2
                nextGridIndex = 8

                if (turn)
                    checkArray[26] = 1
                else
                    checkArray[26] = 2

                onClick(button27)
            }
        }

        val button28 : Button = findViewById(R.id.button28)
        button28.setOnClickListener {
            if (checkArray[27] == 0 && turnArray[27] == 0) {
                currentGridIndex = 3
                nextGridIndex = 0

                if (turn)
                    checkArray[27] = 1
                else
                    checkArray[27] = 2

                onClick(button28)
            }
        }

        val button29 : Button = findViewById(R.id.button29)
        button29.setOnClickListener {
            if (checkArray[28] == 0 && turnArray[28] == 0) {
                currentGridIndex = 3
                nextGridIndex = 1

                if (turn)
                    checkArray[28] = 1
                else
                    checkArray[28] = 2

                onClick(button29)
            }
        }

        val button30 : Button = findViewById(R.id.button30)
        button30.setOnClickListener {
            if (checkArray[29] == 0 && turnArray[29] == 0) {
                currentGridIndex = 3
                nextGridIndex = 2

                if (turn)
                    checkArray[29] = 1
                else
                    checkArray[29] = 2

                onClick(button30)
            }
        }

        val button31 : Button = findViewById(R.id.button31)
        button31.setOnClickListener {
            if (checkArray[30] == 0 && turnArray[30] == 0) {
                currentGridIndex = 3
                nextGridIndex = 3

                if (turn)
                    checkArray[30] = 1
                else
                    checkArray[30] = 2

                onClick(button31)
            }
        }

        val button32 : Button = findViewById(R.id.button32)
        button32.setOnClickListener {
            if (checkArray[31] == 0 && turnArray[31] == 0) {
                currentGridIndex = 3
                nextGridIndex = 4

                if (turn)
                    checkArray[31] = 1
                else
                    checkArray[31] = 2

                onClick(button32)
            }
        }

        val button33 : Button = findViewById(R.id.button33)
        button33.setOnClickListener {
            if (checkArray[32] == 0 && turnArray[32] == 0) {
                currentGridIndex = 3
                nextGridIndex = 5

                if (turn)
                    checkArray[32] = 1
                else
                    checkArray[32] = 2

                onClick(button33)
            }
        }

        val button34 : Button = findViewById(R.id.button34)
        button34.setOnClickListener {
            if (checkArray[33] == 0 && turnArray[33] == 0) {
                currentGridIndex = 3
                nextGridIndex = 6

                if (turn)
                    checkArray[33] = 1
                else
                    checkArray[33] = 2

                onClick(button34)
            }
        }

        val button35 : Button = findViewById(R.id.button35)
        button35.setOnClickListener {
            if (checkArray[34] == 0 && turnArray[34] == 0) {
                currentGridIndex = 3
                nextGridIndex = 7

                if (turn)
                    checkArray[34] = 1
                else
                    checkArray[34] = 2

                onClick(button35)
            }
        }

        val button36 : Button = findViewById(R.id.button36)
        button36.setOnClickListener {
            if (checkArray[35] == 0 && turnArray[35] == 0) {
                currentGridIndex = 3
                nextGridIndex = 8

                if (turn)
                    checkArray[35] = 1
                else
                    checkArray[35] = 2

                onClick(button36)
            }
        }

        val button37 : Button = findViewById(R.id.button37)
        button37.setOnClickListener {
            if (checkArray[36] == 0 && turnArray[36] == 0) {
                currentGridIndex = 4
                nextGridIndex = 0

                if (turn)
                    checkArray[36] = 1
                else
                    checkArray[36] = 2

                onClick(button37)
            }
        }

        val button38 : Button = findViewById(R.id.button38)
        button38.setOnClickListener {
            if (checkArray[37] == 0 && turnArray[37] == 0) {
                currentGridIndex = 4
                nextGridIndex = 1

                if (turn)
                    checkArray[37] = 1
                else
                    checkArray[37] = 2

                onClick(button38)
            }
        }

        val button39 : Button = findViewById(R.id.button39)
        button39.setOnClickListener {
            if (checkArray[38] == 0 && turnArray[38] == 0) {
                currentGridIndex = 4
                nextGridIndex = 2

                if (turn)
                    checkArray[38] = 1
                else
                    checkArray[38] = 2

                onClick(button39)
            }
        }

        val button40 : Button = findViewById(R.id.button40)
        button40.setOnClickListener {
            if (checkArray[39] == 0 && turnArray[39] == 0) {
                currentGridIndex = 4
                nextGridIndex = 3

                if (turn)
                    checkArray[39] = 1
                else
                    checkArray[39] = 2

                onClick(button40)
            }
        }

        val button41 : Button = findViewById(R.id.button41)
        button41.setOnClickListener {
            if (checkArray[40] == 0 && turnArray[40] == 0) {
                currentGridIndex = 4
                nextGridIndex = 4

                if (turn)
                    checkArray[40] = 1
                else
                    checkArray[40] = 2

                onClick(button41)
            }
        }

        val button42 : Button = findViewById(R.id.button42)
        button42.setOnClickListener {
            if (checkArray[41] == 0 && turnArray[41] == 0) {
                currentGridIndex = 4
                nextGridIndex = 5

                if (turn)
                    checkArray[41] = 1
                else
                    checkArray[41] = 2

                onClick(button42)
            }
        }

        val button43 : Button = findViewById(R.id.button43)
        button43.setOnClickListener {
            if (checkArray[42] == 0 && turnArray[42] == 0) {
                currentGridIndex = 4
                nextGridIndex = 6

                if (turn)
                    checkArray[42] = 1
                else
                    checkArray[42] = 2

                onClick(button43)
            }
        }

        val button44 : Button = findViewById(R.id.button44)
        button44.setOnClickListener {
            if (checkArray[43] == 0 && turnArray[43] == 0) {
                currentGridIndex = 4
                nextGridIndex = 7

                if (turn)
                    checkArray[43] = 1
                else
                    checkArray[43] = 2

                onClick(button44)
            }
        }

        val button45 : Button = findViewById(R.id.button45)
        button45.setOnClickListener {
            if (checkArray[44] == 0 && turnArray[44] == 0) {
                currentGridIndex = 4
                nextGridIndex = 8

                if (turn)
                    checkArray[44] = 1
                else
                    checkArray[44] = 2

                onClick(button45)
            }
        }

        val button46 : Button = findViewById(R.id.button46)
        button46.setOnClickListener {
            if (checkArray[45] == 0 && turnArray[45] == 0) {
                currentGridIndex = 5
                nextGridIndex = 0

                if (turn)
                    checkArray[45] = 1
                else
                    checkArray[45] = 2

                onClick(button46)
            }
        }

        val button47 : Button = findViewById(R.id.button47)
        button47.setOnClickListener {
            if (checkArray[46] == 0 && turnArray[46] == 0) {
                currentGridIndex = 5
                nextGridIndex = 1

                if (turn)
                    checkArray[46] = 1
                else
                    checkArray[46] = 2

                onClick(button47)
            }
        }

        val button48 : Button = findViewById(R.id.button48)
        button48.setOnClickListener {
            if (checkArray[47] == 0 && turnArray[47] == 0) {
                currentGridIndex = 5
                nextGridIndex = 2

                if (turn)
                    checkArray[47] = 1
                else
                    checkArray[47] = 2

                onClick(button48)
            }
        }

        val button49 : Button = findViewById(R.id.button49)
        button49.setOnClickListener {
            if (checkArray[48] == 0 && turnArray[48] == 0) {
                currentGridIndex = 5
                nextGridIndex = 3

                if (turn)
                    checkArray[48] = 1
                else
                    checkArray[48] = 2

                onClick(button49)
            }
        }

        val button50 : Button = findViewById(R.id.button50)
        button50.setOnClickListener {
            if (checkArray[49] == 0 && turnArray[49] == 0) {
                currentGridIndex = 5
                nextGridIndex = 4

                if (turn)
                    checkArray[49] = 1
                else
                    checkArray[49] = 2

                onClick(button50)
            }
        }

        val button51 : Button = findViewById(R.id.button51)
        button51.setOnClickListener {
            if (checkArray[50] == 0 && turnArray[50] == 0) {
                currentGridIndex = 5
                nextGridIndex = 5

                if (turn)
                    checkArray[50] = 1
                else
                    checkArray[50] = 2

                onClick(button51)
            }
        }

        val button52 : Button = findViewById(R.id.button52)
        button52.setOnClickListener {
            if (checkArray[51] == 0 && turnArray[51] == 0) {
                currentGridIndex = 5
                nextGridIndex = 6

                if (turn)
                    checkArray[51] = 1
                else
                    checkArray[51] = 2

                onClick(button52)
            }
        }

        val button53 : Button = findViewById(R.id.button53)
        button53.setOnClickListener {
            if (checkArray[52] == 0 && turnArray[52] == 0) {
                currentGridIndex = 5
                nextGridIndex = 7

                if (turn)
                    checkArray[52] = 1
                else
                    checkArray[52] = 2

                onClick(button53)
            }
        }

        val button54 : Button = findViewById(R.id.button54)
        button54.setOnClickListener {
            if (checkArray[53] == 0 && turnArray[53] == 0) {
                currentGridIndex = 5
                nextGridIndex = 8

                if (turn)
                    checkArray[53] = 1
                else
                    checkArray[53] = 2

                onClick(button54)
            }
        }

        val button55 : Button = findViewById(R.id.button55)
        button55.setOnClickListener {
            if (checkArray[54] == 0 && turnArray[54] == 0) {
                currentGridIndex = 6
                nextGridIndex = 0

                if (turn)
                    checkArray[54] = 1
                else
                    checkArray[54] = 2

                onClick(button55)
            }
        }

        val button56 : Button = findViewById(R.id.button56)
        button56.setOnClickListener {
            if (checkArray[55] == 0 && turnArray[55] == 0) {
                currentGridIndex = 6
                nextGridIndex = 1

                if (turn)
                    checkArray[55] = 1
                else
                    checkArray[55] = 2

                onClick(button56)
            }
        }

        val button57 : Button = findViewById(R.id.button57)
        button57.setOnClickListener {
            if (checkArray[56] == 0 && turnArray[56] == 0) {
                currentGridIndex = 6
                nextGridIndex = 2

                if (turn)
                    checkArray[56] = 1
                else
                    checkArray[56] = 2

                onClick(button57)
            }
        }

        val button58 : Button = findViewById(R.id.button58)
        button58.setOnClickListener {
            if (checkArray[57] == 0 && turnArray[57] == 0) {
                currentGridIndex = 6
                nextGridIndex = 3

                if (turn)
                    checkArray[57] = 1
                else
                    checkArray[57] = 2

                onClick(button58)
            }
        }

        val button59 : Button = findViewById(R.id.button59)
        button59.setOnClickListener {
            if (checkArray[58] == 0 && turnArray[58] == 0) {
                currentGridIndex = 6
                nextGridIndex = 4

                if (turn)
                    checkArray[58] = 1
                else
                    checkArray[58] = 2

                onClick(button59)
            }
        }

        val button60 : Button = findViewById(R.id.button60)
        button60.setOnClickListener {
            if (checkArray[59] == 0 && turnArray[59] == 0) {
                currentGridIndex = 6
                nextGridIndex = 5

                if (turn)
                    checkArray[59] = 1
                else
                    checkArray[59] = 2

                onClick(button60)
            }
        }

        val button61 : Button = findViewById(R.id.button61)
        button61.setOnClickListener {
            if (checkArray[60] == 0 && turnArray[60] == 0) {
                currentGridIndex = 6
                nextGridIndex = 6

                if (turn)
                    checkArray[60] = 1
                else
                    checkArray[60] = 2

                onClick(button61)
            }
        }

        val button62 : Button = findViewById(R.id.button62)
        button62.setOnClickListener {
            if (checkArray[61] == 0 && turnArray[61] == 0) {
                currentGridIndex = 6
                nextGridIndex = 7

                if (turn)
                    checkArray[61] = 1
                else
                    checkArray[61] = 2

                onClick(button62)
            }
        }

        val button63 : Button = findViewById(R.id.button63)
        button63.setOnClickListener {
            if (checkArray[62] == 0 && turnArray[62] == 0) {
                currentGridIndex = 6
                nextGridIndex = 8

                if (turn)
                    checkArray[62] = 1
                else
                    checkArray[62] = 2

                onClick(button63)
            }
        }

        val button64 : Button = findViewById(R.id.button64)
        button64.setOnClickListener {
            if (checkArray[63] == 0 && turnArray[63] == 0) {
                currentGridIndex = 7
                nextGridIndex = 0

                if (turn)
                    checkArray[63] = 1
                else
                    checkArray[63] = 2

                onClick(button64)
            }
        }

        val button65 : Button = findViewById(R.id.button65)
        button65.setOnClickListener {
            if (checkArray[64] == 0 && turnArray[64] == 0) {
                currentGridIndex = 7
                nextGridIndex = 1

                if (turn)
                    checkArray[64] = 1
                else
                    checkArray[64] = 2

                onClick(button65)
            }
        }

        val button66 : Button = findViewById(R.id.button66)
        button66.setOnClickListener {
            if (checkArray[65] == 0 && turnArray[65] == 0) {
                currentGridIndex = 7
                nextGridIndex = 2

                if (turn)
                    checkArray[65] = 1
                else
                    checkArray[65] = 2

                onClick(button66)
            }
        }

        val button67 : Button = findViewById(R.id.button67)
        button67.setOnClickListener {
            if (checkArray[66] == 0 && turnArray[66] == 0) {
                currentGridIndex = 7
                nextGridIndex = 3

                if (turn)
                    checkArray[66] = 1
                else
                    checkArray[66] = 2

                onClick(button67)
            }
        }

        val button68 : Button = findViewById(R.id.button68)
        button68.setOnClickListener {
            if (checkArray[67] == 0 && turnArray[67] == 0) {
                currentGridIndex = 7
                nextGridIndex = 4

                if (turn)
                    checkArray[67] = 1
                else
                    checkArray[67] = 2

                onClick(button68)
            }
        }

        val button69 : Button = findViewById(R.id.button69)
        button69.setOnClickListener {
            if (checkArray[68] == 0 && turnArray[68] == 0) {
                currentGridIndex = 7
                nextGridIndex = 5

                if (turn)
                    checkArray[68] = 1
                else
                    checkArray[68] = 2

                onClick(button69)
            }
        }

        val button70 : Button = findViewById(R.id.button70)
        button70.setOnClickListener {
            if (checkArray[69] == 0 && turnArray[69] == 0) {
                currentGridIndex = 7
                nextGridIndex = 6

                if (turn)
                    checkArray[69] = 1
                else
                    checkArray[69] = 2

                onClick(button70)
            }
        }

        val button71 : Button = findViewById(R.id.button71)
        button71.setOnClickListener {
            if (checkArray[70] == 0 && turnArray[70] == 0) {
                currentGridIndex = 7
                nextGridIndex = 7

                if (turn)
                    checkArray[70] = 1
                else
                    checkArray[70] = 2

                onClick(button71)
            }
        }

        val button72 : Button = findViewById(R.id.button72)
        button72.setOnClickListener {
            if (checkArray[71] == 0 && turnArray[71] == 0) {
                currentGridIndex = 7
                nextGridIndex = 8

                if (turn)
                    checkArray[71] = 1
                else
                    checkArray[71] = 2

                onClick(button72)
            }
        }

        val button73 : Button = findViewById(R.id.button73)
        button73.setOnClickListener {
            if (checkArray[72] == 0 && turnArray[72] == 0) {
                currentGridIndex = 8
                nextGridIndex = 0

                if (turn)
                    checkArray[72] = 1
                else
                    checkArray[72] = 2

                onClick(button73)
            }
        }

        val button74 : Button = findViewById(R.id.button74)
        button74.setOnClickListener {
            if (checkArray[73] == 0 && turnArray[73] == 0) {
                currentGridIndex = 8
                nextGridIndex = 1

                if (turn)
                    checkArray[73] = 1
                else
                    checkArray[73] = 2

                onClick(button74)
            }
        }

        val button75 : Button = findViewById(R.id.button75)
        button75.setOnClickListener {
            if (checkArray[74] == 0 && turnArray[74] == 0) {
                currentGridIndex = 8
                nextGridIndex = 2

                if (turn)
                    checkArray[74] = 1
                else
                    checkArray[74] = 2

                onClick(button75)
            }
        }

        val button76 : Button = findViewById(R.id.button76)
        button76.setOnClickListener {
            if (checkArray[75] == 0 && turnArray[75] == 0) {
                currentGridIndex = 8
                nextGridIndex = 3

                if (turn)
                    checkArray[75] = 1
                else
                    checkArray[75] = 2

                onClick(button76)
            }
        }

        val button77 : Button = findViewById(R.id.button77)
        button77.setOnClickListener {
            if (checkArray[76] == 0 && turnArray[76] == 0) {
                currentGridIndex = 8
                nextGridIndex = 4

                if (turn)
                    checkArray[76] = 1
                else
                    checkArray[76] = 2

                onClick(button77)
            }
        }

        val button78 : Button = findViewById(R.id.button78)
        button78.setOnClickListener {
            if (checkArray[77] == 0 && turnArray[77] == 0) {
                currentGridIndex = 8
                nextGridIndex = 5

                if (turn)
                    checkArray[77] = 1
                else
                    checkArray[77] = 2

                onClick(button78)
            }
        }
        val button79 : Button = findViewById(R.id.button79)
        button79.setOnClickListener {
            if (checkArray[78] == 0 && turnArray[78] == 0) {
                currentGridIndex = 8
                nextGridIndex = 6

                if (turn)
                    checkArray[78] = 1
                else
                    checkArray[78] = 2

                onClick(button79)
            }
        }

        val button80 : Button = findViewById(R.id.button80)
        button80.setOnClickListener {
            if (checkArray[79] == 0 && turnArray[79] == 0) {
                currentGridIndex = 8
                nextGridIndex = 7

                if (turn)
                    checkArray[79] = 1
                else
                    checkArray[79] = 2

                onClick(button80)
            }
        }
        val button81 : Button = findViewById(R.id.button81)
        button81.setOnClickListener {
            if (checkArray[80] == 0 && turnArray[80] == 0) {
                currentGridIndex = 8
                nextGridIndex = 8

                if (turn)
                    checkArray[80] = 1
                else
                    checkArray[80] = 2

                onClick(button81)
            }
        }


    }
    override fun onClick(v: View) {
        if (checkForWinSmallGrid(currentGridIndex)) {
            if (turn)
                mainGridArray[currentGridIndex] = 1
            else
                mainGridArray[currentGridIndex] = 2
        }
        for (i in 0..80) {
            turnArray[i] = -1
        }
        if ((fullGrid(currentGridIndex) || mainGridArray[currentGridIndex] != 0)) {
            canPlayInGrid[currentGridIndex] = 1
            val offset : Int = currentGridIndex * 9
            for (i in 0..8) {
                if(checkArray[offset + i] == 0)
                    checkArray[offset + i] = -1
            }
        }
        if (canPlayInGrid[nextGridIndex] != 0) {
            for (i in 0..80) {
                turnArray[i] = 0
            }
        }
        else {
            val offset : Int = nextGridIndex * 9
            for (i in 0..8) {
                turnArray[offset + i] = 0
            }
        }
        if (turn)
            v.setBackgroundResource(R.drawable.x)
        else
            v.setBackgroundResource(R.drawable.o)

        if(checkForWinBigGrid()) {
            val textView = findViewById<TextView>(R.id.testTextView)
            if (turn) {
                textView.setText("X wins").toString()
                DatabaseDoesntWork.x++
            }
            else {
                textView.setText("O wins").toString()
                DatabaseDoesntWork.o++
            }
            for (i in 0..80) {
                turnArray[i] = -1
            }
        }
        else if(checkForDraw()){
            val textView = findViewById<TextView>(R.id.testTextView)
            textView.setText("Draw").toString()
            for (i in 0..80) {
                turnArray[i] = -1
            }
            val backButton : Button = findViewById(R.id.backButton)
            backButton.visibility = View.VISIBLE
        }
        colorButtons()
        turn = !turn
    }
    fun fullGrid(gridIndex: Int) : Boolean {
        var full = true
        val offset : Int = gridIndex * 9
        for (i in 0..8) {
            if (checkArray[offset + i] == 0) {
                full = false
            }
        }
        return full
    }
    fun checkForWinSmallGrid(gridIndex: Int) : Boolean {
        val offset : Int = gridIndex * 9
        val currentGrid = Array(9, {i -> 0})

        for (i in 0..8) {
            currentGrid[i] = checkArray[offset + i]
        }

        val win : Boolean =
            (currentGrid[0] != 0 && currentGrid[1] != 0 && currentGrid[2] != 0 && currentGrid[0] == currentGrid[1] && currentGrid[1] == currentGrid[2]) ||
            (currentGrid[3] != 0 && currentGrid[4] != 0 && currentGrid[5] != 0 && currentGrid[3] == currentGrid[4] && currentGrid[4] == currentGrid[5]) ||
            (currentGrid[6] != 0 && currentGrid[7] != 0 && currentGrid[8] != 0 && currentGrid[6] == currentGrid[7] && currentGrid[7] == currentGrid[8]) ||
            (currentGrid[0] != 0 && currentGrid[3] != 0 && currentGrid[6] != 0 && currentGrid[0] == currentGrid[3] && currentGrid[3] == currentGrid[6]) ||
            (currentGrid[1] != 0 && currentGrid[4] != 0 && currentGrid[7] != 0 && currentGrid[1] == currentGrid[4] && currentGrid[4] == currentGrid[7]) ||
            (currentGrid[2] != 0 && currentGrid[5] != 0 && currentGrid[8] != 0 && currentGrid[2] == currentGrid[5] && currentGrid[5] == currentGrid[8]) ||
            (currentGrid[0] != 0 && currentGrid[4] != 0 && currentGrid[8] != 0 && currentGrid[0] == currentGrid[4] && currentGrid[4] == currentGrid[8]) ||
            (currentGrid[2] != 0 && currentGrid[4] != 0 && currentGrid[6] != 0 && currentGrid[2] == currentGrid[4] && currentGrid[4] == currentGrid[6]);

        return win
    }
    fun checkForWinBigGrid() : Boolean {
        val win : Boolean =
            (mainGridArray[0] != 0 && mainGridArray[0] == mainGridArray[1] && mainGridArray[1] == mainGridArray[2]) ||
                    (mainGridArray[3] != 0 && mainGridArray[3] == mainGridArray[4] && mainGridArray[4] == mainGridArray[5]) ||
                    (mainGridArray[6] != 0 && mainGridArray[6] == mainGridArray[7] && mainGridArray[7] == mainGridArray[8]) ||
                    (mainGridArray[0] != 0 && mainGridArray[0] == mainGridArray[3] && mainGridArray[3] == mainGridArray[6]) ||
                    (mainGridArray[1] != 0 && mainGridArray[1] == mainGridArray[4] && mainGridArray[4] == mainGridArray[7]) ||
                    (mainGridArray[2] != 0 && mainGridArray[2] == mainGridArray[5] && mainGridArray[5] == mainGridArray[8]) ||
                    (mainGridArray[0] != 0 && mainGridArray[0] == mainGridArray[4] && mainGridArray[4] == mainGridArray[8]) ||
                    (mainGridArray[2] != 0 && mainGridArray[2] == mainGridArray[4] && mainGridArray[4] == mainGridArray[6]);

        return win
    }
    fun checkForDraw() : Boolean {
        var draw = 0
        for (i in 0..8) {
            draw += canPlayInGrid[i]
        }
        return draw == 9
    }
    fun colorButtons() {
        val disabledButton : Drawable = DrawableCompat.wrap(ContextCompat.getDrawable(this!!, R.drawable.unused_button)!!)
        val enabledButton : Drawable = DrawableCompat.wrap(ContextCompat.getDrawable(this!!, R.drawable.small_button)!!)

        val button1 : Button = findViewById(R.id.button1)
        if (checkArray[0] == 0 && turnArray[0] == 0) {
            button1?.background = enabledButton
        }
        else if (checkArray[0] <= 0) {
            button1?.background = disabledButton
        }
        val button2 : Button = findViewById(R.id.button2)
        if (checkArray[1] == 0 && turnArray[1] == 0) {
            button2?.background = enabledButton
        }
        else if (checkArray[1] <= 0) {
            button2?.background = disabledButton
        }
        val button3 : Button = findViewById(R.id.button3)
        if (checkArray[2] == 0 && turnArray[2] == 0) {
            button3?.background = enabledButton
        }
        else if (checkArray[2] <= 0) {
            button3?.background = disabledButton
        }
        val button4 : Button = findViewById(R.id.button4)
        if (checkArray[3] == 0 && turnArray[3] == 0) {
            button4?.background = enabledButton
        }
        else if (checkArray[3] <= 0) {
            button4?.background = disabledButton
        }
        val button5 : Button = findViewById(R.id.button5)
        if (checkArray[4] == 0 && turnArray[4] == 0) {
            button5?.background = enabledButton
        }
        else if (checkArray[4] <= 0) {
            button5?.background = disabledButton
        }
        val button6 : Button = findViewById(R.id.button6)
        if (checkArray[5] == 0 && turnArray[5] == 0) {
            button6?.background = enabledButton
        }
        else if (checkArray[5] <= 0) {
            button6?.background = disabledButton
        }
        val button7 : Button = findViewById(R.id.button7)
        if (checkArray[6] == 0 && turnArray[6] == 0) {
            button7?.background = enabledButton
        }
        else if (checkArray[6] <= 0) {
            button7?.background = disabledButton
        }
        val button8 : Button = findViewById(R.id.button8)
        if (checkArray[7] == 0 && turnArray[7] == 0) {
            button8?.background = enabledButton
        }
        else if (checkArray[7] <= 0) {
            button8?.background = disabledButton
        }
        val button9 : Button = findViewById(R.id.button9)
        if (checkArray[8] == 0 && turnArray[8] == 0) {
            button9?.background = enabledButton
        }
        else if (checkArray[8] <= 0) {
            button9?.background = disabledButton
        }
        val button10 : Button = findViewById(R.id.button10)
        if (checkArray[9] == 0 && turnArray[9] == 0) {
            button10?.background = enabledButton
        }
        else if (checkArray[9] <= 0) {
            button10?.background = disabledButton
        }
        val button11 : Button = findViewById(R.id.button11)
        if (checkArray[10] == 0 && turnArray[10] == 0) {
            button11?.background = enabledButton
        }
        else if (checkArray[10] <= 0) {
            button11?.background = disabledButton
        }
        val button12 : Button = findViewById(R.id.button12)
        if (checkArray[11] == 0 && turnArray[11] == 0) {
            button12?.background = enabledButton
        }
        else if (checkArray[11] <= 0) {
            button12?.background = disabledButton
        }
        val button13 : Button = findViewById(R.id.button13)
        if (checkArray[12] == 0 && turnArray[12] == 0) {
            button13?.background = enabledButton
        }
        else if (checkArray[12] <= 0) {
            button13?.background = disabledButton
        }
        val button14 : Button = findViewById(R.id.button14)
        if (checkArray[13] == 0 && turnArray[13] == 0) {
            button14?.background = enabledButton
        }
        else if (checkArray[13] <= 0) {
            button14?.background = disabledButton
        }
        val button15 : Button = findViewById(R.id.button15)
        if (checkArray[14] == 0 && turnArray[14] == 0) {
            button15?.background = enabledButton
        }
        else if (checkArray[14] <= 0) {
            button15?.background = disabledButton
        }
        val button16 : Button = findViewById(R.id.button16)
        if (checkArray[15] == 0 && turnArray[15] == 0) {
            button16?.background = enabledButton
        }
        else if (checkArray[15] <= 0) {
            button16?.background = disabledButton
        }
        val button17 : Button = findViewById(R.id.button17)
        if (checkArray[16] == 0 && turnArray[16] == 0) {
            button17?.background = enabledButton
        }
        else if (checkArray[16] <= 0) {
            button17?.background = disabledButton
        }
        val button18 : Button = findViewById(R.id.button18)
        if (checkArray[17] == 0 && turnArray[17] == 0) {
            button18?.background = enabledButton
        }
        else if (checkArray[17] <= 0) {
            button18?.background = disabledButton
        }
        val button19 : Button = findViewById(R.id.button19)
        if (checkArray[18] == 0 && turnArray[18] == 0) {
            button19?.background = enabledButton
        }
        else if (checkArray[18] <= 0) {
            button19?.background = disabledButton
        }
        val button20 : Button = findViewById(R.id.button20)
        if (checkArray[19] == 0 && turnArray[19] == 0) {
            button20?.background = enabledButton
        }
        else if (checkArray[19] <= 0) {
            button20?.background = disabledButton
        }
        val button21 : Button = findViewById(R.id.button21)
        if (checkArray[20] == 0 && turnArray[20] == 0) {
            button21?.background = enabledButton
        }
        else if (checkArray[20] <= 0) {
            button21?.background = disabledButton
        }
        val button22 : Button = findViewById(R.id.button22)
        if (checkArray[21] == 0 && turnArray[21] == 0) {
            button22?.background = enabledButton
        }
        else if (checkArray[21] <= 0) {
            button22?.background = disabledButton
        }
        val button23 : Button = findViewById(R.id.button23)
        if (checkArray[22] == 0 && turnArray[22] == 0) {
            button23?.background = enabledButton
        }
        else if (checkArray[22] <= 0) {
            button23?.background = disabledButton
        }
        val button24 : Button = findViewById(R.id.button24)
        if (checkArray[23] == 0 && turnArray[23] == 0) {
            button24?.background = enabledButton
        }
        else if (checkArray[23] <= 0) {
            button24?.background = disabledButton
        }
        val button25 : Button = findViewById(R.id.button25)
        if (checkArray[24] == 0 && turnArray[24] == 0) {
            button25?.background = enabledButton
        }
        else if (checkArray[24] <= 0) {
            button25?.background = disabledButton
        }
        val button26 : Button = findViewById(R.id.button26)
        if (checkArray[25] == 0 && turnArray[25] == 0) {
            button26?.background = enabledButton
        }
        else if (checkArray[25] <= 0) {
            button26?.background = disabledButton
        }
        val button27 : Button = findViewById(R.id.button27)
        if (checkArray[26] == 0 && turnArray[26] == 0) {
            button27?.background = enabledButton
        }
        else if (checkArray[26] <= 0) {
            button27?.background = disabledButton
        }
        val button28 : Button = findViewById(R.id.button28)
        if (checkArray[27] == 0 && turnArray[27] == 0) {
            button28?.background = enabledButton
        }
        else if (checkArray[27] <= 0) {
            button28?.background = disabledButton
        }
        val button29 : Button = findViewById(R.id.button29)
        if (checkArray[28] == 0 && turnArray[28] == 0) {
            button29?.background = enabledButton
        }
        else if (checkArray[28] <= 0) {
            button29?.background = disabledButton
        }
        val button30 : Button = findViewById(R.id.button30)
        if (checkArray[29] == 0 && turnArray[29] == 0) {
            button30?.background = enabledButton
        }
        else if (checkArray[29] <= 0) {
            button30?.background = disabledButton
        }
        val button31 : Button = findViewById(R.id.button31)
        if (checkArray[30] == 0 && turnArray[30] == 0) {
            button31?.background = enabledButton
        }
        else if (checkArray[30] <= 0) {
            button31?.background = disabledButton
        }
        val button32 : Button = findViewById(R.id.button32)
        if (checkArray[31] == 0 && turnArray[31] == 0) {
            button32?.background = enabledButton
        }
        else if (checkArray[31] <= 0) {
            button32?.background = disabledButton
        }
        val button33 : Button = findViewById(R.id.button33)
        if (checkArray[32] == 0 && turnArray[32] == 0) {
            button33?.background = enabledButton
        }
        else if (checkArray[32] <= 0) {
            button33?.background = disabledButton
        }
        val button34 : Button = findViewById(R.id.button34)
        if (checkArray[33] == 0 && turnArray[33] == 0) {
            button34?.background = enabledButton
        }
        else if (checkArray[33] <= 0) {
            button34?.background = disabledButton
        }
        val button35 : Button = findViewById(R.id.button35)
        if (checkArray[34] == 0 && turnArray[34] == 0) {
            button35?.background = enabledButton
        }
        else if (checkArray[34] <= 0) {
            button35?.background = disabledButton
        }
        val button36 : Button = findViewById(R.id.button36)
        if (checkArray[35] == 0 && turnArray[35] == 0) {
            button36?.background = enabledButton
        }
        else if (checkArray[35] <= 0) {
            button36?.background = disabledButton
        }
        val button37 : Button = findViewById(R.id.button37)
        if (checkArray[36] == 0 && turnArray[36] == 0) {
            button37?.background = enabledButton
        }
        else if (checkArray[36] <= 0) {
            button37?.background = disabledButton
        }
        val button38 : Button = findViewById(R.id.button38)
        if (checkArray[37] == 0 && turnArray[37] == 0) {
            button38?.background = enabledButton
        }
        else if (checkArray[37] <= 0) {
            button38?.background = disabledButton
        }
        val button39 : Button = findViewById(R.id.button39)
        if (checkArray[38] == 0 && turnArray[38] == 0) {
            button39?.background = enabledButton
        }
        else if (checkArray[38] <= 0) {
            button39?.background = disabledButton
        }
        val button40 : Button = findViewById(R.id.button40)
        if (checkArray[39] == 0 && turnArray[39] == 0) {
            button40?.background = enabledButton
        }
        else if (checkArray[39] <= 0) {
            button40?.background = disabledButton
        }
        val button41 : Button = findViewById(R.id.button41)
        if (checkArray[40] == 0 && turnArray[40] == 0) {
            button41?.background = enabledButton
        }
        else if (checkArray[40] <= 0) {
            button41?.background = disabledButton
        }
        val button42 : Button = findViewById(R.id.button42)
        if (checkArray[41] == 0 && turnArray[41] == 0) {
            button42?.background = enabledButton
        }
        else if (checkArray[41] <= 0) {
            button42?.background = disabledButton
        }
        val button43 : Button = findViewById(R.id.button43)
        if (checkArray[42] == 0 && turnArray[42] == 0) {
            button43?.background = enabledButton
        }
        else if (checkArray[42] <= 0) {
            button43?.background = disabledButton
        }
        val button44 : Button = findViewById(R.id.button44)
        if (checkArray[43] == 0 && turnArray[43] == 0) {
            button44?.background = enabledButton
        }
        else if (checkArray[43] <= 0) {
            button44?.background = disabledButton
        }
        val button45 : Button = findViewById(R.id.button45)
        if (checkArray[44] == 0 && turnArray[44] == 0) {
            button45?.background = enabledButton
        }
        else if (checkArray[44] <= 0) {
            button45?.background = disabledButton
        }
        val button46 : Button = findViewById(R.id.button46)
        if (checkArray[45] == 0 && turnArray[45] == 0) {
            button46?.background = enabledButton
        }
        else if (checkArray[45] <= 0) {
            button46?.background = disabledButton
        }
        val button47 : Button = findViewById(R.id.button47)
        if (checkArray[46] == 0 && turnArray[46] == 0) {
            button47?.background = enabledButton
        }
        else if (checkArray[46] <= 0) {
            button47?.background = disabledButton
        }
        val button48 : Button = findViewById(R.id.button48)
        if (checkArray[47] == 0 && turnArray[47] == 0) {
            button48?.background = enabledButton
        }
        else if (checkArray[47] <= 0) {
            button48?.background = disabledButton
        }
        val button49 : Button = findViewById(R.id.button49)
        if (checkArray[48] == 0 && turnArray[48] == 0) {
            button49?.background = enabledButton
        }
        else if (checkArray[48] <= 0) {
            button49?.background = disabledButton
        }
        val button50 : Button = findViewById(R.id.button50)
        if (checkArray[49] == 0 && turnArray[49] == 0) {
            button50?.background = enabledButton
        }
        else if (checkArray[49] <= 0) {
            button50?.background = disabledButton
        }
        val button51 : Button = findViewById(R.id.button51)
        if (checkArray[50] == 0 && turnArray[50] == 0) {
            button51?.background = enabledButton
        }
        else if (checkArray[50] <= 0) {
            button51?.background = disabledButton
        }
        val button52 : Button = findViewById(R.id.button52)
        if (checkArray[51] == 0 && turnArray[51] == 0) {
            button52?.background = enabledButton
        }
        else if (checkArray[51] <= 0) {
            button52?.background = disabledButton
        }
        val button53 : Button = findViewById(R.id.button53)
        if (checkArray[52] == 0 && turnArray[52] == 0) {
            button53?.background = enabledButton
        }
        else if (checkArray[52] <= 0) {
            button53?.background = disabledButton
        }
        val button54 : Button = findViewById(R.id.button54)
        if (checkArray[53] == 0 && turnArray[53] == 0) {
            button54?.background = enabledButton
        }
        else if (checkArray[53] <= 0) {
            button54?.background = disabledButton
        }
        val button55 : Button = findViewById(R.id.button55)
        if (checkArray[54] == 0 && turnArray[54] == 0) {
            button55?.background = enabledButton
        }
        else if (checkArray[54] <= 0) {
            button55?.background = disabledButton
        }
        val button56 : Button = findViewById(R.id.button56)
        if (checkArray[55] == 0 && turnArray[55] == 0) {
            button56?.background = enabledButton
        }
        else if (checkArray[55] <= 0) {
            button56?.background = disabledButton
        }
        val button57 : Button = findViewById(R.id.button57)
        if (checkArray[56] == 0 && turnArray[56] == 0) {
            button57?.background = enabledButton
        }
        else if (checkArray[56] <= 0) {
            button57?.background = disabledButton
        }
        val button58 : Button = findViewById(R.id.button58)
        if (checkArray[57] == 0 && turnArray[57] == 0) {
            button58?.background = enabledButton
        }
        else if (checkArray[57] <= 0) {
            button58?.background = disabledButton
        }
        val button59 : Button = findViewById(R.id.button59)
        if (checkArray[58] == 0 && turnArray[58] == 0) {
            button59?.background = enabledButton
        }
        else if (checkArray[58] <= 0) {
            button59?.background = disabledButton
        }
        val button60 : Button = findViewById(R.id.button60)
        if (checkArray[59] == 0 && turnArray[59] == 0) {
            button60?.background = enabledButton
        }
        else if (checkArray[59] <= 0) {
            button60?.background = disabledButton
        }
        val button61 : Button = findViewById(R.id.button61)
        if (checkArray[60] == 0 && turnArray[60] == 0) {
            button61?.background = enabledButton
        }
        else if (checkArray[60] <= 0) {
            button61?.background = disabledButton
        }
        val button62 : Button = findViewById(R.id.button62)
        if (checkArray[61] == 0 && turnArray[61] == 0) {
            button62?.background = enabledButton
        }
        else if (checkArray[61] <= 0) {
            button62?.background = disabledButton
        }
        val button63 : Button = findViewById(R.id.button63)
        if (checkArray[62] == 0 && turnArray[62] == 0) {
            button63?.background = enabledButton
        }
        else if (checkArray[62] <= 0) {
            button63?.background = disabledButton
        }
        val button64 : Button = findViewById(R.id.button64)
        if (checkArray[63] == 0 && turnArray[63] == 0) {
            button64?.background = enabledButton
        }
        else if (checkArray[63] <= 0) {
            button64?.background = disabledButton
        }
        val button65 : Button = findViewById(R.id.button65)
        if (checkArray[64] == 0 && turnArray[64] == 0) {
            button65?.background = enabledButton
        }
        else if (checkArray[64] <= 0) {
            button65?.background = disabledButton
        }
        val button66 : Button = findViewById(R.id.button66)
        if (checkArray[65] == 0 && turnArray[65] == 0) {
            button66?.background = enabledButton
        }
        else if (checkArray[65] <= 0) {
            button66?.background = disabledButton
        }
        val button67 : Button = findViewById(R.id.button67)
        if (checkArray[66] == 0 && turnArray[66] == 0) {
            button67?.background = enabledButton
        }
        else if (checkArray[66] <= 0) {
            button67?.background = disabledButton
        }
        val button68 : Button = findViewById(R.id.button68)
        if (checkArray[67] == 0 && turnArray[67] == 0) {
            button68?.background = enabledButton
        }
        else if (checkArray[67] <= 0) {
            button68?.background = disabledButton
        }
        val button69 : Button = findViewById(R.id.button69)
        if (checkArray[68] == 0 && turnArray[68] == 0) {
            button69?.background = enabledButton
        }
        else if (checkArray[68] <= 0) {
            button69?.background = disabledButton
        }
        val button70 : Button = findViewById(R.id.button70)
        if (checkArray[69] == 0 && turnArray[69] == 0) {
            button70?.background = enabledButton
        }
        else if (checkArray[69] <= 0) {
            button70?.background = disabledButton
        }
        val button71 : Button = findViewById(R.id.button71)
        if (checkArray[70] == 0 && turnArray[70] == 0) {
            button71?.background = enabledButton
        }
        else if (checkArray[70] <= 0) {
            button71?.background = disabledButton
        }
        val button72 : Button = findViewById(R.id.button72)
        if (checkArray[71] == 0 && turnArray[71] == 0) {
            button72?.background = enabledButton
        }
        else if (checkArray[71] <= 0) {
            button72?.background = disabledButton
        }
        val button73 : Button = findViewById(R.id.button73)
        if (checkArray[72] == 0 && turnArray[72] == 0) {
            button73?.background = enabledButton
        }
        else if (checkArray[72] <= 0) {
            button73?.background = disabledButton
        }
        val button74 : Button = findViewById(R.id.button74)
        if (checkArray[73] == 0 && turnArray[73] == 0) {
            button74?.background = enabledButton
        }
        else if (checkArray[73] <= 0) {
            button74?.background = disabledButton
        }
        val button75 : Button = findViewById(R.id.button75)
        if (checkArray[74] == 0 && turnArray[74] == 0) {
            button75?.background = enabledButton
        }
        else if (checkArray[74] <= 0) {
            button75?.background = disabledButton
        }
        val button76 : Button = findViewById(R.id.button76)
        if (checkArray[75] == 0 && turnArray[75] == 0) {
            button76?.background = enabledButton
        }
        else if (checkArray[75] <= 0) {
            button76?.background = disabledButton
        }
        val button77 : Button = findViewById(R.id.button77)
        if (checkArray[76] == 0 && turnArray[76] == 0) {
            button77?.background = enabledButton
        }
        else if (checkArray[76] <= 0) {
            button77?.background = disabledButton
        }
        val button78 : Button = findViewById(R.id.button78)
        if (checkArray[77] == 0 && turnArray[77] == 0) {
            button78?.background = enabledButton
        }
        else if (checkArray[77] <= 0) {
            button78?.background = disabledButton
        }
        val button79 : Button = findViewById(R.id.button79)
        if (checkArray[78] == 0 && turnArray[78] == 0) {
            button79?.background = enabledButton
        }
        else if (checkArray[78] <= 0) {
            button79?.background = disabledButton
        }
        val button80 : Button = findViewById(R.id.button80)
        if (checkArray[79] == 0 && turnArray[79] == 0) {
            button80?.background = enabledButton
        }
        else if (checkArray[79] <= 0) {
            button80?.background = disabledButton
        }
        val button81 : Button = findViewById(R.id.button81)
        if (checkArray[80] == 0 && turnArray[80] == 0) {
            button81?.background = enabledButton
        }
        else if (checkArray[80] <= 0) {
            button81?.background = disabledButton
        }
    }
    fun endGame() {

        val disabledButton : Drawable = DrawableCompat.wrap(ContextCompat.getDrawable(this!!, R.drawable.unused_button)!!)
        val button1 : Button = findViewById(R.id.button1)
        if (checkArray[0] <= 0) {
            button1?.background = disabledButton
        }
        val button2 : Button = findViewById(R.id.button2)
        if (checkArray[1] <= 0) {
            button2?.background = disabledButton
        }
        val button3 : Button = findViewById(R.id.button3)
        if (checkArray[2] <= 0) {
            button3?.background = disabledButton
        }
        val button4 : Button = findViewById(R.id.button4)
        if (checkArray[3] <= 0) {
            button4?.background = disabledButton
        }
        val button5 : Button = findViewById(R.id.button5)
        if (checkArray[4] <= 0) {
            button5?.background = disabledButton
        }
        val button6 : Button = findViewById(R.id.button6)
        if (checkArray[5] <= 0) {
            button6?.background = disabledButton
        }
        val button7 : Button = findViewById(R.id.button7)
        if (checkArray[6] <= 0) {
            button7?.background = disabledButton
        }
        val button8 : Button = findViewById(R.id.button8)
        if (checkArray[7] <= 0) {
            button8?.background = disabledButton
        }
        val button9 : Button = findViewById(R.id.button9)
        if (checkArray[8] <= 0) {
            button9?.background = disabledButton
        }
        val button10 : Button = findViewById(R.id.button10)
        if (checkArray[9] <= 0) {
            button10?.background = disabledButton
        }
        val button11 : Button = findViewById(R.id.button11)
        if (checkArray[10] <= 0) {
            button11?.background = disabledButton
        }
        val button12 : Button = findViewById(R.id.button12)
        if (checkArray[11] <= 0) {
            button12?.background = disabledButton
        }
        val button13 : Button = findViewById(R.id.button13)
        if (checkArray[12] <= 0) {
            button13?.background = disabledButton
        }
        val button14 : Button = findViewById(R.id.button14)
        if (checkArray[13] <= 0) {
            button14?.background = disabledButton
        }
        val button15 : Button = findViewById(R.id.button15)
        if (checkArray[14] <= 0) {
            button15?.background = disabledButton
        }
        val button16 : Button = findViewById(R.id.button16)
        if (checkArray[15] <= 0) {
            button16?.background = disabledButton
        }
        val button17 : Button = findViewById(R.id.button17)
        if (checkArray[16] <= 0) {
            button17?.background = disabledButton
        }
        val button18 : Button = findViewById(R.id.button18)
        if (checkArray[17] <= 0) {
            button18?.background = disabledButton
        }
        val button19 : Button = findViewById(R.id.button19)
        if (checkArray[18] <= 0) {
            button19?.background = disabledButton
        }
        val button20 : Button = findViewById(R.id.button20)
        if (checkArray[19] <= 0) {
            button20?.background = disabledButton
        }
        val button21 : Button = findViewById(R.id.button21)
        if (checkArray[20] <= 0) {
            button21?.background = disabledButton
        }
        val button22 : Button = findViewById(R.id.button22)
        if (checkArray[21] <= 0) {
            button22?.background = disabledButton
        }
        val button23 : Button = findViewById(R.id.button23)
        if (checkArray[22] <= 0) {
            button23?.background = disabledButton
        }
        val button24 : Button = findViewById(R.id.button24)
        if (checkArray[23] <= 0) {
            button24?.background = disabledButton
        }
        val button25 : Button = findViewById(R.id.button25)
        if (checkArray[24] <= 0) {
            button25?.background = disabledButton
        }
        val button26 : Button = findViewById(R.id.button26)
        if (checkArray[25] <= 0) {
            button26?.background = disabledButton
        }
        val button27 : Button = findViewById(R.id.button27)
        if (checkArray[26] <= 0) {
            button27?.background = disabledButton
        }
        val button28 : Button = findViewById(R.id.button28)
        if (checkArray[27] <= 0) {
            button28?.background = disabledButton
        }
        val button29 : Button = findViewById(R.id.button29)
        if (checkArray[28] <= 0) {
            button29?.background = disabledButton
        }
        val button30 : Button = findViewById(R.id.button30)
        if (checkArray[29] <= 0) {
            button30?.background = disabledButton
        }
        val button31 : Button = findViewById(R.id.button31)
        if (checkArray[30] <= 0) {
            button31?.background = disabledButton
        }
        val button32 : Button = findViewById(R.id.button32)
        if (checkArray[31] <= 0) {
            button32?.background = disabledButton
        }
        val button33 : Button = findViewById(R.id.button33)
        if (checkArray[32] <= 0) {
            button33?.background = disabledButton
        }
        val button34 : Button = findViewById(R.id.button34)
        if (checkArray[33] <= 0) {
            button34?.background = disabledButton
        }
        val button35 : Button = findViewById(R.id.button35)
        if (checkArray[34] <= 0) {
            button35?.background = disabledButton
        }
        val button36 : Button = findViewById(R.id.button36)
        if (checkArray[35] <= 0) {
            button36?.background = disabledButton
        }
        val button37 : Button = findViewById(R.id.button37)
        if (checkArray[36] <= 0) {
            button37?.background = disabledButton
        }
        val button38 : Button = findViewById(R.id.button38)
        if (checkArray[37] <= 0) {
            button38?.background = disabledButton
        }
        val button39 : Button = findViewById(R.id.button39)
        if (checkArray[38] <= 0) {
            button39?.background = disabledButton
        }
        val button40 : Button = findViewById(R.id.button40)
        if (checkArray[39] <= 0) {
            button40?.background = disabledButton
        }
        val button41 : Button = findViewById(R.id.button41)
        if (checkArray[40] <= 0) {
            button41?.background = disabledButton
        }
        val button42 : Button = findViewById(R.id.button42)
        if (checkArray[41] <= 0) {
            button42?.background = disabledButton
        }
        val button43 : Button = findViewById(R.id.button43)
        if (checkArray[42] <= 0) {
            button43?.background = disabledButton
        }
        val button44 : Button = findViewById(R.id.button44)
        if (checkArray[43] <= 0) {
            button44?.background = disabledButton
        }
        val button45 : Button = findViewById(R.id.button45)
        if (checkArray[44] <= 0) {
            button45?.background = disabledButton
        }
        val button46 : Button = findViewById(R.id.button46)
        if (checkArray[45] <= 0) {
            button46?.background = disabledButton
        }
        val button47 : Button = findViewById(R.id.button47)
        if (checkArray[46] <= 0) {
            button47?.background = disabledButton
        }
        val button48 : Button = findViewById(R.id.button48)
        if (checkArray[47] <= 0) {
            button48?.background = disabledButton
        }
        val button49 : Button = findViewById(R.id.button49)
        if (checkArray[48] <= 0) {
            button49?.background = disabledButton
        }
        val button50 : Button = findViewById(R.id.button50)
        if (checkArray[49] <= 0) {
            button50?.background = disabledButton
        }
        val button51 : Button = findViewById(R.id.button51)
        if (checkArray[50] <= 0) {
            button51?.background = disabledButton
        }
        val button52 : Button = findViewById(R.id.button52)
        if (checkArray[51] <= 0) {
            button52?.background = disabledButton
        }
        val button53 : Button = findViewById(R.id.button53)
        if (checkArray[52] <= 0) {
            button53?.background = disabledButton
        }
        val button54 : Button = findViewById(R.id.button54)
        if (checkArray[53] <= 0) {
            button54?.background = disabledButton
        }
        val button55 : Button = findViewById(R.id.button55)
        if (checkArray[54] <= 0) {
            button55?.background = disabledButton
        }
        val button56 : Button = findViewById(R.id.button56)
        if (checkArray[55] <= 0) {
            button56?.background = disabledButton
        }
        val button57 : Button = findViewById(R.id.button57)
        if (checkArray[56] <= 0) {
            button57?.background = disabledButton
        }
        val button58 : Button = findViewById(R.id.button58)
        if (checkArray[57] <= 0) {
            button58?.background = disabledButton
        }
        val button59 : Button = findViewById(R.id.button59)
        if (checkArray[58] <= 0) {
            button59?.background = disabledButton
        }
        val button60 : Button = findViewById(R.id.button60)
        if (checkArray[59] <= 0) {
            button60?.background = disabledButton
        }
        val button61 : Button = findViewById(R.id.button61)
        if (checkArray[60] <= 0) {
            button61?.background = disabledButton
        }
        val button62 : Button = findViewById(R.id.button62)
        if (checkArray[61] <= 0) {
            button62?.background = disabledButton
        }
        val button63 : Button = findViewById(R.id.button63)
        if (checkArray[62] <= 0) {
            button63?.background = disabledButton
        }
        val button64 : Button = findViewById(R.id.button64)
        if (checkArray[63] <= 0) {
            button64?.background = disabledButton
        }
        val button65 : Button = findViewById(R.id.button65)
        if (checkArray[64] <= 0) {
            button65?.background = disabledButton
        }
        val button66 : Button = findViewById(R.id.button66)
        if (checkArray[65] <= 0) {
            button66?.background = disabledButton
        }
        val button67 : Button = findViewById(R.id.button67)
        if (checkArray[66] <= 0) {
            button67?.background = disabledButton
        }
        val button68 : Button = findViewById(R.id.button68)
        if (checkArray[67] <= 0) {
            button68?.background = disabledButton
        }
        val button69 : Button = findViewById(R.id.button69)
        if (checkArray[68] <= 0) {
            button69?.background = disabledButton
        }
        val button70 : Button = findViewById(R.id.button70)
        if (checkArray[69] <= 0) {
            button70?.background = disabledButton
        }
        val button71 : Button = findViewById(R.id.button71)
        if (checkArray[70] <= 0) {
            button71?.background = disabledButton
        }
        val button72 : Button = findViewById(R.id.button72)
        if (checkArray[71] <= 0) {
            button72?.background = disabledButton
        }
        val button73 : Button = findViewById(R.id.button73)
        if (checkArray[72] <= 0) {
            button73?.background = disabledButton
        }
        val button74 : Button = findViewById(R.id.button74)
        if (checkArray[73] <= 0) {
            button74?.background = disabledButton
        }
        val button75 : Button = findViewById(R.id.button75)
        if (checkArray[74] <= 0) {
            button75?.background = disabledButton
        }
        val button76 : Button = findViewById(R.id.button76)
        if (checkArray[75] <= 0) {
            button76?.background = disabledButton
        }
        val button77 : Button = findViewById(R.id.button77)
        if (checkArray[76] <= 0) {
            button77?.background = disabledButton
        }
        val button78 : Button = findViewById(R.id.button78)
        if (checkArray[77] <= 0) {
            button78?.background = disabledButton
        }
        val button79 : Button = findViewById(R.id.button79)
        if (checkArray[78] <= 0) {
            button79?.background = disabledButton
        }
        val button80 : Button = findViewById(R.id.button80)
        if (checkArray[79] <= 0) {
            button80?.background = disabledButton
        }
        val button81 : Button = findViewById(R.id.button81)
        if (checkArray[80] <= 0) {
            button81?.background = disabledButton
        }
    }
}