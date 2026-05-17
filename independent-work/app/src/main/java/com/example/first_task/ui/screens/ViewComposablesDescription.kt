package com.example.first_task.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.first_task.R
import com.example.first_task.ui.screens.ui.theme.IndependentWorkTheme

class ViewComposablesDescription : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ViewComposablesDescriptionPage()
        }
    }
}

@Composable
fun ViewComposablesDescriptionPage() {
    IndependentWorkTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) {
                Row(modifier = Modifier.weight(1f))  {
                    Cell(
                        stringResource(R.string.text_composable_title),
                        stringResource(R.string.text_composable_description),
                        colorResource(R.color.cute_lavender),
                        Modifier.weight(1f)
                    )
                    Cell(
                        stringResource(R.string.image_composable_title),
                        stringResource(R.string.image_composable_description),
                        colorResource(R.color.pastel_light_violet),
                        Modifier.weight(1f)
                    )
                }
                Row(modifier = Modifier.weight(1f))  {
                    Cell(
                        stringResource(R.string.row_composable_title),
                        stringResource(R.string.row_composable_description),
                        colorResource(R.color.bright_ube),
                        Modifier.weight(1f)
                    )
                    Cell(
                        stringResource(R.string.column_composable_title),
                        stringResource(R.string.column_composable_description),
                        colorResource(R.color.mystic_white),
                        Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Composable
fun Cell(title: String, description: String, background: Color, modifier: Modifier = Modifier) {
    Box(contentAlignment = Alignment.Center, modifier = modifier.fillMaxSize().background(background).padding(16.dp)){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(text = description)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ViewComposablesDescriptionPreview() {
    ViewComposablesDescriptionPage()
}