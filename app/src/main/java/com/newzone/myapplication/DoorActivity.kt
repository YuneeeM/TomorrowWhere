package com.newzone.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.newzone.myapplication.databinding.ActivityDoorBinding

class DoorActivity :AppCompatActivity() {
    private lateinit var binding: ActivityDoorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDoorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.doorSvSearch.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

        binding.doorBtnJoin.setOnClickListener{
            startActivity(Intent(this,JoinActivity::class.java))
        }

        binding.doorBtnLogin.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}