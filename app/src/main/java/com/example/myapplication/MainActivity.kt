package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextFahrenheit = findViewById<EditText>(R.id.editTextFahrenheit)
        val buttonConvert = findViewById<Button>(R.id.buttonConvert)

        buttonConvert.setOnClickListener(View.OnClickListener {
            val fahrenheit = editTextFahrenheit.text.toString().toDouble()
            val celsius = (fahrenheit - 32) * 5 / 9

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("FAHRENHEIT", fahrenheit)
            intent.putExtra("CELSIUS", celsius)
            startActivity(intent)
        })
    }
}
