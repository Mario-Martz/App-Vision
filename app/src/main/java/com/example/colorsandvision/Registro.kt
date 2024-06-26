@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.colorsandvision

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginRegistro(){
    FondoRegistro()
    Registro()
}

@Composable
fun FondoRegistro(){
    val backgroundImage = painterResource(id = R.drawable.fondo3)
    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = backgroundImage,
            contentDescription = "Imagen de fondo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
        )
    }
}

@Composable
fun Registro(){
    var nombre by remember {
        mutableStateOf("")
    }
    var apellido by remember {
        mutableStateOf("")
    }
    var celular by remember {
        mutableStateOf("")
    }
    var ocupacion by remember {
        mutableStateOf("")
    }
    var enfermedades by remember {
        mutableStateOf("")
    }
    var observaciones by remember {
        mutableStateOf("")
    }
    var edad by remember {
        mutableStateOf("")
    }

    //Cuestionario
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        //Texto Registro
        Spacer(modifier = Modifier.height(60.dp))
        Text(
            text = "Registro",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            color = colorResource(id = R.color.AzulMarino)
        )

        //Nombre
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = nombre, onValueChange = {
            nombre = it
        }, label={
            Text(text = "Nombre",
                color = colorResource(id = R.color.AzulMarino),
                fontFamily = FontFamily.Serif)
        })

        //Apellidos
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = apellido, onValueChange = {
            apellido = it
        }, label={
            Text(text = "Apellidos",
                color = colorResource(id = R.color.AzulMarino),
                fontFamily = FontFamily.Serif)
        })

        //Celular
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = celular, onValueChange = {
            celular = it
        }, label={
            Text(text = "Celular",
                color = colorResource(id = R.color.AzulMarino),
                fontFamily = FontFamily.Serif)
        })

        //Edad
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = edad, onValueChange = {
            edad = it
        }, label={
            Text(text = "Edad",
                color = colorResource(id = R.color.AzulMarino),
                fontFamily = FontFamily.Serif)
        })

        //Ocupacion
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = ocupacion, onValueChange = {
            ocupacion = it
        }, label={
            Text(text = "Ocupación",
                color = colorResource(id = R.color.AzulMarino),
                fontFamily = FontFamily.Serif)
        })

        //Enfermedades
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = enfermedades, onValueChange = {
            enfermedades = it
        }, label={
            Text(text = "Enfermedades",
                color = colorResource(id = R.color.AzulMarino),
                fontFamily = FontFamily.Serif)
        })

        //Observaciones
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = observaciones, onValueChange = {
            observaciones = it
        }, label={
            Text(text = "Observaciones",
                color = colorResource(id = R.color.AzulMarino),
                fontFamily = FontFamily.Serif)
        },
            maxLines = 50)

        //Boton Añadir
        Spacer(modifier = Modifier.height(16.dp))
        Button(modifier = Modifier
            .width(200.dp)
            .height(50.dp),
            onClick = {  },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xff1C2D66)),
            shape = CutCornerShape(8.dp)

        ) {
            Text(text = "Añadir",
                color = colorResource(id = R.color.white),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif)
        }

        //Boton cancelar
        Spacer(modifier = Modifier.height(16.dp))
        Button(modifier = Modifier
            .width(200.dp)
            .height(50.dp),
            onClick = {  },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xff64BDCD)),
            shape = CutCornerShape(8.dp)

        ) {
            Text(text = "Cancelar",
                color = colorResource(id = R.color.AzulMarino),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif)
        }


    }

}