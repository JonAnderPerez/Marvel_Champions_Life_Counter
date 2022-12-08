package com.jonanpg.marvelchampionslifecounter.util.extension

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle

/**
 * Created by JonanPG by Jon Ander Perez on 08/12/2022.
 * www.jonanpg.com
 */

@Composable
fun VerticalText(text: String, style: TextStyle) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        text.forEach {
            Text(
                text = it.toString(),
                style = style
            )
        }
    }
}