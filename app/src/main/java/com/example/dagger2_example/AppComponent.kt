package com.example.dagger2_example

import com.example.dagger2_example.AnalyticsModule
import com.example.dagger2_example.UserRegistrationComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    fun getUserRegistrationComponentFactory() : UserRegistrationComponent.Factory
}