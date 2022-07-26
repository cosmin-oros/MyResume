package com.example.myresume.ui.theme.screens.technologies

import com.example.myresume.R

object ListOfPhotos{
    fun getData(): ArrayList<PhotoData>{
        return arrayListOf(
            PhotoData(
                title = "Kotlin",
                text = "Android development, Backend, OOP",
                imageResourceId = R.drawable.kotlin,
                type = 0
            ),
            PhotoData(
                title = "C",
                text = "Data Structures and Algorithms",
                imageResourceId = R.drawable.c,
                type = 0
            ),
            PhotoData(
                title = "C++",
                text = "Data Structures and Algorithms, OOP",
                imageResourceId = R.drawable.cpp,
                type = 0
            ),
            PhotoData(
                title = "Java",
                text = "OOP, GUI, Games",
                imageResourceId = R.drawable.java,
                type = 0
            ),
            PhotoData(
                title = "Python",
                text = "ComputerVision (AI), Graphics, Games, OOP",
                imageResourceId = R.drawable.python,
                type = 0
            ),
            PhotoData(
                title = "C#",
                text = "Desktop Applications, OOP",
                imageResourceId = R.drawable.csharp,
                type = 0
            ),
            PhotoData(
                title = "Matlab",
                text = "Matrix manipulations, plotting of functions and data",
                imageResourceId = R.drawable.matlab,
                type = 0
            ),
            PhotoData(
                title = "Dart",
                text = "Cross platform mobile development (Flutter)",
                imageResourceId = R.drawable.dart,
                type = 0
            ),
            PhotoData(
                title = "Bash",
                text = "Command line work, security scripts",
                imageResourceId = R.drawable.bash,
                type = 0
            )

            //make databases type 1 and tools type 2

            //add databases and tools
        )
    }
}