package com.cheezycode.daggerexample

import android.util.Log
import com.example.dagger2_example.ActivityScope
import com.example.dagger2_example.AnalyticsService
import com.example.dagger2_example.TAG
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SQLRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in DB")
        analyticsService.trackEvent("Save User", "CREATE")
    }
}

class FirebaseRepository(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in Firebase")
        analyticsService.trackEvent("Save User", "CREATE")
    }

}