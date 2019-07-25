package com.rss.androidutil

import android.content.Context
import android.widget.Toast

class RssUtils {
    companion object {
        fun customLog(context: Context, msg: String){
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }
    }
}