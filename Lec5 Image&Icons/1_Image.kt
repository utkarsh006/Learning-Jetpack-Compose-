package com.example.helloworld.utkarsh

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.helloworld.R

@Composable
fun ImageLayoutScreen() {
    ImageLayout()
    // IconLayout()
}

@Composable
fun ImageLayout() {

//    Column(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {

        Image(
            painter = painterResource(id = R.drawable.ram),
            contentDescription = "Jai Shri Ram",
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Fit,
            alpha =  0.2f, //alpha is used for transparency. This parameter of Image accepts a float value between 0.0 and 1.0 corresponding to full transparency to no transparency
            //colorFilter = ColorFilter.tint(color = Color.Gray)
        )
   // }

}

@Composable
fun IconLayout() {

    Icon(imageVector = Icons.Outlined.Home, contentDescription = "Home",
         modifier = Modifier.size(50.dp),
         tint = Color.Red)

}
