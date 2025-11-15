package com.example.doubtbox

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val emailEt = findViewById<EditText>(R.id.etEmail)
        val passEt = findViewById<EditText>(R.id.etPassword)
        val loginBtn = findViewById<Button>(R.id.btnLogin)


        loginBtn.setOnClickListener {
            val email = emailEt.text.toString().trim()
            val pass = passEt.text.toString()


            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                emailEt.error = "Enter a valid email"
                return@setOnClickListener
            }
            if (pass.length < 4) {
                passEt.error = "Password must be at least 4 characters"
                return@setOnClickListener
            }


// For demo: successful login always
            val intent = Intent(this, ChatActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
            finish()
        }
    }
}