package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
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

enum class DayOfWeek(val stringRes: Int) {
    MONDAY(R.string.monday),
    TUESDAY(R.string.tuesday),
    WEDNESDAY(R.string.wednesday),
    THURSDAY(R.string.thursday),
    FRIDAY(R.string.friday),
    SATURDAY(R.string.saturday),
    SUNDAY(R.string.sunday);
}

@Composable
fun DayOfWeekButton(
    text: String,
    selected: Boolean,
    onClick: () -> Unit,
) {
    val bgColor = if (selected) Blue else Gray

    Box(
        modifier = Modifier
            .clip(CircleShape)
            .height(40.dp)
            .width(40.dp)
            .background(color = bgColor)
            .clickable { onClick() },
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.Center),
            text = text,
            color = Black,
            fontSize = 16.sp,
        )
    }
}

@Composable
fun DayOfWeekButtonList() {

    val dayOfWeekSelects = remember { DayOfWeek.values().map { false }.toMutableStateList() }

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        DayOfWeek.values().forEachIndexed { index, dayOfWeek ->
            DayOfWeekButton(
                text = stringResource(dayOfWeek.stringRes),
                selected = dayOfWeekSelects[index],
                onClick = {
                    dayOfWeekSelects[index] = !dayOfWeekSelects[index]
                }
            )
        }
    }
}

@Preview
@Composable
fun DayOfWeekButtonListPreview() {
    MyApplicationTheme {
        DayOfWeekButtonList()
    }
}