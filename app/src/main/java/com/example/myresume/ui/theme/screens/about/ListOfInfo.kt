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
            ),
            PhotoData(
                title = "University Politehnica Timisoara",
                text = "2021-2025",
                imageResourceId = R.drawable.upt,
                type = 0
            ),
            PhotoData(
                title = "Colegiul Mihai Viteazul Ineu",
                text = "2009-2021",
                imageResourceId = R.drawable.cmv,
                type = 0
            )
        )
    }
}