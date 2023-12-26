package com.example.jetpackcomposeintro.content

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ContentTitle() {
    val context = LocalContext.current
    Text(
        text = "test",
        fontSize = 32.sp,
        fontFamily = FontFamily.Cursive,
        color = Color.Green,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.clickable {
            Toast.makeText(context, "test clicked!", Toast.LENGTH_LONG).show()
        }
    )
}