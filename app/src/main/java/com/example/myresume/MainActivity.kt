package com.example.myresume

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.myresume.navigation.BottomNavItem
import com.example.myresume.ui.theme.MyResumeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyResumeTheme {
                val navController = rememberNavController()

                Scaffold(
                    bottomBar = {
                        BottomNavigationBar(
                            items = listOf(
                                BottomNavItem(
                                    name = "About",
                                    route = "about",
                                    icon = Icons.Filled
                                ),
                                BottomNavItem(
                                    name = "Technologies",
                                    route = "technologies",
                                    icon = Icons.Filled
                                ),
                                BottomNavItem(
                                    name = "Projects",
                                    route = "projects",
                                    icon = Icons.Filled
                                ),
                            ),
                            navController = navController,
                            onItemClick = {
                                navController.navigate(it.route)
                            }
                            //change background default Color
                        )
                    }
                ) {
                    /*Navigation(navController = navController)*/
                }
            }
        }
    }
}

