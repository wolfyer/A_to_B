package com.vangood.atobtoa

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.View
import androidx.activity.result.contract.ActivityResultContract
import com.vangood.atobtoa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.simpleName
    val REQUEST_DISPLAY =16
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun doprint(view :View){
        var name = binding.tnName.text.toString()
        var num = binding.tnNumber.text.toString()
        val intentname = Intent(this,ResultActivity::class.java)
        intentname.putExtra("NAME",name)
        val intentnum = Intent(this,ResultActivity::class.java)
        intentnum.putExtra("NUMBER",num)
        Log.d(TAG, "doprint: can run")
        startActivity(intentname)
        startActivityForResult(intentnum,REQUEST_DISPLAY)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_DISPLAY && resultCode == RESULT_OK){
            Log.d(TAG, "onActivityResult: 1")

        }
    }
    class NameContract:ActivityResultContract<Float,String>(){
        override fun createIntent(context: Context, input: Float?): Intent {
            val sandval = Intent(context,ResultActivity2::class.java)
            return sandval
        }

        override fun parseResult(resultCode: Int, intent: Intent?): String {
            TODO("Not yet implemented")
        }


    }
}