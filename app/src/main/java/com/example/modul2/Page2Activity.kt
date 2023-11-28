package com.example.modul2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.modul2.databinding.ActivityMainBinding
import com.example.modul2.databinding.ActivityPage2Binding

class Page2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityPage2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnToast2.setOnClickListener{
                var textData  = txtEditText.text.toString()
                Toast.makeText(this@Page2Activity,textData ,Toast.LENGTH_SHORT).show()
            }
        }
    }
}