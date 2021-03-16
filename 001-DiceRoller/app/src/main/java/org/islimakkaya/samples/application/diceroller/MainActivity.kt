package org.islimakkaya.samples.application.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onStart()
    }

    override fun onStart() {
        super.onStart()
        val rollDiceButton : Button = findViewById(R.id.button_rolldice)
        val cleanButton : Button = findViewById(R.id.button_clean)

        rollDiceButton.setOnClickListener {
            onRollDiceClicked()
        }

        cleanButton.setOnClickListener {
            onCleanButtonClicked()
        }
    }

    private fun onCleanButtonClicked() {
        val diceImage : ImageView = findViewById(R.id.diceImage)
        val diceImage2 : ImageView = findViewById(R.id.diceImage2)

        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }

    private fun onRollDiceClicked() {
       Toast.makeText(this, "Zar Atıldı", Toast.LENGTH_SHORT).show();

        val randomNum1 = (1..6).random()
        var randomNum2 = (1..6).random()

        while (randomNum1 == randomNum2)
            randomNum2 = (1..6).random()

        val diceImage : ImageView = findViewById(R.id.diceImage)
        val diceImage2 : ImageView = findViewById(R.id.diceImage2)

        val dice1 = Dice()
        dice1.roll(randomNum1, diceImage)
        val dice2 = Dice()
        dice2.roll(randomNum2, diceImage2)
    }
}



