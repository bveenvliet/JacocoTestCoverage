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
        assertEquals(3, viewModel.add(1, 2))
    }
}