package com.example.navigatiobasics.pass_agrument___02.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.navigatiobasics.pass_agrument___02.routes.Routes


@Composable
fun B(navController: NavController,name:String?){

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        Alignment.CenterHorizontally
    ) {

        Text("Recieving an Argument")
        Text("Name: $name")
        Button(
            onClick = {
                //todo
                navController.navigate(Routes.screenA)
            }
        ) {
            Text("goBack")
        }



    }
}