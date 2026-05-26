package com.example.third_task.ui.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.first_task.R
import com.example.third_task.data.GameItemsProvider
import com.example.third_task.ui.components.ui.theme.IndependentWorkTheme

class ProfileProperty : ComponentActivity() {
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
fun ProfileProperty(key: String, value: String) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Spacer(modifier = Modifier.size(4.dp))
        Text(
            text = key,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            overflow = TextOverflow.Visible
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePropertyPreview() {
    val game = GameItemsProvider.Items().first();

    IndependentWorkTheme {
        ProfileProperty(
            key = stringResource(R.string.game_profile_description),
            value = game.description
        );
    }
}