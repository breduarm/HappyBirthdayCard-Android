package com.beam.happybirthdaycard.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.beam.happybirthdaycard.R
import com.beam.happybirthdaycard.ui.theme.HappyBirthdayCardTheme

@Composable
fun QuadrantScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(modifier = modifier.weight(1f)) {
            QuadrantItem(
                backGroundColor = Color(0xFFEADDFF),
                title = stringResource(R.string.quadrant_item_title_text),
                content = stringResource(R.string.quadrant_item_content_text),
                modifier = modifier.weight(1f),
            )
            QuadrantItem(
                backGroundColor = Color(0xFFD0BCFF),
                title = stringResource(R.string.quadrant_item_title_image),
                content = stringResource(R.string.quadrant_item_content_image),
                modifier = modifier.weight(1f),
            )
        }
        Row(modifier = modifier.weight(1f)) {
            QuadrantItem(
                backGroundColor = Color(0xFFB69DF8),
                title = stringResource(R.string.quadrant_item_title_row),
                content = stringResource(R.string.quadrant_item_content_row),
                modifier = modifier.weight(1f),
            )
            QuadrantItem(
                backGroundColor = Color(0xFFF6EDFF),
                title = stringResource(R.string.quadrant_item_title_column),
                content = stringResource(R.string.quadrant_item_content_column),
                modifier = modifier.weight(1f),
            )
        }
    }
}

@Composable
fun QuadrantItem(
    backGroundColor: Color,
    title: String,
    content: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(backGroundColor)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun QuadrantScreenPreview() {
    HappyBirthdayCardTheme {
        QuadrantScreen()
    }
}
