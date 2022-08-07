package com.example.jacocoexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.jacocoexample.ui.main.MainFragment
import com.example.javalibrary.MyJavaClass
import com.example.kotlibrary.MyKotlinClass

class MainActivity : AppCompatActivity() {

    private lateinit var myJavaClass: MyJavaClass
    private lateinit var myKotlinClass: MyKotlinClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        // init
        myKotlinClass = MyKotlinClass()
        myJavaClass = MyJavaClass()
    }

    override fun onStart() {
        super.onStart()
        val sum = myJavaClass.add(1, 1)
        Log.d("MainActivity.onStart", sum.toString())
    }

    override fun onResume() {
        super.onResume()
        val sum = myKotlinClass.add(2, 2)
        Log.d("MainActivity.onResume", sum.toString())
    }

}