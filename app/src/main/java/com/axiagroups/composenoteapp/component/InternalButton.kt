package com.axiagroups.composenoteapp.component

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.axiagroups.composenoteapp.ui.theme.LoginTypeActiveButtonColor
import com.axiagroups.composenoteapp.ui.theme.LoginTypeButtonColor


/**
 * Created by Ahsan Habib on 5/14/2024.
 * shehanuk.ahsan@gmail.com
 */
@Composable
fun InternalButton(
    modifier: Modifier = Modifier,
    btnText: String = "Internal",
    isActive: Boolean = false,
) {
    val btnColor: Color = if (isActive == true) {
        LoginTypeActiveButtonColor
    } else
        LoginTypeButtonColor
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp),
        modifier = modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(containerColor = btnColor)
    ) {
        Text(text = btnText,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            )
    }
}