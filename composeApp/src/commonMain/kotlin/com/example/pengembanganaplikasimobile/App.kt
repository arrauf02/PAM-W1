package com.example.pengembanganaplikasimobile

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable

fun App() {
    MaterialTheme { // Material Design theme
        var showContent by remember { // State management
            mutableStateOf(false)
        }

        Column( // Vertical layout
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center

        ) {
            Text("Hello, Arrauf Setiawan Muhammad Jabar!") // Text component
            Text("NIM: 123140032")

            Button( // Button component
                onClick = { showContent = !showContent }
            ) {
                Text("Click me!")
            }

            AnimatedVisibility(showContent) { // Animation
                Text("Platform: ${getPlatform().name}")           }
        }
    }
}
