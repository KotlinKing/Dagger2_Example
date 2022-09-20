package com.cheezycode.daggerexample

import android.app.Application
import com.example.dagger2_example.AppComponent

class UserApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }
}