// Output for this code is attached in Pic : RowLayout in main Readme.

package com.example.helloworld.utkarsh

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun Three() {
    RowLayout()
}

@Composable
fun RowLayout() {
    //row aligns data horizontally
    Row(horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.run {
            background(Color.Yellow)
        }
    )
    {
        Text(text = "Apple")
        Text(text = "Banana")
        Text(text = "Oranges")
    }

}
