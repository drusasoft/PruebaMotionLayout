package com.exmaple.pruebamotionlayout.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.exmaple.pruebamotionlayout.databinding.LayoutFragmentPathComplejoBinding

class FragmentAnimacionPathComplejo:Fragment()
{

    private lateinit var binding: LayoutFragmentPathComplejoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        binding = LayoutFragmentPathComplejoBinding.inflate(inflater, container, false)

        return binding.root
    }

}