package com.example.jacocoexample.ui.main

import androidx.lifecycle.ViewModel
import com.example.kotlibrary.Calculator

class MainViewModel : ViewModel() {

    private val calculator = Calculator()
    var number1: Int = 0
    var number2: Int = 0
    var answer: Int = 0

    fun add() {
        answer = calculator.add(number1, number2)
    }

    fun subtract() {
        answer = calculator.subtract(number1, number2)
    }

}