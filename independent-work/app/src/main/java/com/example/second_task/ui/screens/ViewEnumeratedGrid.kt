package com.example.second_task.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first_task.R
import com.example.second_task.ui.model.ViewEnumeratedGridItem
import com.example.second_task.ui.screens.ui.theme.IndependentWorkTheme

class ViewEnumeratedGrid : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ViewEnumeratedGridPage();
        }
    }
}

@Composable
fun ViewEnumeratedGridPage() {
    val cells = listOf(
        ViewEnumeratedGridItem(id = 0, title = "Zero", R.drawable.ic_launcher_background),
        ViewEnumeratedGridItem(id = 1, title = "One", R.drawable.ic_launcher_background),
        ViewEnumeratedGridItem(id = 2, title = "Two", R.drawable.ic_launcher_background),
        ViewEnumeratedGridItem(id = 3, title = "Three", R.drawable.ic_launcher_background),
        ViewEnumeratedGridItem(id = 4, title = "Four", R.drawable.ic_launcher_background),
        ViewEnumeratedGridItem(id = 5, title = "Five", R.drawable.ic_launcher_background),
        ViewEnumeratedGridItem(id = 6, title = "Six", R.drawable.ic_launcher_background),
        ViewEnumeratedGridItem(id = 7, title = "Seven", R.drawable.ic_launcher_background),
        ViewEnumeratedGridItem(id = 8, title = "Eight", R.drawable.ic_launcher_background),
        ViewEnumeratedGridItem(id = 9, title = "Nine", R.drawable.ic_launcher_background),
        ViewEnumeratedGridItem(id = 10, title = "Ten", R.drawable.ic_launcher_background)
    )

    IndependentWorkTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            LazyVerticalGrid(
                columns = GridCells.Fixed(count = 2),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)

            ) {
                items(cells) { cell ->
                    ViewEnumeratedGridCell(cell)
                }
            }
        }
    }
}

@Composable
fun ViewEnumeratedGridCell(data: ViewEnumeratedGridItem){
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = data.title, fontSize = 24.sp)
        Spacer(modifier = Modifier.size(8.dp))
        Image(
            painter = painterResource(data.image),
            contentDescription = stringResource(R.string.banner),
            modifier = Modifier.aspectRatio(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun ViewEnumeratedGridPreview() {
    ViewEnumeratedGridPage();
}