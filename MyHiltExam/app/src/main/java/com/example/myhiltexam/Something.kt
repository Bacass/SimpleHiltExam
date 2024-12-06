package com.example.myhiltexam

import android.util.Log
import javax.inject.Inject

class Something @Inject constructor() {
    fun doSomething(tag: String, message: String) {
        Log.d(tag, "Doing something : $message")
    }
}