package com.sureping.dagger2demo.dagger.component

import com.sureping.dagger2demo.Application
import com.sureping.dagger2demo.dagger.module.ActivityModule
import com.sureping.dagger2demo.dagger.module.AppModule
import com.sureping.dagger2demo.dagger.module.FragmentModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
@author sureping
@create 19-5-18.
 */
@Singleton
@Component(modules = [
    AndroidInjectionModule::class
    ,ActivityModule::class
    ,FragmentModule::class
    ,AppModule::class
    ])
interface AppComponent {
    fun inject(application : Application)
}