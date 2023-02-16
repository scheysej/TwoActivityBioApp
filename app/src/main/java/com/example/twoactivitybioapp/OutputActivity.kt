package com.example.twoactivitybioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.twoactivitybioapp.databinding.ActivityMainBinding
import com.example.twoactivitybioapp.databinding.ActivityOutputBinding

class OutputActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOutputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOutputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gradYearText = intent.getStringExtra("gradYearTF")
        val firstNameText = intent.getStringExtra("fNameTF")
        val lastNameText = intent.getStringExtra("lNameTF")
        val schoolText = intent.getStringExtra("schoolTF")
        val favActsText = intent.getStringExtra("favActsTF")
        val degText = intent.getStringExtra("degTF")
        val spinnerThingText = intent.getStringExtra("spinnerThing")

        val result = "$firstNameText $lastNameText graduated in $gradYearText with a " +
                "$degText with a concentration in $spinnerThingText from $schoolText. " +
                "Their favorite activities are $favActsText."

        binding.outputTF.text = result

    }
}