package com.exmaple.pruebamotionlayout.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.exmaple.pruebamotionlayout.databinding.LayoutPruebaCoordinatorlayoutBinding

class PruebaCoordinatorLayout:AppCompatActivity()
{

    private lateinit var binding: LayoutPruebaCoordinatorlayoutBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = LayoutPruebaCoordinatorlayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}