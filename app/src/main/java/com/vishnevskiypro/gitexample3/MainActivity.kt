package com.vishnevskiypro.gitexample3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vishnevskiypro.gitexample3.databinding.ActivityMainBinding

var counter = 0

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.buttonCount.setOnClickListener {
            counter++
            binding.counterField.text = counter.toString()
        }

        //my fifth commit + new Feature
    }
}
