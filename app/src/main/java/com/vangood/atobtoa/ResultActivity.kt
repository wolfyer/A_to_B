package com.vangood.atobtoa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.vangood.atobtoa.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding:ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val name = intent.getStringExtra("NAME")
        binding.pName.text = name.toString()
        val num = intent.getStringExtra("NUMBER")
        binding.pNum.text = num.toString()
        binding.bOk.setOnClickListener {
            var i = 1
            var backdata = Intent()
            backdata.putExtra("BACK",i)
            setResult(RESULT_OK,backdata)
            finish()
            Toast.makeText(this,"finish",Toast.LENGTH_LONG).show()
        }
        Toast.makeText(this,"OK i",Toast.LENGTH_LONG).show()

    }
}