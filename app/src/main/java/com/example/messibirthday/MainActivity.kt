package com.example.messibirthday

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.messibirthday.DB.DBHelper

class MainActivity : AppCompatActivity() {
    private lateinit var dbHelper: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnInfoGeneral = findViewById<Button>(R.id.btnInfoGeneral)
        val btnPremios = findViewById<Button>(R.id.btnPremios)
        val btnGoles = findViewById<Button>(R.id.btnGoles)

        dbHelper = DBHelper(this)

        btnInfoGeneral.setOnClickListener {
            dbHelper.insertInfoGeneral()

        }

        btnPremios.setOnClickListener {
            dbHelper.insertPremios()

        }

        btnGoles.setOnClickListener {
            dbHelper.insertGoles()

        }


    }
}