/*  
fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    elevation: ButtonElevation? = ButtonDefaults.elevation(),
    shape: Shape = MaterialTheme.shapes.small,
    border: BorderStroke? = null,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    content: @Composable RowScope.() -> Unit
)    */


package com.example.helloworld.utkarsh

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun ButtonLayout() {
    
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) 
    {
        val context = LocalContext.current
        Button(onClick = {
            Toast.makeText(context,"Simple Button", Toast.LENGTH_SHORT).show()
        },

            modifier = Modifier.fillMaxWidth().padding(15.dp)
            )
        {
            Text(text = "Button Here")
        }
    }
}
