package com.example.navigatiobasics.Basic_Navigation__01.routes

sealed class Routes(val route:String) {

    object screenA: Routes("ScreenA")
    object screenB: Routes("ScreenB")
}