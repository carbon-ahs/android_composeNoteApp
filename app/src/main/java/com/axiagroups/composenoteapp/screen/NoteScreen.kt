package com.axiagroups.composenoteapp.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


/**
 * Created by Ahsan Habib on 5/13/2024.
 * shehanuk.ahsan@gmail.com
 */

@Composable
fun NoteScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(6.dp)
    ) {

    }

}

@Preview(showBackground = true)
@Composable
fun NotesScreenPreview(modifier: Modifier = Modifier) {
    NoteScreen()
}
