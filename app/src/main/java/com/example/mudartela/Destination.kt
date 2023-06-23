package com.example.mudartela

sealed class Destination(var route: String){
    object ScreenFirst: Destination("ScreenFirst")
    object ScreenSecond: Destination("ScreenSecond")
}
