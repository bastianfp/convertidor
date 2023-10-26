package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val textViewOriginalFahrenheit = findViewById<TextView>(R.id.textViewOriginalFahrenheit)
        val textViewResultCelsius = findViewById<TextView>(R.id.textViewResultCelsius)


        val fahrenheit = intent.getDoubleExtra("FAHRENHEIT", 0.0)
        val celsius = intent.getDoubleExtra("CELSIUS", 0.0)

        textViewOriginalFahrenheit.text = "Grados Fahrenheit: $fahrenheit°F"
        textViewResultCelsius.text = "Resultado en Celsius: $celsius°C"
    }
}
