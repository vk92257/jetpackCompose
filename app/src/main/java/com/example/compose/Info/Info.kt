package com.example.compose.Info

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.R

/**
 * @Author: Vivek
 * @Date: 21/10/21
 */

@Composable
@Preview
fun Info(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "You are signing in to route",
            modifier = Modifier
                .fillMaxWidth(),
            color = colorResource(id = R.color.textColor),
            fontSize = 15.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "13/01 B-002",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            color = colorResource(id = R.color.textColor),
            fontWeight = FontWeight(700),
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = "PASSCODE INCORRECT",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, bottom = 30.dp),
            color = colorResource(id = R.color.error),
            fontWeight = FontWeight(1000),
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        ) {


/*                OutlinedTextField(
                    value = "*", onValueChange = {},
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = colorResource(id = R.color.borderRed),
                        unfocusedBorderColor = colorResource(id = R.color.borderRed)
                    ),
                    modifier = Modifier
                        .background(Color.Transparent)
                        .widthIn(35.dp, 35.dp)
                )*/
            for (i in 0..5)
                OutlinedButton(
                    onClick = {},
                    border = BorderStroke(2.dp, colorResource(id = R.color.borderRed)),
                    modifier = Modifier
                        .background(Color.Transparent)
                        .size(42.dp, 42.dp)
                ) {
                    Text(
                        text = "*",
                        color = colorResource(id = R.color.black),
                    )
                }
        }

        Text(
            text = "Resend Passcode",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp, bottom = 35.dp),
            color = colorResource(id = R.color.textColor),
            fontSize = 15.sp,
            textAlign = TextAlign.Center
        )

    }
}