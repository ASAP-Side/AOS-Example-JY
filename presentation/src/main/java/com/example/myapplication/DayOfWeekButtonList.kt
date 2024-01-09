package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Black
import com.example.myapplication.ui.theme.Blue
import com.example.myapplication.ui.theme.Gray
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.presentation.R

@Composable
fun DayOfWeekButton(
    text: Int,
) {
    var selected by remember { mutableStateOf(false) }
    val bgColor = if (selected) Blue else Gray

    Box(
        modifier = Modifier
            .clip(CircleShape)
            .fillMaxHeight()
            .width(40.dp)
            .background(color = bgColor)
            .clickable { selected = !selected },
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.Center),
            text = stringResource(text),
            color = Black,
            fontSize = 16.sp,
        )
    }
}

@Composable
fun DayOfWeekButtonList() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(40.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        DayOfWeekButton(text = R.string.monday)
        DayOfWeekButton(text = R.string.tuesday)
        DayOfWeekButton(text = R.string.wednesday)
        DayOfWeekButton(text = R.string.thursday)
        DayOfWeekButton(text = R.string.friday)
        DayOfWeekButton(text = R.string.saturday)
        DayOfWeekButton(text = R.string.sunday)
    }
}

@Preview
@Composable
fun DayOfWeekButtonListPreview() {
    MyApplicationTheme {
        DayOfWeekButtonList()
    }
}