package com.exmaple.pruebamotionlayout.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.exmaple.pruebamotionlayout.R
import com.exmaple.pruebamotionlayout.databinding.LayoutFragmentMainMenuBinding





class FragmentMainMenu:Fragment()
{

    private lateinit var binding: LayoutFragmentMainMenuBinding
    private lateinit var navController: NavController



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View
    {
        binding = LayoutFragmentMainMenuBinding.inflate(inflater, container, false)


        //***************************ClickListeners***************************

        binding.txtOpcion1.setOnClickListener { navController.navigate(R.id.irFragmentAnimacionBasica) }
        binding.txtOpcion2.setOnClickListener { navController.navigate(R.id.irFragmentAnimacionDragEvents) }
        binding.txtOpcion3.setOnClickListener { navController.navigate(R.id.irFragmentAnimacionModificarPath) }
        binding.txtOpcion4.setOnClickListener { navController.navigate(R.id.irFragmentAnimacionPathComplejo) }
        binding.txtOpcion5.setOnClickListener { navController.navigate(R.id.irFragmentAnimacionCambioAtributos) }
        binding.txtOpcion6.setOnClickListener { navController.navigate(R.id.irFragmentAnimacionAtributosCustoms) }
        binding.txtOpcion7.setOnClickListener { navController.navigate(R.id.irFragmentAnimacionDragEventsPathComplejo) }
        binding.txtOpcion8.setOnClickListener { navController.navigate(R.id.irPruebaCoordinatorLayout) }
        binding.txtOpcion9.setOnClickListener { navController.navigate(R.id.irFragmentPruebaMia) }

        //***************************Fin ClickListeners***************************


        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        //Se instancia el objeto NavController
        navController = Navigation.findNavController(view)
    }

}