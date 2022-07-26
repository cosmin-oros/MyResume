package com.example.myresume.ui.theme.screens.technologies

import com.example.myresume.R

object ListOfPhotos{
    fun getData(): ArrayList<PhotoData>{
        return arrayListOf(
            PhotoData(
                imageResourceId = R.drawable.kotlin
            ),
            PhotoData(
                imageResourceId = R.drawable.c
            ),
            PhotoData(
                imageResourceId = R.drawable.cpp
            ),
            PhotoData(
                imageResourceId = R.drawable.java
            ),
            PhotoData(
                imageResourceId = R.drawable.python
            ),
            PhotoData(
                imageResourceId = R.drawable.csharp
            ),
            PhotoData(
                imageResourceId = R.drawable.matlab
            ),
            PhotoData(
                imageResourceId = R.drawable.dart
            ),
            PhotoData(
                imageResourceId = R.drawable.bash
            )

            //add databases and tools
        )
    }
}