package com.example.third_task.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.third_task.data.GameItemsProvider
import com.example.third_task.ui.components.GameItem
import com.example.third_task.ui.components.ui.theme.IndependentWorkTheme

class MainScreen : ComponentActivity() {
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
fun MainScreen(navigationController: NavController) {
    val games = GameItemsProvider.Items()

    LazyColumn(
        contentPadding = PaddingValues(all = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(games) { game ->
            GameItem(
                game = game,
                navigationController = navigationController,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(78.dp)
            )
        }
    }
}