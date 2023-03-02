/* Unlike XML, compose can't keep track of the states. Hence we use remember function.
Output of this code is in Pic1 in main Readme.     */


package com.example.helloworld.utkarsh

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ManageStateScreen() {
    CounterLayout()
}

@Composable
fun CounterLayout() {

    val counter = remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text(text = "${counter.value}", fontSize = 25.sp)
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {
            counter.value ++
        })
        {
            Text(text = "Counter")
        }
    }
}
