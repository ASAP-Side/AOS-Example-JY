package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.SweetPotato
import com.example.myapplication.ui.theme.White
import com.example.presentation.R

@Composable
fun MusicSelectButton() {
    Box(
        modifier = Modifier
            .clip(RectangleShape)
            .fillMaxWidth()
            .height(35.dp)
            .background(color = SweetPotato)
            .clickable { /*TODO*/ }
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.Center),
            text = stringResource(id = R.string.select_music),
            fontSize = 18.sp,
            color = White,
        )
    }
}