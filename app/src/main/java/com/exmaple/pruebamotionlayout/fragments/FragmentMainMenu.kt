package com.exmaple.pruebamotionlayout.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.exmaple.pruebamotionlayout.databinding.LayoutFragmentMainMenuBinding





class FragmentMainMenu:Fragment()
{

    private lateinit var binding: LayoutFragmentMainMenuBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View
    {
        binding = LayoutFragmentMainMenuBinding.inflate(inflater, container, false)

        Log.e("Fragment", "OnCrate")

        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
    }

}