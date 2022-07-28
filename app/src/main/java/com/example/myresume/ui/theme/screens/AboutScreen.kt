package com.example.myresume.ui.theme.screens

import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myresume.ui.theme.screens.about.ListOfInfo
import com.example.myresume.ui.theme.screens.technologies.LanguageImage

@Composable
fun AboutScreen(navController: NavController) {
    val info = remember{
        ListOfInfo.getData()
    }
    val info1 = info[0]

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 8.dp)
                .fillMaxWidth(),
            elevation = 2.dp,
            backgroundColor = Color.DarkGray,
            shape = RoundedCornerShape(corner = CornerSize(16.dp))
        ) {
            Row {
                LanguageImage(photoData = info1)

                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .align(Alignment.CenterVertically)
                ) {
                    Text(text = info1.title, style = MaterialTheme.typography.h6)
                    Text(text = info1.text, style = MaterialTheme.typography.caption)
                }
            }
        }

    }

    //below the card insert about, education, etc

}