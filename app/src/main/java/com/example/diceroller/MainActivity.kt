package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        Toast.makeText(
            this, "button clicked",
            Toast.LENGTH_SHORT
        ).show()
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val diceImage2: ImageView = findViewById(R.id.dice_image2)
        val diceImage3: ImageView = findViewById(R.id.dice_image3)

        diceImage.setImageResource(getDice())
        diceImage2.setImageResource(getDice())
        diceImage3.setImageResource(getDice())
    }

        private fun getDice():Int {
            val randomInt = Random().nextInt(6) + 1
         return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }



    }
}