package com.example.laboratorio03.Navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.laboratorio03.Pantallas.App
import com.example.laboratorio03.Pantallas.Home
import com.example.laboratorio03.Pantallas.Sensor
import kotlinx.serialization.Serializable

@Serializable
object Rutahome

@Serializable
object RutaListado

@Serializable
object RutaSensor

@Composable
fun Nav(){
    val NavController = rememberNavController()

    NavHost(navController = NavController, startDestination = Rutahome) {
        composable <Rutahome>{
            Home(NavController)
        }
        composable <RutaListado>{
            App(NavController)
        }
        composable <RutaSensor>{
            Sensor(NavController)
        }
    }
}