package com.example.kotlibrary

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

internal class ScientificCalculatorTest {

    private lateinit var scientificCalculator: ScientificCalculator

    @Before
    fun setUp() {
        scientificCalculator = ScientificCalculator()
    }

    @Test
    fun testSquareRoot() {
        val result = scientificCalculator.squareRoot(64.0)
        val expected = 8.0
        assertEquals(expected, result, 0.01)
    }

    @Test
    fun testCubeRoot() {
        val result = scientificCalculator.cubeRoot(64.0)
        val expected = 4.0
        assertEquals(expected, result, 0.01)
    }

}