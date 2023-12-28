package com.example.jetpackcomposeintro.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


class Main_Content {

    @Composable
    fun Main_Content(){
        Surface (
            modifier = Modifier.fillMaxSize()
        ){

        }


    }

}

@Preview
@Composable
fun MainPriview(){
    Main_Content()
}