package com.example.myresume.ui.theme.screens

import android.provider.ContactsContract
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
        Text(text = "Programming Languages (Sorted by how much I've worked in them)")

        Column() {
            // here insert photos of the programming languages
            //sort them by how much I've used them and their use case


        }

        Spacer(modifier = Modifier.size(32.dp))

        Text(text = "Databases")

        Row() {
            // here insert photos of the databases used
        }

        Spacer(modifier = Modifier.size(16.dp))

        Text(text = "Tools")

        Row() {
            // here insert version control, ides, editors etc
        }

    }
}