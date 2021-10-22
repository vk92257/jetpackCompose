package com.example.compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.compose.Info.Info
import com.example.compose.buttons.CircularButton
import com.example.compose.buttons.GradientCircularButton
import com.example.compose.header.Header
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxHeight(),
                    ) {
                        Header(
                            "VERIFY PASSCODE", modifier =
                            Modifier.weight(3f)
                        )
                        Info()
                        CircularButton()
                        GradientCircularButton()
                    }


                }
            }
        }
    }


    fun showMessage() {
        Toast.makeText(this, "message", Toast.LENGTH_SHORT).show()
    }

}