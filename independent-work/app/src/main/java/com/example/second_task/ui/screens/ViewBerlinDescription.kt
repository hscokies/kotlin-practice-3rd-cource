package com.example.second_task.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first_task.R
import com.example.second_task.ui.ui.theme.IndependentWorkTheme

class ViewBerlinDescription : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ViewBerlinDescriptionPage()
        }
    }
}

@Composable
fun ViewBerlinDescriptionPage() {
    val textModifiers = Modifier.padding(horizontal = 24.dp).fillMaxWidth()

    IndependentWorkTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),) {
                Image(
                    painterResource(id = R.drawable.berlin),
                    contentDescription = stringResource(R.string.banner),
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp, start = 24.dp, end = 24.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
                Text(text = stringResource(R.string.berlin_title), fontSize = 26.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold, modifier = textModifiers)
                Text(text = stringResource(R.string.berlin_description), fontSize = 20.sp, textAlign = TextAlign.Justify, modifier = textModifiers)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ViewBerlinDescriptionPreview() {
    ViewBerlinDescriptionPage()
}