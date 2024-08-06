package com.example.myfirstapplication

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myfirstapplication.databinding.ActivityChooseLocationBinding

class choose_location : AppCompatActivity() {
    private val binding :ActivityChooseLocationBinding by lazy {
        ActivityChooseLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        val locationList= arrayOf("Kalabagh", "Chashma Nuclear Power Plant", "M.M Alam Pakistan Airforce Base", "Namal Institute", "Kallur", "Kalri", "Khaglan Wala", "Khola At Khanqah Sirajia", "Kundian", "Daud Khel", "Musa Khel", "Mochh", "Harnoli", "Rokhri", "Wan Bhachran", "Piplan")
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1,locationList)
        val  autoCompleteTextView : AutoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)

    }
}