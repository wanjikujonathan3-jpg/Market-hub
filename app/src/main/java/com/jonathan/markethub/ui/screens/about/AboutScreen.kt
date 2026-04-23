package com.jonathan.markethub.ui.screens.about


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun About(navController: NavController){


}

@Composable
@Preview(showBackground = true)
fun AboutPreview(){
    About(rememberNavController())
}

annotation class AboutScreen
