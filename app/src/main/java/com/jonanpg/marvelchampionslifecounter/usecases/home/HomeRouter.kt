package com.jonanpg.marvelchampionslifecounter.usecases.home

import android.content.Context
import android.content.Intent
import com.jonanpg.marvelchampionslifecounter.usecases.base.BaseActivityRouter

/**
 * Created by JonanPG by Jon Ander Perez on 27/07/2022.
 * www.jonanpg.com
 */
class HomeRouter: BaseActivityRouter {

    override fun intent(activity: Context): Intent = Intent(activity, HomeActivity::class.java)

}