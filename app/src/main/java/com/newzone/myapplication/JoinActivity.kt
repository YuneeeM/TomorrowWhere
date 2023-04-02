package com.newzone.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.newzone.myapplication.databinding.ActivityJoinBinding

class JoinActivity : AppCompatActivity() {
    private lateinit var binding: ActivityJoinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityJoinBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}