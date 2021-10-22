package com.example.compose.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
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
fun CircularButton(modifier: Modifier = Modifier, onclick:() -> Unit = {}) {
    /*  Card(
          modifier = Modifier
              .fillMaxWidth()
              .padding(start = 30.dp,end = 30.dp)
              .height(80.dp),
          shape = RoundedCornerShape(50.dp),
          backgroundColor = colorResource(id = R.color.blackSecondary)
      ) {
          Text(
              text =  "VERIFY",
              color = Color.White,
              fontWeight = FontWeight(700),
              fontSize = 25.sp,
              textAlign = TextAlign.Center
          )
      }*/


    Button(
        onClick = onclick,
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp, top = 10.dp, bottom = 10.dp)
            .height(60.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colorResource(id = R.color.blackSecondary),
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(50.dp),
    ) {
        Text(
            text = "VERIFY",
            modifier = modifier
                .align(Alignment.CenterVertically)
                .fillMaxWidth(),
            color = Color.White,
            fontWeight = FontWeight(700),
            fontSize = 17.sp,
            textAlign = TextAlign.Center
        )
    }


    /*   Card(
           modifier = Modifier
               .fillMaxWidth()
               .padding(start = 30.dp,end = 30.dp)
               .height(80.dp),
           shape = RoundedCornerShape(50.dp),
           backgroundColor = colorResource(id = R.color.blackSecondary)
       ) {
           Row(
               modifier = Modifier
                   .fillMaxWidth()
           ) {
               Text(
                   text =  "VERIFY",
                   modifier = Modifier
                       .align(Alignment.CenterVertically)
                       .fillMaxWidth(),
                   color = Color.White,
                   fontWeight = FontWeight(700),
                   fontSize = 30.sp,
                   textAlign = TextAlign.Center
               )
           }
       }*/


}

@Preview
@Composable
fun GradientCircularButton(modifier: Modifier = Modifier, onclick: () -> Unit = {}) {

    val horizontalGradientBrush = Brush.horizontalGradient(
        colors = listOf(
            Color(0xFF55F2E1),
            Color(0xFF55E3E9),
            Color(0xFF55D3F2)
        )
    )
    Button(
        onClick = onclick,
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp, top = 10.dp, bottom = 10.dp)
            .height(60.dp)
            .background(brush = horizontalGradientBrush),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = Color.White,
        ),
        shape = RoundedCornerShape(50.dp),
    ) {
        Text(
            text = "DRIVER HELP DESK",
            modifier = modifier
                .fillMaxWidth()
                .align(alignment = Alignment.CenterVertically)
                .padding(start = 30.dp, end = 30.dp, top = 10.dp, bottom = 10.dp)
                .height(60.dp),
            color = Color.White,
            fontWeight = FontWeight(700),
            fontSize = 17.sp,
            textAlign = TextAlign.Center
        )
    }

    val verticalGradientBrush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF55F2E1),
            Color(0xFF55E3E9),
            Color(0xFF55D3F2)
        )
    )

    /*Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp, top = 10.dp, bottom = 10.dp)
            .height(60.dp),
    ) {
        Text(
            text = "DRIVER HELP DESK",
            modifier = Modifier
                .background(brush = horizontalGradientBrush)
                .fillMaxHeight()
                .fillMaxHeight(),
            color = colorResource(id = R.color.black)

        )
    }*/

}









