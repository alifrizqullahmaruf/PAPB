package com.example.helloworld1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.helloworld1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btn01.setOnClickListener {
                val namaValue = nama.text.toString()
                if (namaValue.isNotEmpty()) {
                    val message = "Mari kita laporkan $namaValue"
                    Toast.makeText(this@MainActivity, message, Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this@MainActivity, "Nama belum diisi", Toast.LENGTH_LONG).show()
                }
            }

            btn02.setOnClickListener {
                Toast.makeText(this@MainActivity, "Mari kita pukuli", Toast.LENGTH_LONG).show()
            }
        }
    }
}