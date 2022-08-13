package com.example.jacocoexample

import com.example.jacocoexample.ui.main.MainViewModel
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(0, viewModel.answer)
        viewModel.number1 = 1
        viewModel.number2 = 2
        assertEquals(0, viewModel.answer)
        viewModel.add()
        assertEquals(3, viewModel.answer)
    }
}