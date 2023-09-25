package me.vdovichev.navigationtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
android.util.Log.d("SUPERTAG", "SecondActivity.onCreate")
    }
}
