//after deletion each item in a row is recomposed.

package com.example.helloworld.utkarsh

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.SpaceBetween
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.drawable.IconCompatParcelizer

@Composable
fun ManageStateScreen() {
    TodoScreen()
}


@Composable
fun TodoScreen() {

    val todoList = remember { mutableStateListOf("Utkarsh","Nishkarsh","Prakhar","Vidushi") }
    val scrollState = rememberScrollState()


    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {
                todoList.add("New User")
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
            }
        }
    )
    {
           Column(
               modifier = Modifier.verticalScroll(scrollState)
           ) {
               todoList.forEach{
                   Row(
                       modifier = Modifier
                           .fillMaxWidth()
                           .padding(top = 10.dp, start = 10.dp),
                       horizontalArrangement = SpaceBetween
                   ) {
                       Text(text = it)
                       IconButton(onClick = {
                           todoList.remove(it)
                       }) {
                           Icon(imageVector = Icons.Default.Delete, contentDescription = "")
                       }
                   }
               }
           }
    }
}
