package com.example.uielementspart1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val firstName = findViewById<TextView>(R.id.firstName)
        val firstNameTxt = intent.getStringExtra("FirstName")
        firstName.text = firstNameTxt

        val lastName = findViewById<TextView>(R.id.lastName)
        val lastNameTxt = intent.getStringExtra("LastName")
        lastName.text = lastNameTxt

        val age = findViewById<TextView>(R.id.age)
        val ageValue = intent.getStringExtra("Age")
        age.text = ageValue

        val birthdate = findViewById<TextView>(R.id.birthdate)
        val birthdateValue = intent.getStringExtra("Birthdate")
        birthdate.text = birthdateValue

        val emailAddress = findViewById<TextView>(R.id.email)
        val emailTxt= intent.getStringExtra("Email")
        emailAddress.text = emailTxt

        val phoneNumber = findViewById<TextView>(R.id.phone)
        val phoneNumberValue = intent.getStringExtra("Phone")
        phoneNumber.text = phoneNumberValue
    }


}