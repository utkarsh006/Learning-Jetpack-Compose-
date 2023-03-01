package com.example.helloworld.utkarsh

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextGeometricTransform
import androidx.compose.ui.unit.sp
import com.example.helloworld.ui.theme.customFont

@Composable
fun Textlearn() {
   // androidx.compose.material.Text(text = "Utkarsh", color= Color.Red, fontSize = 20.sp)

    androidx.compose.material.Text(text = "How are you Bro?", style = TextStyle(
        color = Color.Red,
        fontSize = 50.sp,
       // fontFamily = FontFamily.Cursive,

        //using custom font
          fontFamily = customFont,  //defined in Type.kt
          fontWeight = FontWeight.SemiBold,
          fontStyle = FontStyle.Italic,
          letterSpacing = 12.sp,
          textDecoration = TextDecoration.Underline,
          shadow = Shadow(
              color = Color.Red,
              offset = Offset(5f,5f),
              blurRadius = 2.0f
          ),

          textGeometricTransform = TextGeometricTransform(
              scaleX = 1.4f,
              skewX = 0.5f
          ),

           textAlign = TextAlign.Center

    ), maxLines = 5)
}
