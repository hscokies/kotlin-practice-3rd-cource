package com.example.third_task.ui.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.third_task.model.Screen
import com.example.third_task.ui.components.ui.theme.IndependentWorkTheme
import com.example.third_task.ui.screens.MainScreen


class SetupNavigationHost : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IndependentWorkTheme {
            }
        }
    }
}

@Composable
fun SetupNavigationHost(navigationController: NavHostController) {
    NavHost(
        navController = navigationController,
        startDestination = Screen.Main.route,
    ) {
        composable(route = Screen.Main.route) {
            MainScreen(navigationController = navigationController)
        }
        composable(route = "${Screen.Profile.route}/{id}") { backStack ->
            val id = backStack.arguments?.getString("id")?.toInt()
            ProfileScreen(id = id)
        }
    }
}