package com.example.second_task.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first_task.R
import com.example.second_task.ui.screens.ui.theme.IndependentWorkTheme

class Authorization : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AuthorizationPage()
        }
    }
}

@Composable
fun AuthorizationPage() {
    IndependentWorkTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.authorization_title),
                    fontSize = 24.sp,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Textbox(stringResource(R.string.authorization_email), Modifier)
                Textbox(
                    stringResource(R.string.authorization_password),
                    Modifier.padding(top = 16.dp)
                )
                Button(
                    onClick = { },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                ) {
                    Text(stringResource(R.string.authorization_button), fontSize = 20.sp)
                }
            }
        }
    }
}

@Composable
fun Textbox(placeholder: String, modifier: Modifier) {
    TextField(
        state = rememberTextFieldState(),
        placeholder = {
            Text(text = placeholder)
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun AuthorizationPagePreview() {
    AuthorizationPage()
}