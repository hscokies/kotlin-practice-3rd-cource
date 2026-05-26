package com.example.third_task.ui.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.third_task.data.GameItemsProvider
import com.example.third_task.model.Game
import com.example.third_task.ui.components.ui.theme.IndependentWorkTheme

class ProfileHeader : ComponentActivity() {
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
fun ProfileHeader(game: Game) {
    Image(
        painter = painterResource(id = game.gameImage),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun ProfileHeaderPreview() {
    val item = GameItemsProvider.Item();

    IndependentWorkTheme {
        ProfileHeader(
            game = item,
        )
    }
}