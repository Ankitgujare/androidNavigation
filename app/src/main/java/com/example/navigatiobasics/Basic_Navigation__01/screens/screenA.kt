package com.example.navigatiobasics.Basic_Navigation__01.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.navigatiobasics.pass_agrument___02.routes.Routes

@Composable
fun ScreenA(navController: NavController){

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        Alignment.CenterHorizontally
        ) {

            Text("Hello world")
        Button(
            onClick = {
                //todo
            }
        ) {
            Text("Next")
        }



    }
}

@Preview(showSystemUi = true)
@Composable
fun ScreenAPreview(){

}