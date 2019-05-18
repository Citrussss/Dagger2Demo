package com.sureping.dagger2demo.dagger.module

import android.app.Application
import android.content.Context
import android.content.res.Resources
import com.sureping.dagger2demo.BuildConfig
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
@author sureping
@create 19-5-18.
 */
@Module
class AppModule {
    @Provides
    @Singleton
    fun appName():String = BuildConfig.APPLICATION_ID

    @Provides
    fun getApplicationContext(application: Application): Context {
        return application
    }

    @Provides
    fun provideResources(context: Context): Resources {
        return context.getResources()
    }
}