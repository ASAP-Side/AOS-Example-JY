package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Black
import com.example.myapplication.ui.theme.Blue
import com.example.myapplication.ui.theme.Gray
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.presentation.R

enum class AlarmType(val stringRes: Int) {
    SOUND(R.string.sound),
    VIBRATION(R.string.vibration),
    SOUND_AND_VIBRATION(R.string.sound_and_vibration),
}

data class ButtonItem(
    val label: String,
)

@Composable
fun AlarmTypeButton(
    item: ButtonItem,
    isSelected: Boolean,
    onTap: () -> Unit
) {
    val bgColor = if (isSelected) Blue else Gray

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(30.dp))
            .height(36.dp)
            .clickable { onTap() }
            .background(color = bgColor)
    ) {
        Text(
            modifier = Modifier
                .padding(horizontal = 12.dp, vertical = 8.dp)
                .align(Alignment.Center),
            text = item.label,
            color = Black,
            fontSize = 16.sp,
        )
    }
}


@Composable
fun AlarmTypeButtonList() {
    val buttonItems = AlarmType.values().map { alarmType ->
        ButtonItem(
            stringResource(id = alarmType.stringRes)
        )
    }

    var selectedIndex by rememberSaveable { mutableStateOf(0) }

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        buttonItems.forEachIndexed { index, item ->
            AlarmTypeButton(
                item = item,
                isSelected = selectedIndex == index,
                onTap = { selectedIndex = index }
            )
        }
    }
}

@Preview
@Composable
fun AlarmTypeButtonListPreview() {
    MyApplicationTheme {
        AlarmTypeButtonList()
    }
}