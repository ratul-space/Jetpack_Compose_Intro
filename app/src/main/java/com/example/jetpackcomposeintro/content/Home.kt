package com.example.jetpackcomposeintro.content

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Home(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
            onClick = {
//                Toast.makeText(context, "Button Clicked", Toast.LENGTH_LONG).show()
                navController.navigate("task")
            },
            shape = CircleShape,
            modifier = Modifier.size(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Green),
        ) {
            Text(
                text = "Chocolate",
                fontSize = 30.sp,
                color = Color.Red
            )
        }
    }
}