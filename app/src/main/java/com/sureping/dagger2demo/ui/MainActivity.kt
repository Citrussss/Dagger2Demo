package com.sureping.dagger2demo.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import com.sureping.dagger2demo.base.DaggerActivity
import javax.inject.Inject

/**
@author sureping
@create 19-5-18.
 */
class MainActivity :DaggerActivity() {
    @Inject lateinit var name :String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("JBY",name)
    }
}