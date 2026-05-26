package com.example.third_task.ui.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.first_task.R
import com.example.third_task.data.GameItemsProvider
import com.example.third_task.model.Game
import com.example.third_task.ui.components.ui.theme.IndependentWorkTheme

class ProfileContent : ComponentActivity() {
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
fun ProfileContent(game: Game, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = game.name,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )
        ProfileProperty(
            key = stringResource(id = R.string.game_profile_released),
            value = game.releaseDate
        )
        ProfileProperty(
            key = stringResource(id = R.string.game_profile_developer),
            value = game.developer
        )
        ProfileProperty(
            key = stringResource(id = R.string.game_profile_genres),
            value = game.genres
        )
        ProfileProperty(
            key = stringResource(id = R.string.game_profile_price),
            value = "${game.price}"
        )
        ProfileProperty(
            key = stringResource(id = R.string.game_profile_description),
            value = game.description
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileContentPreview() {
    val item = GameItemsProvider.Item();

    IndependentWorkTheme {
        ProfileContent(game = item, modifier = Modifier)
    }
}