package com.example.navigatiobasics.phonebookApplication.appnav

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigatiobasics.phonebookApplication.AppRoute

@Composable
fun appNavigation(){

    val navController= rememberNavController()
    NavHost(navController, startDestination = AppRoute.homescreen().route){

        composable(AppRoute.homescreen().route){
            //todo call the homescreen composable

        }


        composable(AppRoute.detailedScreen().route){
            //todo call the DetailScreen composable

        }

    }






}