package com.example.myresume.ui.theme.screens

import android.annotation.SuppressLint
import android.provider.ContactsContract
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
fun Screen.TechnologiesScreen(navController: NavController) {
    val photosList = ListOfPhotos.getData()
    var counter = 0
    var photo = mutableStateOf(getPhoto(photosList, counter))

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Programming Languages (Sorted by how much I've worked in them)")

        Column() {
            // here insert photos of the programming languages
            //sort them by how much I've used them and their use case

            var painter = painterResource(id = photo.value.imageResourceId)

            //kotlin
            Image(painter = painter, contentDescription = "")
            counter++
            photo.value = getPhoto(photosList, counter)

            Spacer(modifier = Modifier.size(8.dp))


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

fun getPhoto(photosList: List<PhotoData>, counter: Int): PhotoData{
    return photosList[counter]
}