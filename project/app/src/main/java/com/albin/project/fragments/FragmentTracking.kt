package com.albin.project.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.albin.project.MainActivity
import com.albin.project.R
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.material.button.MaterialButton

class FragmentTracking : Fragment(R.layout.tracking_fragment) {

    private var googMap: GoogleMap? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mapSegment = view.findViewById<MapView>(R.id.mapSegment)
        mapSegment.onCreate(savedInstanceState)

        val btnRun = view.findViewById<MaterialButton>(R.id.btnTrack)
        btnRun.setOnClickListener {}

        mapSegment.getMapAsync {
            googMap = it
        }
    }
}