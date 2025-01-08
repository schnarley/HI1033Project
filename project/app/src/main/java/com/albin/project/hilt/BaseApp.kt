package com.albin.project.hiltshit

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

// Tell app that we want to inject dependecies using dagger hilt
@HiltAndroidApp
class BaseApp : Application() {
}