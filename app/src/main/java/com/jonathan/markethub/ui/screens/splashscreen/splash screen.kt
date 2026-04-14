package com.jonathan.markethub.ui.screens.splashscreen


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.jonathan.markethub.R
import com.jonathan.markethub.navigation.ROUT_ONBOARDING
import com.jonathan.markethub.ui.theme.neworange
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.security.AccessController

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun splashScreen(navController: NavController) {
val coroutine = rememberCoroutineScope ()
    coroutine.launch {
        delay(2000)
        navController.navigate(ROUT_ONBOARDING)}



        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(neworange),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

            )

        {
            Image(
                painter = painterResource(R.drawable.img_1),
                contentDescription = "product",
                modifier = Modifier.size(300.dp)


            )


        }


    }


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {


    splashScreen(rememberNavController())

}














