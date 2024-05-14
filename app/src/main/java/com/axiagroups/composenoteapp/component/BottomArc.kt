package com.axiagroups.composenoteapp.component

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.axiagroups.composenoteapp.R
import com.axiagroups.composenoteapp.ui.theme.SplashBackground
import com.axiagroups.composenoteapp.ui.theme.circleColor1
import com.axiagroups.composenoteapp.ui.theme.circleColor3


/**
 * Created by Ahsan Habib on 5/14/2024.
 * shehanuk.ahsan@gmail.com
 */
@Composable
fun BottomArc(modifier: Modifier = Modifier) {

    Box {
        Canvas(
            modifier = modifier.fillMaxSize()
        ) {
            val width = size.width
            val height = size.height
            Log.d("TAG", "BottomArc: " + size.width)
            drawArc(
                color = SplashBackground,
                startAngle = 0f,
                sweepAngle = -180f,
                useCenter = true,
            )
            drawRect(
                color = SplashBackground,
                size = Size(width, 400f),
                topLeft = Offset(0f, 230f)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.ic_eticket_logo),
            contentDescription = null,
            modifier = Modifier.size(240.dp)
                .align(Alignment.Center)
        )
    }
}

