package com.jonanpg.marvelchampionslifecounter.util.extension

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.jonanpg.marvelchampionslifecounter.model.domain.Champion
import com.jonanpg.marvelchampionslifecounter.ui.theme.Black

/**
 * Created by JonanPG by Jon Ander Perez on 08/12/2022.
 * www.jonanpg.com
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChampionSelCard(onClick: () -> Unit, champion: Champion) {

    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp

    Card(
        onClick = onClick,
        border = BorderStroke(0.5.dp, Black),
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .heightIn(min = (screenWidth * 0.13).dp)
            .widthIn(min = (screenWidth * 0.13).dp)
    ) {
        Image(
            painter = rememberDrawablePainter(drawable = champion.getDrawable(LocalContext.current)),
            contentDescription = champion.getDescription(LocalContext.current),
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.fillMaxSize()
        )
    }
}