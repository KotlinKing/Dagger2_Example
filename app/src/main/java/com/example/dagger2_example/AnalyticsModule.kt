package com.example.dagger2_example

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getAnalyticsService() : AnalyticsService {
        return Mixpanel()
    }

}