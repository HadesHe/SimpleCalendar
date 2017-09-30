package com.hzjytech.hades.simplecalendar

import com.facebook.stetho.Stetho

/**
 * Created by Hades on 2017/9/26.
 */
class App : BuildVariantApplication() {
    override fun onCreate() {
        super.onCreate()
        if(!shouldInit()){
            return
        }
        Stetho.initializeWithDefaults(this)
    }

}