package com.hzjytech.hades.simplecalendar.activities

import android.os.Bundle
import com.hzjytech.hades.simplecalendar.R
import com.simplemobiletools.commons.activities.BaseSimpleActivity
import com.simplemobiletools.commons.extensions.hideKeyboard
import java.util.TreeSet

class SimpleActivity : BaseSimpleActivity() {

    protected fun showEventReminderDialog(curMinutes:Int,callback: (minutes:Int)->Unit){
        hideKeyboard()
        val minutes=TreeSet<Int>()
        minutes.apply {
            add(-1)
            add(0)
            add(10)
            add(30)
            add(curMinutes)
        }





    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)
    }
}
