package com.example.jacocoexample.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doOnTextChanged
import com.example.jacocoexample.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var resultText: TextView
    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.main_fragment, container, false)
        editText1 = root.findViewById(R.id.etNumber1)
        editText2 = root.findViewById(R.id.etNumber2)
        resultText = root.findViewById(R.id.tvResult)
        button = root.findViewById(R.id.btnAdd)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeToChange()
    }

    private fun subscribeToChange() {
        // update view model when value changes
        editText1.doOnTextChanged { text, _, _, _ ->
            viewModel.number1 = Integer.parseInt(text.toString())
        }

        // update view model when value changes
        editText2.doOnTextChanged { text, _, _, _ ->
            viewModel.number2 = Integer.parseInt(text.toString())
        }

        // call view model method
        button.setOnClickListener {
            viewModel.add()
            updateUi()
        }
    }

    private fun updateUi() {
        editText1.setText(viewModel.number1.toString())
        editText2.setText(viewModel.number2.toString())
        resultText.text = viewModel.answer.toString()
    }

    @Suppress("DEPRECATION")
    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}