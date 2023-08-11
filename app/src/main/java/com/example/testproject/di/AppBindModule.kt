package com.example.testproject.di

import com.example.testproject.data.ApiFactory
import com.example.testproject.data.WeatherRepositoryImpl
import com.example.testproject.domain.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface AppBindModule {
    @Binds
    fun bindAuthRepository(weatherRepositoryImpl: WeatherRepositoryImpl) : WeatherRepository

    companion object {
        @Provides
        fun provideApiFactory(): ApiFactory {
            return ApiFactory
        }
    }

}