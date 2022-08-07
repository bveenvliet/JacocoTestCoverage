package com.example.kotlibrary

import org.junit.Assert.*
import org.junit.Test

class MyKotlinClassTest {

    @Test
    fun addKotlin() {
        val myKotlinClass = MyKotlinClass()
        val sum = myKotlinClass.add(1, 1)
        assertEquals(2, sum)
    }
}