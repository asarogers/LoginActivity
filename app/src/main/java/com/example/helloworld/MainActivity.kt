package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.ViewActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /*passes  values from activity_main to MainActivity file*/
        val signInButton = findViewById<MaterialButton>(R.id.next_button)
        val email = findViewById<TextInputEditText>(R.id.email)
        val password = findViewById<TextInputEditText>(R.id.password)

        /*listens for changes from inputs, converts to string variables   */
            signInButton.setOnClickListener() {
                val theEmail : String = email.text.toString()
                val thePassword : String = password.text.toString()

                /*confirms email && password match*/
                if(theEmail == "man@gmail.com" && thePassword == "123456"){
                    val intent = Intent(this, ViewActivity::class.java)
                    startActivity(intent)
            }
        }
    }
}