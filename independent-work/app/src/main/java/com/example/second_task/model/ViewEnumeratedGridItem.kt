package com.example.second_task.model

import androidx.annotation.DrawableRes

data class ViewEnumeratedGridItem(
    val id: Int,
    val title: String,
    @param:DrawableRes val image: Int
)