// Now we will create a floating action button inside scaffold.

package com.example.helloworld.utkarsh

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Helper() {

    Scaffold(topBar =
    {
        TopAppBar(title =
        {
            Text(text = "Utkarsh")
        },
            contentColor = Color.Black,
            backgroundColor = Color.Yellow,
            elevation = 0.dp,
            navigationIcon =
            {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "")
            },
            actions =
            {
                //row scope means to horizontally align our content
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
                Icon(imageVector = Icons.Default.MoreVert, contentDescription = "")
            }
        )
    },
        floatingActionButton =
        {
            FloatingActionButton(onClick = {})
            {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
            }
        },
        
        bottomBar =
        {
            BottomAppBar()
            {
                Icon(imageVector = Icons.Default.Person, contentDescription = "")
                Icon(imageVector = Icons.Default.Home, contentDescription = "")
            }
        },
        
        drawerContent =
        {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "")
        }

    ) {
        // Whatever we write here appears on the screen
    }
}
