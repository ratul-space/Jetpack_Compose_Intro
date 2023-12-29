package com.example.jetpackcomposeintro.content

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeintro.User
import com.example.jetpackcomposeintro.UserList

@Composable
fun AddMoreButton() {
    val user = User(1)
    val users = remember { mutableStateListOf(user) }

    Box(modifier = Modifier.fillMaxSize()) {
        UserList(users = users)
        Button(modifier =
        Modifier
            .padding(24.dp)
            .align(Alignment.BottomCenter),
            onClick = {
                users.add(User(1))

            }) {
            Text(text = "Add More")
        }
    }
}

@Preview
@Composable
fun AddMoreButtonPreview() {
    AddMoreButton()
}