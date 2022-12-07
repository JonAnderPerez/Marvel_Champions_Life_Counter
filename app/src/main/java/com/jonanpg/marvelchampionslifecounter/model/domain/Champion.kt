package com.jonanpg.marvelchampionslifecounter.model.domain

/**
 * Created by JonanPG by Jon Ander Perez on 27/07/2022.
 * www.jonanpg.com
 */
enum class ChampionType {
    HERO, VILLAIN;
}

open class Champion(val name:String, val imgSmall: String, val imgBig: String, val type:String) {

    class Hero
    class Villain
}
