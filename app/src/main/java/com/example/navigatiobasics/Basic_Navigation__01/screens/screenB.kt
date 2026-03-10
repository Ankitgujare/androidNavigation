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
import com.example.navigatiobasics.Basic_Navigation__01.routes.Routes

@Composable
fun ScreenB(navController: NavController){

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        Alignment.CenterHorizontally
    ) {

        Text("screen B")
        Button(onClick = {
            //todo
            navController.navigate(Routes.screenA.route)
        }) {
            Text("go Back")
        }

    }
}




@Preview(showSystemUi = true)
@Composable
private fun ScreenBpreview(){

}