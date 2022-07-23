package com.example.myresume.navigation

const val MACROS_ARGUMENT_KEY = "id"

sealed class Screen(val route: String){
    object AboutScreen: Screen("about")
    object TechnologiesScreen: Screen("technologies")
    object ProjectsScreen: Screen("projects")

    fun withArgs(vararg args: String): String{
        return buildString {
            append(route)
            args.forEach { arg->
                append("/$arg")
            }
        }
    }
}