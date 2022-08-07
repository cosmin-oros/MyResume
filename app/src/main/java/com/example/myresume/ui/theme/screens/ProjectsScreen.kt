package com.example.myresume.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myresume.navigation.Screen

@Composable
fun ProjectsScreen(navController: NavController) {
    //create image cards that are clickable and expand with more info about the project

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // put two cards on a row

        Row(

        ) {
            /*Image(painter = , contentDescription = )*/

            Spacer(modifier = Modifier.width(16.dp))

            /*Image(painter = , contentDescription = )*/
        }

        Spacer(modifier = Modifier.size(16.dp))

        Row(

        ) {
            /*Image(painter = , contentDescription = )*/

            Spacer(modifier = Modifier.width(16.dp))

            /*Image(painter = , contentDescription = )*/
        }

        Spacer(modifier = Modifier.size(16.dp))
    }
}