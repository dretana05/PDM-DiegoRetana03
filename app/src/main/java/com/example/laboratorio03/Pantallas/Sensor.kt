package com.example.laboratorio03.Pantallas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.laboratorio03.Navegacion.RutaListado
import com.example.laboratorio03.UseSensor.LightSensor

@Composable
fun Sensor(NavController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 25.dp)
            .padding(top = 30.dp, bottom = 70.dp)
    ) {

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {NavController.popBackStack()}
        ) {
            Text( text = "Regresar a home")
        }

        Spacer(modifier = Modifier.height(24.dp))

        LightSensor()

    }
}