package com.jonanpg.marvelchampionslifecounter.usecases.base

import android.content.Context
import android.content.Intent

/**
 * Created by JonanPG by Jon Ander Perez on 27/07/2022.
 * www.jonanpg.com
 */
interface BaseActivityRouter {

    //Activity

    fun intent(activity: Context): Intent

    fun launch(activity: Context) = activity.startActivity(intent(activity))

}

interface BaseFragmentRouter {

    //Fragment
}