package com.axiagroups.composenoteapp

import android.os.Bundle
import android.text.TextUtils
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import com.axiagroups.composenoteapp.component.BottomArc
import com.axiagroups.composenoteapp.component.DrawCircle
import com.axiagroups.composenoteapp.screen.LoginScreen
import com.axiagroups.composenoteapp.ui.theme.ComposeNoteAppTheme
import com.axiagroups.composenoteapp.ui.theme.circleColor1

class TestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeNoteAppTheme {
                val mContext = LocalContext.current
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
//                    LoginScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
