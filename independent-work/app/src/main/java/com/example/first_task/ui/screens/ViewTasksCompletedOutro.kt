package com.example.first_task.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first_task.R
import com.example.first_task.ui.screens.ui.theme.IndependentWorkTheme

class ViewTasksCompletedOutro : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ViewTasksCompletedOutroPage()
        }
    }
}

@Composable
fun ViewTasksCompletedOutroPage(){
    IndependentWorkTheme() {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(modifier = Modifier.fillMaxSize().padding(innerPadding), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                Image(painterResource(R.drawable.ic_task_completed), contentDescription = stringResource(R.string.banner), contentScale = ContentScale.Fit)
                Text(text = stringResource(R.string.tasks_completed_title), fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 24.dp, bottom = 8.dp))
                Text(text = stringResource(R.string.tasks_completed_subtitle), fontSize = 16.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ViewTasksCompletedOutroPreview() {
    ViewTasksCompletedOutroPage()
}