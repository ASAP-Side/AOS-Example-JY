package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.Pink
import com.example.myapplication.ui.theme.White

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TestFrame()
                }
            }
        }
    }
}

@Composable
fun TestFrame() {
    Column(
        modifier = Modifier
            .background(White)
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp, top = 35.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier
                .background(Pink)
                .fillMaxWidth()
                .height(103.dp)
        )
        Spacer(modifier = Modifier.height(26.dp))

        DayOfWeekButtonList()
        Spacer(modifier = Modifier.height(18.dp))

        EndDateButtonList()
        Spacer(modifier = Modifier.height(20.dp))

        AlarmTypeButtonList()
        Spacer(modifier = Modifier.height(20.dp))

        MusicSelectButton()
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "알림 리스트",
            textAlign = TextAlign.Start,
            fontSize = 18.sp,
        )
        Spacer(modifier = Modifier.height(7.dp))

        AlarmItemBoxList()
    }
}

@Preview(showBackground = true)
@Composable
fun TestComposablePreview() {
    MyApplicationTheme {
        TestFrame()
    }
}