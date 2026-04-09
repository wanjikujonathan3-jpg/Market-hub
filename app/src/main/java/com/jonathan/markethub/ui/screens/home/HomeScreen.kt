package com.jonathan.markethub.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.jonathan.markethub.ui.theme.neworange
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.jonathan.markethub.R



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {


        TopAppBar(
            title = { Text(text = "Home") },

            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = ""

                        )


                }
            },

            actions = {



            },
            colors = topAppBarColors(
                containerColor = Color.Blue,
                navigationIconContentColor = Color.Green
            ),





        )

        //searchbar

        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange = {search =it},
            modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 20.dp) .fillMaxWidth(),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "")},
            placeholder = { Text(text = "search products category")}
        )

        //end of searchbar

        Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Featured Products",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 20.dp),
                color = neworange,

            )




        Spacer(modifier = Modifier.height(10.dp))

        //row
        Row(
            modifier = Modifier.padding(start = 20.dp, end = 20.dp).horizontalScroll(rememberScrollState()
            )
        ) {
            Column() {
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = "product",
                    modifier = Modifier.size(100.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "Products",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp),
                    color = neworange,

                    )

            }



            Spacer(modifier = Modifier.width(10.dp))




            Column() {
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = "product",
                    modifier = Modifier.size(100.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Products",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp),
                    color = neworange,

                    )

            }

            Spacer(modifier = Modifier.width(10.dp))




            Column() {
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = "product",
                    modifier = Modifier.size(100.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Products",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp),
                    color = neworange,

                    )

            }

            Spacer(modifier = Modifier.width(10.dp))





        }
        //end of row





















}

}



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()







}