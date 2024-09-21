package com.nikulindev.tictactoeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nikulindev.tictactoeapp.databinding.ActivityMainBinding
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace<MainFragment>(R.id.mainContainer)
            }
        }

    }
}
