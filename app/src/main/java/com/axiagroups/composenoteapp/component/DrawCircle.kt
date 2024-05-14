package com.axiagroups.composenoteapp.component

import android.content.Context
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.axiagroups.composenoteapp.ui.theme.circleColor1


/**
 * Created by Ahsan Habib on 5/13/2024.
 * shehanuk.ahsan@gmail.com
 */

@Composable
fun DrawCircle(
    modifier: Modifier = Modifier,
    color: Color,
    opacity: Float = 1.0f,
    sizeFactor: Float = 0.0f,
) {
    Canvas(modifier = modifier.fillMaxSize()) {
        drawCircle(
            color = color,
            radius = size.minDimension / 4 + sizeFactor,
            alpha = opacity,
        )
    }
}

@Preview
@Composable
fun Preview(modifier: Modifier = Modifier) {
    DrawCircle(color = circleColor1, sizeFactor = 300f)
}
