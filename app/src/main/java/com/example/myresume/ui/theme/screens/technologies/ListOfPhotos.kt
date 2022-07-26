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
            ),
            PhotoData(
                title = "MySQL",
                text = "",
                imageResourceId = R.drawable.mysql,
                type = 1
            ),
            PhotoData(
                title = "SQLite",
                text = "",
                imageResourceId = R.drawable.sqlite,
                type = 1
            ),
            PhotoData(
                title = "MongoDB",
                text = "",
                imageResourceId = R.drawable.mongodb,
                type = 1
            ),
            PhotoData(
                title = "Firebase",
                text = "",
                imageResourceId = R.drawable.firebase,
                type = 1
            ),
            PhotoData(
                title = "Linux",
                text = "OS",
                imageResourceId = R.drawable.linux,
                type = 2
            ),
            PhotoData(
                title = "VSCode",
                text = "C/C++ projects",
                imageResourceId = R.drawable.vscode,
                type = 2
            ),
            PhotoData(
                title = "Android Studio",
                text = "Android apps",
                imageResourceId = R.drawable.androidstudio,
                type = 2
            ),
            PhotoData(
                title = "Intellij",
                text = "Java / Kotlin projects",
                imageResourceId = R.drawable.intellij,
                type = 2
            ),
            PhotoData(
                title = "Pycharm",
                text = "Python projects",
                imageResourceId = R.drawable.pycharm,
                type = 2
            ),
            PhotoData(
                title = "Git",
                text = "Version control",
                imageResourceId = R.drawable.git,
                type = 2
            )
        )
    }
}