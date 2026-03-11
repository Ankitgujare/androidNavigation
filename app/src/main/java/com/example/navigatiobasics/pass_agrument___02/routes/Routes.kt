package com.example.navigatiobasics.pass_agrument___02.routes


//now we will defind the route with the arguments
//calls the navarguments
object Routes {
    val screenA = "screenA"

    //you have to pass the parameter always cannot use default values use below path url
    //val screenB = "screenB/{name}/{Age}"

//    to use the default values use the below path formate
    const val screenB = "screenB?name={name}&age={age}"
}