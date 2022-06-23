package com.exmaple.pruebamotionlayout.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.exmaple.pruebamotionlayout.databinding.LayoutPruebaCoordinatorlayoutBinding
import com.google.android.material.appbar.AppBarLayout


class PruebaCoordinatorLayout:AppCompatActivity()
{

    private lateinit var binding: LayoutPruebaCoordinatorlayoutBinding


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = LayoutPruebaCoordinatorlayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Codigo necesario para que se producza la animacion definida en el MotionLayout cuando se hace scroll en la Pantalla
        val appBarLayout = binding.appbarLayout
        val motionLayout = binding.motionLayout

        //Este listener se ejecuta cada vez que se hace scroll en la pantalla
        appBarLayout.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->

            //Apartir de la posicion actual del scroll en pantalla calculamos la posicion de la animacion definida en el Motionlayout
            val seekPosition = -verticalOffset / appBarLayout.totalScrollRange.toFloat()

            //Con la instruccion progress del motion layout indicamos la posicion donde queremos que salte la animacion
            //asi por ejemplo si decimos motionLayout.progress = 0.43 la animacion saltara al 43%
            motionLayout.progress = seekPosition

        })

    }

}