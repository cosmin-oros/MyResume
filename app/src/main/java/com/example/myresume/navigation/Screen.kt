package com.example.myresume.navigation

const val MACROS_ARGUMENT_KEY = "id"

sealed class Screen(val route: String){
    object SplashScreen: Screen("splash_screen")
    object AboutScreen: Screen("about")
    object TechnologiesScreen: Screen("technologies")
    object ProjectsScreen: Screen("projects")

}