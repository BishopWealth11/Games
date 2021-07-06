package com.bishopwealth.games.models

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bishopwealth.games.databinding.ActivityPropertyBinding
import com.bishopwealth.games.databinding.ActivityPropertyBinding

class PropertyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPropertyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPropertyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            imageAnimal.setImageResource(intent.getStringExtra("imageAnimal")!!.toInt())
            textfirstname.text = intent.getStringExtra("textfirstname")
            textsurname.text = intent.getStringExtra("textsurname")
        }
    }
}