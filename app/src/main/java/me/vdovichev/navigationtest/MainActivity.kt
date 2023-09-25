package me.vdovichev.navigationtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.my_button)
        myButton.setOnClickListener {
            // System lag simulation
            Thread.sleep(3000)
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
