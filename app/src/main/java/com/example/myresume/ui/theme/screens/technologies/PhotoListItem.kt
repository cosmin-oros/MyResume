package com.example.myresume.ui.theme.screens.technologies

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp

@Composable
fun PhotoListItem(photoData: PhotoData) {
    //if type is 0 do all that, when the photoData is kotlin put a Text Programming Languages
    //when the photoData is the first database put Text Databases
    //when the photoData is the first tool put the Text Tools
    //display the name of the database and the type as text

    if (photoData.type == 0) {
        if (photoData.title == "Oros Cosmin-Cristian"){
            Spacer(modifier = Modifier.size(16.dp))
        }
        
        //check for first
        if (photoData.title == "Kotlin"){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Programming Languages", style = typography.h5, fontFamily = FontFamily.Serif)
            }
        }

        Card(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 8.dp)
                .fillMaxWidth(),
            elevation = 2.dp,
            backgroundColor = Color.DarkGray,
            shape = RoundedCornerShape(corner = CornerSize(16.dp))
        ) {
            Row {
                LanguageImage(photoData = photoData)

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

        if (photoData.title == "Oros Cosmin-Cristian" || photoData.title == "University Politehnica Timisoara" ||
                photoData.title == "Colegiul Mihai Viteazul Ineu"){
            Spacer(modifier = Modifier.size(16.dp))
        }
    }else if (photoData.type == 1){
        //check for first
        if (photoData.title == "MySQL") {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Databases", style = typography.h5, fontFamily = FontFamily.Serif)
            }
        }

            Card(
                modifier = Modifier
                    .padding(horizontal = 8.dp, vertical = 8.dp)
                    .fillMaxWidth(),
                elevation = 2.dp,
                backgroundColor = Color.DarkGray,
                shape = RoundedCornerShape(corner = CornerSize(16.dp))
            ) {
                Row {
                    LanguageImage(photoData = photoData)

                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                            .align(Alignment.CenterVertically)
                    ) {
                        Text(text = photoData.title, style = typography.h6)
                    }
                }
            }

    }else {
        //check for first
        if (photoData.title == "Linux"){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Tools", style = typography.h5, fontFamily = FontFamily.Serif)
            }
        }

        Card(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 8.dp)
                .fillMaxWidth(),
            elevation = 2.dp,
            backgroundColor = Color.DarkGray,
            shape = RoundedCornerShape(corner = CornerSize(16.dp))
        ) {
            Row {
                LanguageImage(photoData = photoData)

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

        //check for last
        if (photoData.title == "Git"){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "", style = typography.h5, fontFamily = FontFamily.Serif)
            }
        }

    }

}

@Composable
fun LanguageImage(photoData: PhotoData) {
    if (photoData.type == 0 || photoData.type == 2) {
        Image(
            painter = painterResource(id = photoData.imageResourceId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(8.dp)
                .size(84.dp)
                .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
        )
    }else if (photoData.type == 1){
        Image(
            painter = painterResource(id = photoData.imageResourceId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(8.dp)
                .size(height = 84.dp, width = 170.dp)
                .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
        )
    }/*else{

    }*/
}