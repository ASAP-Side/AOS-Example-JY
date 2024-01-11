package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.SweetPotato
import com.example.myapplication.ui.theme.White

data class AlarmItem(
    val meridiem: String,
    val hour: Int,
    val minute: Int,
    val year: Int,
    val month: Int,
    val date: Int,
    val dayOfWeek: String,
)

@Composable
fun AlarmItemBox(
    item: AlarmItem,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(SweetPotato)
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.Center),
            color = White,
            text = "${item.meridiem} ${item.hour} : ${item.minute}",
            fontSize = 18.sp
        )

        Text(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 3.dp, bottom = 3.dp),
            color = White,
            text = "${item.year}년 ${item.month}월 ${item.date}일 ${item.dayOfWeek}",
            fontSize = 10.sp
        )
    }

    Spacer(modifier = Modifier.height(5.dp))
}

@Composable
fun AlarmItemBoxList() {
    val scrollState = rememberLazyListState()

    val itemList = listOf(
        AlarmItem("오후", 6, 30, 2023, 12, 12, "화요일"),
        AlarmItem("오후", 6, 30, 2023, 12, 19, "화요일"),
        AlarmItem("오후", 6, 30, 2023, 12, 26, "화요일"),
        AlarmItem("오후", 6, 30, 2024, 1, 2, "화요일"),
        AlarmItem("오후", 6, 30, 2024, 1, 19, "화요일"),
    )
    LazyColumn(
        state = scrollState,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        items(itemList) { item ->
            AlarmItemBox(item = item)

        }
    }
}

@Preview
@Composable
fun AlarmListPreview() {
    MyApplicationTheme {
        AlarmItemBoxList()
    }
}