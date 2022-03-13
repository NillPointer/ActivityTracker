package org.wit.activitytracker.main

import android.app.Application
import com.github.ajalt.timberkt.Timber
import timber.log.Timber.i

class MainApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        i("ActivityTracker started")
    }
}