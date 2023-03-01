/* @Composable
inline fun Box(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    propagateMinConstraints: Boolean = false,
    content: @Composable BoxScope.() -> Unit
) {
    val measurePolicy = rememberBoxMeasurePolicy(contentAlignment, propagateMinConstraints)
    Layout(
        content = { BoxScopeInstance.content() },
        measurePolicy = measurePolicy,
        modifier = modifier
    )
}     */


package com.example.helloworld.utkarsh

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun Three() {
  BoxLayout()
}

@Composable
fun BoxLayout() {

    //wraps content one over the other like frame layout
    Box(
        //contentAlignment = Alignment.Center
    ) {

        Text(text = "Utkarsh", modifier = Modifier.align(Alignment.TopStart))
        Text(text = "Nishkarsh", modifier = Modifier.align(Alignment.CenterStart))
        Text(text = "Ayush", modifier = Modifier.align(Alignment.BottomStart))
    }

}


