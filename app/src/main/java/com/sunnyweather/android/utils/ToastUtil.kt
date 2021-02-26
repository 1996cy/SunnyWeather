package com.sunnyweather.android.utils

import android.widget.Toast
import com.sunnyweather.android.MyApp

fun ShowToast(content:String){
    Toast.makeText(MyApp.context,content,Toast.LENGTH_SHORT).show()
}