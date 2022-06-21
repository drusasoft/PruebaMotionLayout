package com.exmaple.pruebamotionlayout.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.exmaple.pruebamotionlayout.databinding.LayoutFragmentAnimacionDrageventsPathcomplejoBinding

class FragmentAnimacionDragEventsPathComplejo:Fragment()
{
    private lateinit var binding: LayoutFragmentAnimacionDrageventsPathcomplejoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View
    {
        binding = LayoutFragmentAnimacionDrageventsPathcomplejoBinding.inflate(inflater, container, false)

        return binding.root
    }

}