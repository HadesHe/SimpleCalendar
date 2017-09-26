package com.hzjytech.hades.simplecalendar

import android.support.multidex.MultiDexApplication

/**
 * Created by Hades on 2017/9/26.
 */
abstract class BaseApp: MultiDexApplication() {
    open fun shouldInit()=true
}