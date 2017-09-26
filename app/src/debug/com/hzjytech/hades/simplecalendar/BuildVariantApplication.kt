package com.hzjytech.hades.simplecalendar

import com.squareup.leakcanary.LeakCanary

open class BuildVariantApplication: BaseApp(){
    override fun onCreate(){
        super.onCreate()
        LeakCanary.install(this);
    }

    override fun shouldInit()=!LeakCanary.isInAnalyzerProcess(this)
}