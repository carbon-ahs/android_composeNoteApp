package com.axiagroups.composenoteapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.axiagroups.composenoteapp.component.BottomArc
import com.axiagroups.composenoteapp.component.ExternalButton
import com.axiagroups.composenoteapp.component.InternalButton
import com.axiagroups.composenoteapp.component.LoginButton
import com.axiagroups.composenoteapp.ui.theme.circleColor1


/**
 * Created by Ahsan Habib on 5/14/2024.
 * shehanuk.ahsan@gmail.com
 */
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                text = "Login",
                modifier = Modifier.padding(40.dp),
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )

            Row(
                modifier = Modifier.fillMaxWidth(0.70f),
                horizontalArrangement = Arrangement.Center
            ) {
                InternalButton(modifier = Modifier.weight(1f), isActive = true)

                Spacer(modifier = Modifier.width(2.dp))

                ExternalButton(modifier = Modifier.weight(1f))
            }

            Spacer(modifier = Modifier.height(40.dp))

            OutlinedTextField(
                value = "", onValueChange = {},
                label = { Text("User ID") },
                modifier = Modifier.fillMaxWidth(.7f)
                )

            Spacer(modifier = Modifier.height(2.dp))

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("Password") },
                modifier = Modifier.fillMaxWidth(.7f))

            Spacer(modifier = Modifier.height(40.dp))

            LoginButton()
            Spacer(modifier = Modifier.height(50.dp))

            Box(

            ) {
                BottomArc(modifier = Modifier.align(Alignment.CenterEnd))
            }
        }

    }
}