package com.example.third_task.ui.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.third_task.data.GameItemsProvider
import com.example.third_task.model.Game
import com.example.third_task.model.Screen
import com.example.third_task.ui.components.ui.theme.IndependentWorkTheme

class GameItem : ComponentActivity() {
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
fun GameItem(game: Game, navigationController: NavController, modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = modifier
            .clip(shape = MaterialTheme.shapes.extraSmall)
            .shadow(2.dp)
            .clickable() {
                navigationController.navigate(route = "${Screen.Profile.route}/${game.id}")
            }
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            GameImage(
                game, modifier = Modifier
                    .weight(0.4f)
                    .wrapContentHeight()
            )
            Column(
                modifier = Modifier.weight(0.4f),
                verticalArrangement = Arrangement.spacedBy(30.dp)
            ) {
                InlineText(
                    text = game.name,
                    style = MaterialTheme.typography.titleMedium,
                )
                InlineText(
                    text = game.genres,
                    color = Color.Gray,
                )
            }
            Text(
                text = "${game.price} руб.",
                modifier = Modifier.weight(0.2f),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun InlineText(text: String, style: TextStyle = TextStyle.Default, color: Color = Color.Black) {
    Text(
        text = text,
        style = style,
        color = color,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}

@Preview(showBackground = true)
@Composable
fun GameItemPreview() {
    val dummyNavController = rememberNavController()
    val item = GameItemsProvider.Item();

    IndependentWorkTheme {
        GameItem(
            game = item,
            navigationController = dummyNavController,
            modifier = Modifier
        )
    }
}