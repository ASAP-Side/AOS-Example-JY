package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.SweetPotato
import com.example.myapplication.ui.theme.White
import com.example.presentation.R

@Composable
fun EndDateButton(
    text: Int,
    width: Dp,
) {
    Box(
        modifier = Modifier
            .clip(RectangleShape)
            .height(35.dp)
            .width(width)
            .background(color = SweetPotato)
            .clickable { /*TODO*/ }
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.Center),
            text = stringResource(text),
            color = White,
            fontSize = 14.sp
        )
    }
}

@Composable
fun EndDateButtonList(
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        EndDateButton(text = R.string.end_year, width = 91.dp)
        EndDateButton(text = R.string.end_month, width = 46.dp)
        EndDateButton(text = R.string.end_date, width = 46.dp)
    }
}

@Preview
@Composable
fun EndDateButtonListPreview() {
    MyApplicationTheme {
        EndDateButtonList()
    }
}