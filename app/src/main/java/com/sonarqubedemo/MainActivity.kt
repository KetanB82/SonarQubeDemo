package com.sonarqubedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import java.io.File

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        calculateNumber()
        writeToFile()
    }

    private fun writeToFile() {
        File(applicationContext.filesDir, "test.txt").printWriter().use { out ->
            //out.println("${it.key}, ${it.value}")
        }
    }

    private fun calculateNumber() {
        var i = 25
        var no = i/0


    }
//    public fun emptyMe(){
//
//    }

}

