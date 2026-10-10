package com.example.attributes

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.Button
import android.graphics.Color
import android.widget.EditText
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonBlackText: Button = findViewById(R.id.blackText)
        val buttonRedText: Button = findViewById(R.id.RedText)
        val buttonSize8: Button = findViewById(R.id.Size8)
        val buttonSize24: Button = findViewById(R.id.Size24)
        val buttonWhiteBack: Button = findViewById(R.id.WhiteBack)
        val buttonYellowBack: Button = findViewById(R.id.YellowBack)
        val editText: EditText = findViewById(R.id.editText)

        buttonBlackText.setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }

        buttonRedText.setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        buttonSize8.setOnClickListener {
            editText.textSize = 8f
        }

        buttonSize24.setOnClickListener {
            editText.textSize = 24f
        }

        buttonWhiteBack.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }

        buttonYellowBack.setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}