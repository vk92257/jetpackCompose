package com.example.compose.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
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
fun Header(title: String , modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        Row() {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "back",
                tint = Color.Black,
                modifier = Modifier
                    .size(40.dp)
                    .padding(start = 5.dp, top = 5.dp)
            )


            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "App Icon",
                modifier = Modifier
                    .size(350.dp, 160.dp)
                    .padding(end = 30.dp),
            )
        }



        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(65.dp)
                .background(colorResource(id = R.color.blackSecondary)),
        ) {
            Text(
                text =  title,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth(),
                color = Color.White,
                fontWeight = FontWeight(700),
                fontSize = 25.sp,
                textAlign = TextAlign.Center
            )
        }


    }
}