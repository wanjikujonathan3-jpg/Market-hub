package com.jonathan.markethub.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.jonathan.markethub.R
import com.jonathan.markethub.navigation.ROUT_LOGIN
import com.jonathan.markethub.ui.screens.onboarding.OnboardingScreen
import com.jonathan.markethub.ui.theme.neworange




@Composable
fun RegisterScreen(navController: NavController) {
    Column(
        modifier = Modifier .fillMaxSize()
            .paint(painter = painterResource(R.drawable.background), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,



    ) {



        Image(painter = painterResource(R.drawable.product),
            contentDescription = "product",
            modifier = Modifier.size(200.dp)



        )


        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text ="Join us and start your journey with us today",
            fontWeight = FontWeight.Bold,
            color = neworange,

            )


        Spacer(modifier = Modifier.size(10.dp))


        // Variables
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpasword by remember { mutableStateOf("") }



        OutlinedTextField(
            value = username,
            onValueChange = { username = it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
            label = {Text(text = "username")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Green,
                focusedTextColor = Color.Black,
                unfocusedLeadingIconColor = neworange
            )


        )



        OutlinedTextField(
            value = email,
            onValueChange = { email = it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
            label = {Text(text = "email")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Green,
                focusedTextColor = Color.Black,
                unfocusedLeadingIconColor = neworange
            )




        )


        OutlinedTextField(
            value = password,
            onValueChange = { password = it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            label = {Text(text = "password")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Green,
                focusedTextColor = Color.Black,
                unfocusedLeadingIconColor = neworange
            ),
            visualTransformation = PasswordVisualTransformation()


        )


        OutlinedTextField(
            value = confirmpasword,
            onValueChange = { confirmpasword = it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
            label = {Text(text = "confirm password")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Green,
                focusedTextColor = Color.Cyan,
                unfocusedLeadingIconColor = neworange
            )


        )

        Spacer(modifier = Modifier.size(10.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)


        ) {
            Text(
                text = "Register",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        TextButton( onClick = {navController.navigate(ROUT_LOGIN)}) {
            Text(text = "Already have an account ?  Login ")
        }










































    }

}



@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {


    RegisterScreen(rememberNavController())


}


