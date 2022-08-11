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
        editText1 = root.findViewById(R.id.edit_text_1)
        editText2 = root.findViewById(R.id.edit_text_2)
        resultText = root.findViewById(R.id.result_text)
        button = root.findViewById(R.id.add)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeToChange()
    }

    private fun subscribeToChange() {
        button.setOnClickListener {
            val input1 = editText1.text.toString()
            val input2 = editText2.text.toString()
            if (input1 != "" && input2 != "") {
                try {
                    val result = viewModel.add(Integer.parseInt(input1), Integer.parseInt(input2))
                    resultText.text = result.toString()
                } catch (e: NumberFormatException) {
                    resultText.text = getString(R.string.error_input_format)
                    throw NumberFormatException("MainFragment: Incorrect Input.")
                }
            } else {
                resultText.text = getString(R.string.error_empty_input)
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}