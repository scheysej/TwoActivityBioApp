package com.example.twoactivitybioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.twoactivitybioapp.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Spinner Things
        val majors = resources.getStringArray(R.array.spinnerItems)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, majors)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val spinner = findViewById<Spinner>(binding.spinner.id)
        spinner.adapter = adapter

        binding.createButton.setOnClickListener{
            val intent = Intent(this, OutputActivity::class.java)

            //Strings
            intent.putExtra("gradYearTF", binding.editGradYear.text.toString())
            intent.putExtra("fNameTF", binding.editFirstName.text.toString())
            intent.putExtra("lNameTF", binding.editLastName.text.toString())
            intent.putExtra("schoolTF", binding.editSchool.text.toString())
            intent.putExtra("favActsTF", binding.editFavActs.text.toString())
            intent.putExtra("degTF", binding.editDegree.text.toString())

            //Spinner
            intent.putExtra("spinnerThing",binding.spinner.selectedItem.toString())

            startActivity(intent)


        }





    }
}