package com.example.examenandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)
        btn.setOnClickListener {
            setContentView(R.layout.layout_table)
        }
    }
    // Para crear el menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //menuInflater.inflate()
        return true
    }
}