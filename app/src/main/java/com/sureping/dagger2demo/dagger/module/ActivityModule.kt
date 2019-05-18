package com.sureping.dagger2demo.dagger.module

import com.sureping.dagger2demo.ui.MainActivity
import com.union.bangbang.todokotlin.dagger.annotation.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * 页面描述：ActivityModule
 *
 * Created by ditclear on 2018/6/25.
 */
@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeStartUpActivityInjector(): MainActivity
}