package com.example.kotlibrary

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

internal class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testAdd() {
        val result = calculator.add(2, 3)
        val expected = 5
        assertEquals(expected, result)
    }

    @Test
    fun testSubtract() {
        val result = calculator.subtract(2, 3)
        val expected = -1
        assertEquals(expected, result)
    }

    @Test
    fun testMultiply() {
        val result = calculator.multiply(2, 3)
        val expected = 6
        assertEquals(expected, result)
    }

    @Test
    fun testDivide() {
        val result = calculator.divide(6, 3)
        val expected = 2
        assertEquals(expected, result)
    }

    @Test
    fun testSquare() {
        val result = calculator.square(6)
        val expected = 36
        assertEquals(expected, result)
    }

}