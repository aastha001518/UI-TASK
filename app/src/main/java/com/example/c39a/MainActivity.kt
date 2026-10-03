package com.example.c39a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Change this line to show a different screen:
            // InstagramUI()  /  SpotifyHomeScreen()  /  TravelCardScreen()
            SpotifyHomeScreen()
        }
    }
}

