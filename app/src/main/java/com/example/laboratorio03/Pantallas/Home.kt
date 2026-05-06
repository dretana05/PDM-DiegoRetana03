package com.example.laboratorio03.Pantallas

import android.service.autofill.OnClickAction
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.laboratorio03.Navegacion.RutaListado
import com.example.laboratorio03.Navegacion.RutaSensor
import com.example.laboratorio03.ui.theme.Laboratorio03Theme

@Composable
fun Home(NavController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 25.dp)
            .padding(top = 30.dp, bottom = 70.dp)
    ) {

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Bienvenido a home, selecciona una opción."
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {NavController.navigate(RutaListado)}
        ) {
            Text( text = "Ver lista de nombres")
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {NavController.navigate(RutaSensor)}
        ) {
            Text( text = "Ver sensor de luz ambiental")
        }

    }
}