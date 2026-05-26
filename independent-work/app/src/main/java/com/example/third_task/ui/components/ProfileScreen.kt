package com.example.third_task.ui.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.first_task.R
import com.example.third_task.data.GameItemsProvider
import com.example.third_task.ui.components.ui.theme.IndependentWorkTheme

class ProfileScreen : ComponentActivity() {
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
fun ProfileScreen(id: Int?) {
    if (id == null) {
        Text(text = String.format(stringResource(id = R.string.game_profile_notFound), id));
        return;
    }

    val gameList = remember { GameItemsProvider.Items() }

    val game = gameList.find { it.id == id }
    if (game == null) {
        Text(text = String.format(stringResource(id = R.string.game_profile_notFound), id));
        return;
    }

    Column(modifier = Modifier.fillMaxSize()) {
        ProfileHeader(game = game)
        ProfileContent(game = game, modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val item = GameItemsProvider.Item();
    IndependentWorkTheme {
        ProfileScreen(id = 2)
    }
}