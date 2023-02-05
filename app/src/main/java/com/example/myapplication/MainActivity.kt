package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.checkPass).setOnClickListener {
            val haslo1=findViewById<EditText>(R.id.hasloPod).text.toString()
            val haslo2=findViewById<EditText>(R.id.hasloPotw).text.toString()

            findViewById<CheckBox>(R.id.checDuza).isChecked = Pattern.compile(".*[A-Z].*").matcher(haslo1).matches() ||
                    Pattern.compile(".*[A-Z].*").matcher(haslo2).matches()

            findViewById<CheckBox>(R.id.checkMala).isChecked = Pattern.compile(".*[a-z].*").matcher(haslo1).matches() ||
                    Pattern.compile(".*[a-z].*").matcher(haslo2).matches()

            findViewById<CheckBox>(R.id.checkCyfra).isChecked = Pattern.compile(".*\\d.*").matcher(haslo1).matches() ||
                    Pattern.compile(".*\\d.*").matcher(haslo2).matches()

            findViewById<CheckBox>(R.id.checkSpecj).isChecked = Pattern.compile(".*[~!@#\$%^&*()_+{}\\\\[\\\\]:;,.<>/?-].*").matcher(haslo1).matches() ||
                    Pattern.compile(".*[~!@#\$%^&*()_+{}\\\\[\\\\]:;,.<>/?-].*").matcher(haslo2).matches()

            findViewById<CheckBox>(R.id.checkZgodn).isChecked = haslo1 == haslo2
        }

    }
}