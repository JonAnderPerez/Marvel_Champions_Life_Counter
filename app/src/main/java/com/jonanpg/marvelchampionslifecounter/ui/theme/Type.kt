package com.jonanpg.marvelchampionslifecounter.ui.theme

import androidx.compose.material3.Typography

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.jonanpg.marvelchampionslifecounter.R

val ComicPanelsFont = FontFamily(
    Font(R.font.comic_panels, FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        color = Black,
        fontFamily = ComicPanelsFont
    ),
    bodyMedium = TextStyle(
        color = Black,
        fontFamily = ComicPanelsFont
    ),
    bodySmall = TextStyle(
        color = Black,
        fontFamily = ComicPanelsFont
    )
)