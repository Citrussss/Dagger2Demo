package com.sureping.dagger2demo.base

import android.content.Context
import androidx.fragment.app.Fragment
import dagger.android.support.AndroidSupportInjection

/**
@author sureping
@create 19-5-18.
 */
abstract class DaggerFragment :Fragment(){

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context)
    }
}