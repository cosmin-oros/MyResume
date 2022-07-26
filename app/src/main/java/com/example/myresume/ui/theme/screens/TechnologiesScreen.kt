package com.example.myresume.ui.theme.screens

import android.annotation.SuppressLint
import android.provider.ContactsContract
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myresume.ImageCard
import com.example.myresume.navigation.Screen
import com.example.myresume.ui.theme.screens.technologies.ListOfPhotos
import com.example.myresume.ui.theme.screens.technologies.PhotoData
import com.example.myresume.ui.theme.screens.technologies.PhotoListItem

@SuppressLint("UnrememberedMutableState")
@Composable
fun TechnologiesScreen(navController: NavController) {
    val photosList = remember{
        ListOfPhotos.getData()
    }
    var counter = 0

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items = photosList,
            itemContent = {
                PhotoListItem(photoData = it)
            }
        )
    }



}

fun getPhoto(photosList: List<PhotoData>, counter: Int): PhotoData{
    return photosList[counter]
}