package com.vangood.atobtoa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vangood.atobtoa.databinding.ActivityResult2Binding

class ResultActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityResult2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResult2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}