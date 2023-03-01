// Output for this code is attached in Pic : ColumnLayout in main Readme.

package com.example.helloworld.utkarsh

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun Three() {
  ColumnLayout()
}

@Composable
fun ColumnLayout() {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "BMW")
        Text(text = "AUDI")
        Text(text = "FERRARI")
    }
}
