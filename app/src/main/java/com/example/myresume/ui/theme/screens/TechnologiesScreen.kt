package com.example.myresume.ui.theme.screens

import android.annotation.SuppressLint
import android.provider.ContactsContract
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
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

@SuppressLint("UnrememberedMutableState")
@Composable
fun TechnologiesScreen(navController: NavController) {
    val photosList = ListOfPhotos.getData()
    var counter = 0
    var photo = mutableStateOf(getPhoto(photosList, counter))

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){

    }

    Spacer(modifier = Modifier.height(32.dp))

    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {

    }

    Spacer(modifier = Modifier.height(32.dp))

    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {

    }
}

fun getPhoto(photosList: List<PhotoData>, counter: Int): PhotoData{
    return photosList[counter]
}