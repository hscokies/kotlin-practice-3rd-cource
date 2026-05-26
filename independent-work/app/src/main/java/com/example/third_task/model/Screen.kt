package com.example.third_task.model

sealed class Screen(val route: String) {
    object Main : Screen(route = "main")
    object Profile : Screen(route = "profile")
}