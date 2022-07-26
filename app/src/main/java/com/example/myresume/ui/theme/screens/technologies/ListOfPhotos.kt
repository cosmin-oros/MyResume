package com.example.myresume.ui.theme.screens.technologies

import com.example.myresume.R

object ListOfPhotos{
    fun getData(): ArrayList<PhotoData>{
        return arrayListOf(
            PhotoData(
                title = "Kotlin",
                text = "Android development, Backend, OOP",
                imageResourceId = R.drawable.kotlin
            ),
            PhotoData(
                title = "C",
                text = "Data Structures and Algorithms",
                imageResourceId = R.drawable.c
            ),
            PhotoData(
                title = "C++",
                text = "Data Structures and Algorithms, OOP",
                imageResourceId = R.drawable.cpp
            ),
            PhotoData(
                title = "Java",
                text = "OOP, GUI, Games",
                imageResourceId = R.drawable.java
            ),
            PhotoData(
                title = "Python",
                text = "ComputerVision (AI), Graphics, Games, OOP",
                imageResourceId = R.drawable.python
            ),
            PhotoData(
                title = "C#",
                text = "Desktop Applications, OOP",
                imageResourceId = R.drawable.csharp
            ),
            PhotoData(
                title = "Matlab",
                text = "Matrix manipulations, plotting of functions and data",
                imageResourceId = R.drawable.matlab
            ),
            PhotoData(
                title = "Dart",
                text = "Cross platform mobile development (Flutter)",
                imageResourceId = R.drawable.dart
            ),
            PhotoData(
                title = "Bash",
                text = "Command line work, security scripts",
                imageResourceId = R.drawable.bash
            )

            //add databases and tools
        )
    }
}