package com.sureping.dagger2demo.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection

/**
@author sureping
@create 19-5-18.
 */
abstract class DaggerActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

}