package com.example.navigatiobasics.pass_agrument___02.AppNav

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.colorspace.Illuminant.A
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigatiobasics.Basic_Navigation__01.screens.ScreenA
import com.example.navigatiobasics.pass_agrument___02.routes.Routes
import com.example.navigatiobasics.pass_agrument___02.screens.A
import com.example.navigatiobasics.pass_agrument___02.screens.B


@Composable
fun AppNav(){

    //1 navcontroler
    val navcontroler= rememberNavController()
    NavHost(navcontroler, startDestination = Routes.screenA) {

        composable(Routes.screenA){
           A(navcontroler)
        }


        composable(
            route = Routes.screenB,
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->

            val name = backStackEntry.arguments?.getString("name")

            B(navcontroler, name)
        }







    }






}
