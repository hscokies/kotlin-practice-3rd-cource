package com.example.third_task.ui.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.third_task.data.GameItemsProvider
import com.example.third_task.model.Game
import com.example.third_task.ui.components.ui.theme.IndependentWorkTheme

class GameImage : ComponentActivity() {
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
fun GameImage(game: Game, modifier: Modifier) {
    Image(
        painter = painterResource(id = game.gameImage),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = modifier.height(78.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GameImagePreview() {
    val item = GameItemsProvider.Item()

    IndependentWorkTheme {
        GameImage(
            game = item,
            modifier = Modifier
        )
    }
}