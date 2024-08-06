package com.example.myfirstapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myfirstapplication.databinding.ActivityStartPageBinding

class StartPage : AppCompatActivity() {
    private val binding:ActivityStartPageBinding by lazy {
        ActivityStartPageBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.nextbutton.setOnClickListener{
            val intent=Intent(this, Login_Page ::class.java)
            startActivity(intent)
        }
    }
}