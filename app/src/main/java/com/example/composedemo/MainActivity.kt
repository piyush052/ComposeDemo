package com.example.composedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Spacing
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    MaterialTheme {
        Surface(color = Color.Yellow) {
            VerticalScroller {
                for (i in 1..10) {
                    Column {
                        Greeting(name = "Android", i = i)
                        Divider(color = Color.Black)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, i: Int) {
    Text(text = "Hello $name! $i", modifier = Spacing(24.dp))
}


@Preview
@Composable
fun DefaultPreview() {
    MyApp()
}
