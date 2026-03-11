package com.example.navigatiobasics.phonebookApplication

sealed class AppRoute(val route:String) {
     class homescreen: AppRoute("homescreen")
    class detailedScreen: AppRoute("detailedscreen")
}