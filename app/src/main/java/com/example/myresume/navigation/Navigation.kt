package com.example.myresume.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash_screen") {
        composable(Screen.SplashScreen.route) {
            /*SplashScreen(navController = navController)*/
        }
        composable(Screen.AboutScreen.route)
        {
            /*AboutScreen(navController = navController)*/
        }
        composable(Screen.TechnologiesScreen.route) {
            /*TechnologiesScreen(navController = navController)*/
        }
        composable(Screen.ProjectsScreen.route) {
            /*ProjectsScreen(navController = navController)*/
        }
    }
}