package com.exmaple.pruebamotionlayout.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.exmaple.pruebamotionlayout.databinding.LayoutFragmentAnimacionModificarPathBinding

class FragmentAnimacionModificarPath:Fragment()
{

    private lateinit var binding: LayoutFragmentAnimacionModificarPathBinding



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = LayoutFragmentAnimacionModificarPathBinding.inflate(inflater, container, false)


        return binding.root
    }

}