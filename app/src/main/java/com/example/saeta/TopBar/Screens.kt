package com.example.saeta.TopBar

sealed class Screens (val route:String){
    data object SplashScreen:Screens("Splash")
    data object NavigationDrawer:Screens("Drawer")
    data object HomeScreen:Screens("Inicio")
    data object RutasScreen:Screens("Rutas")

}