package com.blocket.igeday

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val priceText = findViewById<TextView>(R.id.text_price)
        val plusButton = findViewById<Button>(R.id.button_plus)
        val minusButton =  findViewById<Button>(R.id.button_minus)

        var price: Int = 2000
        var newPrice: Int = 0
        val priceString : String = "Pris: "

        plusButton.setOnClickListener {
            newPrice = ++price
            price = newPrice
            priceText.setText(priceString + price.toString())
        }

        minusButton.setOnClickListener {
            newPrice = --price
            price = newPrice
            priceText.setText(priceString + price.toString())
        }
    }
}