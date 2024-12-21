package com.example.jetpackcompose

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.darkPink
import org.w3c.dom.Text


@Composable
fun homeUI() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .background(darkPink)
                    .fillMaxWidth()
            ) {
                buttons(icon = R.drawable.baseline_menu_24)
                Text(
                    text = "Hello",
                    style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold

                    )
                )
            }
        }
    }
    buttons(icon = R.drawable.baseline_menu_24, Color.White)
}

@Composable
fun buttons(
    @DrawableRes icon: Int,
    tint: Color = Color.Unspecified,
) {
    IconButton(onClick = { }) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = "",
            modifier = Modifier.background(tint)
        )
    }
}