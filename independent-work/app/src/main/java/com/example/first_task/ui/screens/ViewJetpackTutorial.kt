package com.example.first_task.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first_task.ui.theme.FirstTaskTheme
import com.example.first_task.R
import com.example.first_task.ui.screens.ui.theme.IndependentWorkTheme

class ViewJetpackTutorial : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ViewJetpackTutorialPage()
        }
    }
}

@Composable
fun ViewJetpackTutorialPage(){
    val sharedTextModifiers = Modifier.padding(16.dp).fillMaxWidth()


    IndependentWorkTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(modifier = Modifier.fillMaxSize().padding(innerPadding)) {
                Image(painterResource(id = R.drawable.bg_compose_background), contentDescription = stringResource(R.string.banner), contentScale = ContentScale.Fit, modifier = Modifier.fillMaxWidth())
                Text(text = stringResource(R.string.jetpack_tutorial_title), fontSize = 24.sp, modifier = sharedTextModifiers)
                Text(text = stringResource(R.string.about_jetpack), textAlign = TextAlign.Justify, modifier = sharedTextModifiers)
                Text(text = stringResource(R.string.about_tutorial), textAlign = TextAlign.Justify, modifier = sharedTextModifiers)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ViewJetpackTutorialPreview() {
    ViewJetpackTutorialPage()
}