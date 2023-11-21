package com.example.exampletuits.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exampletuits.R
import com.example.exampletuits.ui.theme.ExampleTuitsTheme


@Composable
fun TwitScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0XFF17173F))
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .fillMaxSize(0.5f)
        ) {
            IconUser()
            Spacer(modifier = Modifier.size(8.dp))
            BodyContent(Modifier)
        }
        Divider(
            Modifier
                .height(1.dp)
                .fillMaxWidth(), color = Color.Gray
        )
    }
}

@Composable
fun BodyContent(modifier: Modifier) {
    Row(
        modifier
            .fillMaxWidth()
            .padding(top = 12.dp), horizontalArrangement = Arrangement.Start
    ) {
        Text(text = "Aris",
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            color = Color.White)
        Spacer(modifier = Modifier.size(8.dp))
        Text(text = "@ArtistiDev  4h",
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            color = Color.Gray)
    }
    Icon(painterResource(id = R.drawable.ic_dots), contentDescription = "")
}

@Composable
fun IconUser() {
    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "avatar",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(40.dp)
            .clip(CircleShape)
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TwitsPreview() {
    ExampleTuitsTheme {
        TwitScreen()
    }
}