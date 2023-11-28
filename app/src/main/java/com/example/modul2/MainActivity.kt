package com.example.modul2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.modul2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            txtNumber.text = number.toString()
            btnPlus.setOnClickListener{
                number ++
                txtNumber.text = number.toString()
            }
            btnMinus.setOnClickListener{
                number --
                txtNumber.text = number.toString()
            }
            btnToast.setOnClickListener{
                Toast.makeText(this@MainActivity, "Count $number", Toast.LENGTH_SHORT).show()
            }
            btnNext.setOnClickListener {
                val intent = Intent(this@MainActivity, Page2Activity::class.java)
                startActivity(intent)
            }

        }


    }

}