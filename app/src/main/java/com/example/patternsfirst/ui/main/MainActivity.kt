package com.example.patternsfirst.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.patternsfirst.common.builders.TextViewBuilder
import com.example.patternsfirst.databinding.ActivityMainBinding
import com.example.patternsfirst.utils.DataManager

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getFullList()
    }

    private fun getFullList() {
        DataManager.fullList.forEach {
            binding.mainTextView.apply {
                text = TextViewBuilder(text.toString())
                    .addLine(it.name)
                    .getResult()
            }

            it.startWatching()
        }
    }
}