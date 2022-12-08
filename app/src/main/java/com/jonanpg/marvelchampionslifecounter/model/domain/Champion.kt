package com.jonanpg.marvelchampionslifecounter.model.domain

import android.content.Context
import android.graphics.drawable.Drawable
import com.jonanpg.marvelchampionslifecounter.R

/**
 * Created by JonanPG by Jon Ander Perez on 27/07/2022.
 * www.jonanpg.com
 */
open class Champion(id: String, name: String) {

    open fun getDrawable(context: Context): Drawable? { return null }

    open fun getDescription(context: Context): String? { return null }

}

class Hero(private val id: String, private val name: String): Champion(id, name) {

    override fun getDrawable(context: Context): Drawable? {
        return Drawable.createFromStream(
            context.assets.open("heroes/$id.jpg"),
            name
        )
    }

    override fun getDescription(context: Context): String? {
        return "${context.getString(R.string.img_alt_sel_heroe)} $name"
    }

}
class Villain(private val id: String, private val name: String): Champion(id, name) {

    override fun getDrawable(context: Context): Drawable? {
        return Drawable.createFromStream(
            context.assets.open("villains/$id.jpg"),
            name
        )
    }

    override fun getDescription(context: Context): String? {
        return "${context.getString(R.string.img_alt_sel_villain)} $name"
    }

}
