package com.example.myresume.ui.theme.screens.technologies

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PhotoListItem(photoData: PhotoData) {
    Row {
       Column(
           modifier = Modifier
               .padding(16.dp)
               .fillMaxWidth()
               .align(Alignment.CenterVertically)
       ) {
           Text(text = photoData.title, style = typography.h6)
           Text(text = photoData.text, style = typography.caption)
       } 
    }
}