package com.axiagroups.composenoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.axiagroups.composenoteapp.component.DrawCircle
import com.axiagroups.composenoteapp.ui.theme.ComposeNoteAppTheme
import com.axiagroups.composenoteapp.ui.theme.SplashBackground
import com.axiagroups.composenoteapp.ui.theme.circleColor1
import com.axiagroups.composenoteapp.ui.theme.circleColor2
import com.axiagroups.composenoteapp.ui.theme.circleColor3

class SplashScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeNoteAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                            .background(SplashBackground),
                        contentAlignment = Alignment.Center
                    ){
                        DrawCircle(color = circleColor3, sizeFactor = 365f)
                        DrawCircle(color = circleColor2, sizeFactor = 220f)
                        DrawCircle(color = circleColor1, sizeFactor = 75f)
                        Image(
                            painter = painterResource(id = R.drawable.ic_eticket_logo),
                            contentDescription = null,
                            modifier = Modifier.size(240.dp)
                        )
                        Text(
                            text = "Developed by Hi-Tech IT",
                            modifier = Modifier.align(Alignment.BottomCenter)
                                .padding(vertical = 16.dp)
                        )
                    }

                }
            }
        }
    }
}
