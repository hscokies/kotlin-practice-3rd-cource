package com.example.third_task.model

data class Game(
    val id: Int,
    val name: String,
    val description: String,
    val releaseDate: String,
    val developer: String,
    val gameImage: Int,
    val genres: String,
    val price: Int
)
