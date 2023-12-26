package com.example.jetpackcomposeintro

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ColorRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Title()
        }
    }
}

@Composable
fun Title() {
    val context = LocalContext.current

    Text(
        text = "test",
        fontSize = 32.sp,
        fontFamily = FontFamily.Cursive,
        color = Color.Companion.Green,
        modifier = Modifier.clickable{
            Toast.makeText(context, "test clicked!", Toast.LENGTH_LONG).show()
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Title()
    }
}
