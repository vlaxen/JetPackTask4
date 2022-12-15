package com.example.jetpacktask4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController


class FragmentSecond : Fragment(R.layout.fragment_second) {

    lateinit var controller: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        controller = findNavController()
        val button = view.findViewById<Button>(R.id.switchToFirstButton)
        button.setOnClickListener {
            controller.navigateUp()
        }
    }

}