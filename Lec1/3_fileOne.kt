/* Here we will draw our topBar which we would implement using scaffold.
Ctrl+Click on TopAppBar to see available list of features inside it. 
Don't forget to call Helper function inside setContent in the Main Activity
Output of this project is shown in Main Readme file.               */

package com.example.helloworld.utkarsh

import android.annotation.SuppressLint
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
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
    }

    ) {
        
    }
}
