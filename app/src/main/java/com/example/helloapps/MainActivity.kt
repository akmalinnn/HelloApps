package com.example.helloapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //passive
    private val name: String = "Akmal"
    //active
    private val isErrorNetwork: Boolean = true

    //diawali huruf kecil, active
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}