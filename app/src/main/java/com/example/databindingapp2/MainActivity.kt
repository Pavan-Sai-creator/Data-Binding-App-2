package com.example.databindingapp2
// https://www.youtube.com/watch?v=9lCIocQ76CI&list=PLRKyZvuMYSIO0jLgj8g6sADnD0IBaWaw2&index=7
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val personObject = Person("Pavan","10.0")
        binding.person = personObject
    }
}