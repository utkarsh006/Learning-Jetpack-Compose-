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
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            elevation = ButtonDefaults.elevation(defaultElevation = 0.dp),
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(width = 5.dp, color = Color.Yellow),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black, contentColor = Color.White),
            contentPadding = PaddingValues(vertical = 40.dp)
            )

        {
            Text(text = "Button Here")
        }
    }
}
