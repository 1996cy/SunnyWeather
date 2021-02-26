package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class MyApp : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN="aHMBfs7gKXr8CkWy"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}