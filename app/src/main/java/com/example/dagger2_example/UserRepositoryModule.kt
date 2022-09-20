package com.cheezycode.daggerexample

import com.example.dagger2_example.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

    @Binds
    @ActivityScope
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository
}