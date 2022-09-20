package com.cheezycode.daggerexample

import com.example.dagger2_example.MessageQualifier
import com.example.dagger2_example.NotificationService
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-reply@cheezycode.com", "User Registered")
    }

}









