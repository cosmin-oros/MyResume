package com.example.myresume.ui.theme.screens.about

import com.example.myresume.R
import com.example.myresume.ui.theme.screens.technologies.PhotoData

object ListOfInfo {
    fun getData(): ArrayList<PhotoData>{
        return arrayListOf(
            PhotoData(
                title = "Oros Cosmin-Cristian",
                text = "Software Engineer | Android Developer",
                imageResourceId = R.drawable.photo,
                type = 0
            )
        )
    }
}