package com.akaiyukiusagi.roomsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.room.Room
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: SampleViewModel by viewModels()
        viewModel.insert(uid = 1, firstName = "佐藤", lastName = "太郎")
    }

}

// 公式：https://developer.android.com/training/data-storage/room?hl=ja