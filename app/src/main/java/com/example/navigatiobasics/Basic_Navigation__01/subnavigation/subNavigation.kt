package com.example.navigatiobasics.Basic_Navigation__01.subnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigatiobasics.Basic_Navigation__01.routes.Routes
import com.example.navigatiobasics.Basic_Navigation__01.screens.ScreenA
import com.example.navigatiobasics.Basic_Navigation__01.screens.ScreenB


@Composable
fun AppNav(){

    //1 navcontroler
    val navcontroler= rememberNavController()
    NavHost(navcontroler, startDestination = Routes.screenA.route) {

        composable(Routes.screenA.route){
            ScreenA(navcontroler)
        }

       /* composable(
            Routes.screenB.route,
            arguments = listOf(
                navArgument("name"){
                    type= NavType.StringType
                }
            )


            ){backstackEntry->
            val name=backstackEntry.arguments?.getString("name")
            ScreenB(navcontroler)
        }*/


    }






}
