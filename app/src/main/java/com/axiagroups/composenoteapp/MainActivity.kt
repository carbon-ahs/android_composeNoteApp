package com.axiagroups.composenoteapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.axiagroups.composenoteapp.component.CustomTopAppBar
import com.axiagroups.composenoteapp.ui.theme.ComposeNoteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeNoteAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { CustomTopAppBar() }
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Click to Init")
                        }
                        Button(
                            onClick = {
                                val intent = Intent(this@MainActivity, TestActivity::class.java)
                                startActivity(intent)
                            }) {
                            Text(text = "Click to Test")
                        }
                        Button(
                                onClick = {
                                    val intent = Intent(this@MainActivity, SplashScreenActivity::class.java)
                                    startActivity(intent)
                                }) {
                            Text(text = "Click to Splash")
                        }
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Login Screen frm tut")
                        }

                    }

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeNoteAppTheme {
    }
}

