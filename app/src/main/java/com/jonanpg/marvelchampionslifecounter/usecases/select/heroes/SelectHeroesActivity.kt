package com.jonanpg.marvelchampionslifecounter.usecases.select.heroes

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.jonanpg.marvelchampionslifecounter.R
import com.jonanpg.marvelchampionslifecounter.model.domain.Champion
import com.jonanpg.marvelchampionslifecounter.model.domain.Hero
import com.jonanpg.marvelchampionslifecounter.ui.theme.Btn_blue
import com.jonanpg.marvelchampionslifecounter.ui.theme.Btn_yellow
import com.jonanpg.marvelchampionslifecounter.ui.theme.Hero
import com.jonanpg.marvelchampionslifecounter.ui.theme.Primary
import com.jonanpg.marvelchampionslifecounter.util.extension.ButtonSide
import com.jonanpg.marvelchampionslifecounter.util.extension.ChampionSelGridView
import com.jonanpg.marvelchampionslifecounter.util.extension.VerticalButton

/**
 * Created by JonanPG by Jon Ander Perez on 08/12/2022.
 * www.jonanpg.com
 */

class SelectHeroesActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SelHeroesLayout()
        }
    }
}

@Composable
fun SelHeroesLayout() {

    val background: Drawable = Drawable.createFromStream(
        LocalContext.current.assets.open("background/background.png"),
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
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            VerticalButton(
                onClick = {

                },
                text = LocalContext.current.getString(R.string.btn_return),
                color = Btn_yellow,
                ButtonSide.LEFT
            )
            HeroSelCards()
            VerticalButton(
                onClick = {

                },
                text = LocalContext.current.getString(R.string.btn_villan),
                color = Btn_blue,
                ButtonSide.RIGHT
            )
        }
    }
}

@Composable
fun HeroSelCards() {
    val championArray = arrayListOf<Hero>()
    championArray.add(Hero("001", "Spiderman"))
    championArray.add(Hero("002", "Capitana Marvel"))
    championArray.add(Hero("003", "Hulka"))
    championArray.add(Hero("004", "Iron Man"))
    championArray.add(Hero("005", "Pantera Negra"))

    //ChampionSelGridView(championArray)
}