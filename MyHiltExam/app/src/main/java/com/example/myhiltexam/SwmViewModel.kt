package com.example.myhiltexam

import android.content.Context
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class SwmViewModel @Inject constructor(
    @Named("Type2") var string01: String,
    @AppModule.Type4 var string02: String,
) : ViewModel() {

    @Inject
    @ApplicationContext
    lateinit var context: Context

    fun isExistContext(): Boolean = context != null

    fun getString1(): String = string01

    fun getString2(): String = string02
}
