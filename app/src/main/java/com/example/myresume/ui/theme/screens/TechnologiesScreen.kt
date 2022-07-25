package com.example.myresume.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myresume.navigation.Screen

@Composable
fun Screen.TechnologiesScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Programming Languages and Frameworks")

        // here insert photos of the programming languages

        Spacer(modifier = Modifier.size(16.dp))

        Text(text = "Databases")

        // here insert photos of the databases used

        Spacer(modifier = Modifier.size(16.dp))

        Text(text = "Tools")

        // here insert version control, ides, editors etc

        Spacer(modifier = Modifier.size(16.dp))
    }
}