package io.usebeagle.positioning

import android.app.Application
import io.usebeagle.positioning.beagle.BeagleSetup

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        BeagleSetup().init(this)
    }
}