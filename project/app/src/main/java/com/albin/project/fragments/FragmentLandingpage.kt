package com.albin.project.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.albin.project.MainActivity
import com.albin.project.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FragmentLandingpage : Fragment(R.layout.landingpage_fragment) {

    private val viewModel: MainActivity by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fab = view.findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentLandingpage_to_fragmentTracking)
        }
    }
}