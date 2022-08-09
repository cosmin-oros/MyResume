package com.example.myresume.ui.theme.screens.about

import com.example.myresume.R

object ListOfImageCards {
    fun getData(): ArrayList<ImageCardData>{
        return arrayListOf(
            ImageCardData(
              imageResId = R.drawable.fitnessapp1,
              description = "Fitness App",
              title = "Fitness App"
            ),
            //insert the rest of the photos
            /*ImageCardData(
                imageResId = R.drawable.fitnessapp1,
                description = "Fitness App",
                title = "Fitness App"
            ),
            ImageCardData(
                imageResId = R.drawable.fitnessapp1,
                description = "Fitness App",
                title = "Fitness App"
            ),
            ImageCardData(
                imageResId = R.drawable.fitnessapp1,
                description = "Fitness App",
                title = "Fitness App"
            ),*/
        )
    }
}