package com.jonanpg.marvelchampionslifecounter.usecases.home

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.jonanpg.marvelchampionslifecounter.R
import com.jonanpg.marvelchampionslifecounter.ui.theme.Btn_blue
import com.jonanpg.marvelchampionslifecounter.ui.theme.Btn_yellow
import com.jonanpg.marvelchampionslifecounter.ui.theme.Primary
import com.jonanpg.marvelchampionslifecounter.util.extension.HomePageButton

/**
 * Created by JonanPG by Jon Ander Perez on 27/07/2022.
 * www.jonanpg.com
 */
class HomeActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContent {
                MaterialTheme {
                    HomeLayout()
                }
            }
    }

}

@Composable
fun HomeLayout() {

    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp
    val screenWidth = configuration.screenWidthDp

    val background: Drawable = Drawable.createFromStream(
        LocalContext.current.assets.open("background/background.png"),
        null
    )

    val homeLogo: Drawable = Drawable.createFromStream(
        LocalContext.current.assets.open("home/home_logo.png"),
        null
    )

    Box(modifier = Modifier.background(Primary)) {
        //Imagen de la pantalla pincipal
        Image(
            painter = rememberDrawablePainter(drawable = background),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxSize()
        )

        //Body
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Imagen de la pantalla pincipal
            Image(
                painter = rememberDrawablePainter(drawable = homeLogo),
                contentDescription = LocalContext.current.getString(R.string.img_alt_home),
                modifier = Modifier
                    .heightIn(min = (screenHeight * 0.5).dp)
                    .widthIn(min = (screenWidth * 0.5).dp)
            )

            //Botones de la parte inferior de la pantalla principal
            HomeButtons()
        }
    }
}

@Composable
fun HomeButtons() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        HomePageButton(
            onClick = {},
            text = LocalContext.current.getString(R.string.btn_new_game),
            color = Btn_blue)
        HomePageButton(
            onClick = {},
            text = LocalContext.current.getString(R.string.btn_continue),
            color = Btn_yellow)
    }
}

@Preview
@Composable
fun PreviewText(){
    HomeLayout()
}