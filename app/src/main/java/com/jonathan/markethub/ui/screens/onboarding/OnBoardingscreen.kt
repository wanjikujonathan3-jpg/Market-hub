package com.jonathan.markethub.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.jonathan.markethub.R
import com.jonathan.markethub.navigation.ROUT_LOGIN
import com.jonathan.markethub.navigation.ROUT_REGISTER
import com.jonathan.markethub.navigation.ROUT_SERVICES
import com.jonathan.markethub.ui.theme.neworange


@Composable
fun OnboardingScreen(navController: NavController

) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment =Alignment.CenterHorizontally,
        verticalArrangement =Arrangement.Center





    ) {

        Image(painter = painterResource(R.drawable.product),
            contentDescription = "product",
            modifier = Modifier.size(300.dp)



            )
        Spacer(modifier = Modifier.size(10.dp))


        Text(
            text = "WELCOME TO MARKETHUB",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = neworange,
            fontFamily = FontFamily.Serif

        )

        Text(
            text = "Shop Smarter",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black

        )

        Text(
            text = "everywhere you go",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = neworange

        )

        Text(
            text = "An eCommerce website is an online platform where businesses sell products or services directly to customers via the internet, enabling browsing, cart addition, secure payments, and order tracking without physical stores. These sites provide 24/7 access, global reach, and scalability for sellers.\n" +
                    "Key Features\n" +
                    "\n" +
                    "Essential elements include product catalogs with images and descriptions, shopping carts, secure payment gateways, user accounts, order tracking, search functionality, customer reviews, and mobile responsiveness. Additional tools like promotions, SEO optimization, analytics, and email integrations enhance user experience and sales.\n" +
                    "Popular Platforms\n" +
                    "\n" +
                    "Top platforms in 2026 include Wix for beginners with AI tools and templates, Shopify for dropshipping, BigCommerce for large businesses, WooCommerce (WordPress plugin), and Squarespace for design-focused stores. They offer built-in merchant solutions, app integrations, and multichannel selling."
        )
        Button(
            onClick = {  navController.navigate(ROUT_REGISTER)},
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)


        ) {
            Text(
                text = "Get Started",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
























    }






}

@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview() {


    OnboardingScreen(rememberNavController())


}