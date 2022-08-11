package com.example.jacocoexample.ui.main

import androidx.lifecycle.ViewModel
import com.example.kotlibrary.Calculator

class MainViewModel : ViewModel() {

    fun checkAddition() {
        println("asdasd")
    }

    fun add(a: Int, b: Int): Int {
        return Calculator().add(a, b)
    }
}