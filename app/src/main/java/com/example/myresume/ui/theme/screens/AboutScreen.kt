package com.example.myresume.ui.theme.screens

import android.graphics.Paint
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myresume.ExpandableCard
import com.example.myresume.ui.theme.screens.about.ListOfInfo
import com.example.myresume.ui.theme.screens.technologies.LanguageImage
import com.example.myresume.ui.theme.screens.technologies.PhotoListItem

@Composable
fun AboutScreen(navController: NavController) {
    val info = remember{
        ListOfInfo.getData()
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ){
            items(
                items = info,
                itemContent = {
                    PhotoListItem(photoData = it)
                }
            )
        }
        
        Spacer(modifier = Modifier.size(16.dp))
        
        ExpandableCard(
            title = "ABOUT",
            description = "Experienced in C/C++ and Android Development(Kotlin).\n\n" +
                    "I consider myself proactive, a hard and smart worker, always willing to learn new things and challenge myself to become better every day.\n" +
                    "\n"
        )

        Spacer(modifier = Modifier.size(64.dp))
        
        Text(text = "")

    }




}