package com.jonanpg.marvelchampionslifecounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jonanpg.marvelchampionslifecounter.ui.theme.MarvelChampionsLifeCounterTheme

/**
 * App 1/12 Agosto
 *
 * Esta es mi primera aplicación android utilizando el lenguaje de Kotlin.
 * En este proyecto se van a utilizar las siguientes herramientas:
 *
 *  1- Kotlin, como lenguaje de programación
 *  2- Jetpack Compose, como modo de implementar el UI
 *  3- MVVM, como estructura de proyecto
 *  4- SOLID, como principio de programación
 *  5-
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarvelChampionsLifeCounterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MarvelChampionsLifeCounterTheme {
        Greeting("Android")
    }
}