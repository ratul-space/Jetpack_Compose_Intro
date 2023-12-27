package com.example.jetpackcomposeintro

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

class LegacyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legacy)
    }

    data class User(
        val id: Int
    )

    @Composable
    fun MainContent() {
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

    @Composable
    fun UserList(users: List<User>) {
        LazyColumn {
            items(users) { user ->
                UserCard()
            }
        }
    }

    @Composable
    fun UserCard() {
        val context = LocalContext.current
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(12.dp)
                .border(width = 1.dp, color = Color.LightGray)
                .padding(12.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )
            Column {
                Text(text = stringResource(id = R.string.user_name))
                Button(onClick = {
                    Toast.makeText(context, "Your life is in good", Toast.LENGTH_LONG).show()

                }) {
                    Text(text = "View Profile")
                }
            }
        }
    }
}