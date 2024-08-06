package com.example.myfirstapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myfirstapplication.databinding.ActivityLoginPageBinding
import com.example.myfirstapplication.databinding.ActivitySignUpPageBinding

class Login_Page : AppCompatActivity() {
    private val binding : ActivityLoginPageBinding by lazy {
        ActivityLoginPageBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.loginButtonClick.setOnClickListener{
            val intent=Intent(this, SignUpPage::class.java)
            startActivity(intent)
        }
        binding.donthavebutton.setOnClickListener{
            val intent=Intent(this, SignUpPage::class.java)
            startActivity(intent)
        }


    }
}