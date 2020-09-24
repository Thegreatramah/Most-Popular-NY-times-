package com.kk.nytimesapp

import android.app.Application
import com.kk.nytimesapp.di.component.ApplicationComponent
import com.kk.nytimesapp.di.component.DaggerApplicationComponent

class NyTimesApp : Application() {

    private val appComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent
                .builder()
                .application(this)
                .build()
    }

    fun getApplicationComponent(): ApplicationComponent = appComponent
}