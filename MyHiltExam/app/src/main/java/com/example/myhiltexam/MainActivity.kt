package com.example.myhiltexam

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"

    @Inject
    @Named("Type1")
    lateinit var str1: String

    @Inject
    @AppModule.Type3
    lateinit var str2: String

    @Inject
    lateinit var testData: TestData

    @Inject
    lateinit var something: Something

    private val viewModel: SwmViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvTextView = findViewById<TextView>(R.id.tvTextView)

        var sb: StringBuilder = StringBuilder()
        sb.append("str1 : $str1")
        sb.append("\n")
        sb.append("str2 : $str2")
        sb.append("\n")
        sb.append("testData : ${testData.value01}")
        sb.append("\n")
        sb.append("isExistContext : ${viewModel.isExistContext()}")
        sb.append("\n")
        sb.append("getString1 : ${viewModel.getString1()}")
        sb.append("\n")
        sb.append("getString2 : ${viewModel.getString2()}")

        tvTextView.text = sb.toString()

        Log.d(TAG, "str1 : $str1")
        Log.d(TAG, "str2 : $str2")
        Log.d(TAG, "testData : ${testData.value01}")
        Log.d(TAG, "isExistContext : ${viewModel.isExistContext()}")
        Log.d(TAG, "getString1 : ${viewModel.getString1()}")
        Log.d(TAG, "getString2 : ${viewModel.getString2()}")

        something.doSomething(TAG, "This function is not need AppModule init")
    }
}
