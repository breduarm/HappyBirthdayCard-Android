package com.beam.happybirthdaycard.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.beam.happybirthdaycard.R
import com.beam.happybirthdaycard.ui.theme.HappyBirthdayCardTheme

@Composable
fun TaskManagerScreen(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = null,
        )
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp),
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TaskManagerScreenPreview() {
    HappyBirthdayCardTheme {
        TaskManagerScreen()
    }
}
