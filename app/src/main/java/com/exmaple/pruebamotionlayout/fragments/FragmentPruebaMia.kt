package com.exmaple.pruebamotionlayout.fragments

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.fragment.app.Fragment
import com.exmaple.pruebamotionlayout.databinding.LayoutFragmentPruebaMiaBinding


class FragmentPruebaMia: Fragment()
{

    private lateinit var binding: LayoutFragmentPruebaMiaBinding
    private lateinit var motionLayout:MotionLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View
    {
        binding = LayoutFragmentPruebaMiaBinding.inflate(layoutInflater, container, false)

        motionLayout = binding.motionLayout

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        //Prueba realiza la animacion mediante codigo, para que se ejecute cuando se inica el Fragment
        val cuentaAtras = object: CountDownTimer(3000, 100)
        {
            override fun onTick(tiempoRestante: Long) {
                //En cada pasa de la Cuenta Atras se va progresando la animacion MotionLayout
                if(motionLayout.progress < 1.0 && tiempoRestante<=2500) motionLayout.progress += 0.05F
            }

            override fun onFinish() { }

        }

        cuentaAtras.start()

    }

}