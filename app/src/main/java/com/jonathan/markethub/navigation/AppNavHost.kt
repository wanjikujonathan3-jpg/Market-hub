package com.jonathan.markethub.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.jonathan.markethub.ui.screens.about.About
import com.jonathan.markethub.ui.screens.about.About

import com.jonathan.markethub.ui.screens.auth.RegisterScreen
import com.jonathan.markethub.ui.screens.home.HomeScreen
import com.jonathan.markethub.ui.screens.intent.IntentScreenPreview
import com.jonathan.markethub.ui.screens.onboarding.OnboardingScreen
import com.jonathan.markethub.ui.screens.products.AddProductScreen
import com.jonathan.markethub.ui.screens.products.UpdateProductScreen
import com.jonathan.markethub.ui.screens.products.ViewProductScreen
import com.jonathan.markethub.ui.screens.services.ServiceScreen
import com.jonathan.markethub.ui.screens.splashscreen.splashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ONBOARDING
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            About(navController)
        }


        composable(ROUT_LOGIN){
            Loginscreen(navController)
        }

        composable(ROUT_ONBOARDING){
            OnboardingScreen(navController)
        }
        composable(ROUT_SERVICES){
            ServiceScreen(navController)
        }

        composable(ROUT_REGISTER){
            RegisterScreen(navController)
        }


        composable(ROUT_SPLASH){
            splashScreen(navController)
        }

        composable(ROUT_INTENT){
            IntentScreenPreview()

        }



        composable(ROUTE_ADD_PRODUCT) { AddProductScreen(navController) }

        composable(ROUTE_VIEW_PRODUCTS) { ViewProductScreen(navController) }

        composable(
            ROUTE_UPDATE_PRODUCT,
            arguments = listOf(navArgument("productId") { type = NavType.StringType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId")!!
            UpdateProductScreen(navController, productId)
        }






    }
}

@Composable
fun Loginscreen(x0: NavHostController) {
    TODO("Not yet implemented")
}


