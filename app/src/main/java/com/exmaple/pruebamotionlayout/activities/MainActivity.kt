package com.exmaple.pruebamotionlayout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.exmaple.pruebamotionlayout.R
import com.exmaple.pruebamotionlayout.databinding.ActivityMainBinding





class MainActivity : AppCompatActivity()
{

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarMainMenu)

        //Se Crea Objeto NavController
        navController = Navigation.findNavController(this, R.id.NavHostFragmentMotionLayout)

        //Añadimos el navController a la Toolbar(Actionbar), Para que se muestre la flecha volver y el titulo del frgament en la toolbar cuando se navega a otros fragments desde el fragment home
        NavigationUI.setupWithNavController(binding.toolbarMainMenu, navController)

        //Listener que se ejecuta cuando se navega entre los fragment
        navController.addOnDestinationChangedListener{ controller, destination, arguments ->

            when(destination.id)
            {
                controller.graph.startDestinationId->{ supportActionBar!!.title = "Main Menu" }
                R.id.fragmentAnimacionBasica->{ supportActionBar!!.title = "Prueba Animacion" }
                R.id.fragmentAnimacionDragEvents->{ supportActionBar!!.title = "Animacion Drag Event"}
                R.id.fragmentAnimacionModificarPath->{ supportActionBar!!.title = "Prueba Modificar Path" }
                R.id.fragmentAnimacionPathComplejo->{ supportActionBar!!.title = "Prueba Path Complejo" }
                R.id.fragmentAnimacionCambioAtributos->{ supportActionBar!!.title = "Animacion con Atributos" }
                R.id.fragmentAnimacionAtributosCustoms->{ supportActionBar!!.title = "Prueba Atributos Customs"}
            }
        }

    }

}