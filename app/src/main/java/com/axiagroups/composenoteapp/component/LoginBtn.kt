package com.axiagroups.composenoteapp.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


/**
 * Created by Ahsan Habib on 5/14/2024.
 * shehanuk.ahsan@gmail.com
 */

@Composable
fun LoginButton(modifier: Modifier = Modifier) {
    Button(
        onClick = { /*TODO*/ }, 
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.width(150.dp)
    ) {
        Text(
            text = "Sign In",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
        )
    }
}