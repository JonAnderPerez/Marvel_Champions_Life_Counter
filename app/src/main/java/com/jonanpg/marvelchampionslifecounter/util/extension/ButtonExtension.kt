package com.jonanpg.marvelchampionslifecounter.util.extension

import android.content.Context
import android.util.DisplayMetrics
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jonanpg.marvelchampionslifecounter.ui.theme.Black
import com.jonanpg.marvelchampionslifecounter.ui.theme.Btn_blue
import com.jonanpg.marvelchampionslifecounter.ui.theme.Typography

/**
 * Created by JonanPG by Jon Ander Perez on 27/07/2022.
 * www.jonanpg.com
 */

@Composable
fun HomePageButton(onClick: () -> Unit,
                   text: String,
                   color: Color) {

    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp
    val screenWidth = configuration.screenWidthDp

    Box {
        Box(modifier = Modifier
                    .background(shape = RoundedCornerShape(15.dp), color = Black)
                    .padding(horizontal = 1.dp, vertical = 1.dp)
                    .heightIn(min = (screenHeight * 0.15).dp)
                    .widthIn(min = (screenWidth * 0.30).dp)
        )
        Button(
            onClick = onClick,
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(containerColor = color),
            border = BorderStroke(width = 0.5.dp, color = Black),
            modifier = Modifier
                        .heightIn(min = (screenHeight * 0.15).dp)
                        .widthIn(min = (screenWidth * 0.30).dp)
            ) {
                Text(
                    text = text,
                    style = Typography.bodyMedium
                )
        }
    }
}

@Composable
fun VerticalButton(onClick: () -> Unit,
                   text: String,
                   color: Color) {

    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp
    val screenWidth = configuration.screenWidthDp

    Box {
        Box(modifier = Modifier
            .background(shape = RoundedCornerShape(15.dp), color = Black)
            .padding(horizontal = 2.dp, vertical = 2.dp)
            .heightIn(min = screenHeight.dp)
            .widthIn(min = (screenWidth * 0.10).dp)
        )
        Button(
            onClick = onClick,
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(containerColor = color),
            border = BorderStroke(width = 0.5.dp, color = Black),
            modifier = Modifier
                .heightIn(min = screenHeight.dp)
                .widthIn(min = (screenWidth * 0.10).dp)
        ) {
            Text(
                text = text,
                style = Typography.bodyMedium
            )
        }
    }
}

@Preview
@Composable
fun previewButton() {
    Column() {
        HomePageButton(
            onClick = { /*TODO*/ },
            text = "nueva partida",
            color = Btn_blue)
    }
}