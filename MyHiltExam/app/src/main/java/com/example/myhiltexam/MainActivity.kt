package com.example.myhiltexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("Type1")
    lateinit var str1: String

    @Inject
    lateinit var testData: TestData

    private val viewModel: SwmViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Test", "str1 : $str1")
        Log.d("Test", "testData : ${testData.value01}")
        Log.d("Test", "isExistContext : ${viewModel.isExistContext()}")
        Log.d("Test", "string : ${viewModel.getString()}")
    }





}