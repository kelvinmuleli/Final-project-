package net.ezra.ui.home




import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_BOOKMARKED_ROUTES
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUtE_VIEW_STUDENTS


import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import net.ezra.R

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.text.font.FontWeight
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_ROUTES_LIST
import net.ezra.navigation.ROUTE_SPLASH
import net.ezra.ui.students.uploadImageToFirebaseStorage
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment




@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        content = {
            Box(modifier = Modifier.fillMaxSize()){

                LazyColumn (modifier = Modifier.fillMaxSize()){

                    item {



                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Absolute.SpaceBetween)
                        {

                            Image(imageVector = Icons.Default.AccountCircle, contentDescription = "", modifier= Modifier.size(30.dp))
                            Column {
                                Text(text = "Ease travel")
                                Text(text = "")
                            }

                            Icon(imageVector = Icons.Default.Place, contentDescription ="notificationIcon" , modifier =  Modifier.size(30.dp))
                        }
                        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically) {
                            var text by remember { mutableStateOf(TextFieldValue("")) }
                            OutlinedTextField(
                                value = text,
                                trailingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "searchIcon",modifier=Modifier.clickable {  navController.navigate(ROUTE_HOME) { popUpTo(
                                    ROUTE_HOME)} }) },
                                //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                                onValueChange = {
                                    text = it
                                },
                                label = { Text(text = "Search places") },
                                placeholder = { Text(text = "Search places") },
                                modifier = Modifier
                                    .background(Color.DarkGray)
                                    .width(290.dp)
                            )
                        }
                        LazyRow (modifier=Modifier.fillMaxWidth()){
                            item{




                                Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(
                                    ROUTE_SIGNUP)} } ,modifier = Modifier
                                    .padding(15.dp)
                                    .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                                    .shadow(elevation = 10.dp)
                                ) {
                                    Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.background(
                                        Color.White)){
                                        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "" , modifier = Modifier.size(70.dp))
                                        Text(text = "Safety Drive")
                                    }
                                }
                                Spacer(modifier = Modifier.width(15.dp))

                                Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(
                                    ROUTE_ROUTES_LIST)} } ,modifier = Modifier
                                    .padding(15.dp)
                                    .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                                    .shadow(elevation = 10.dp)) {
                                    Row(horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                        Color.White)) {
                                        Image(painter = painterResource(id = R.drawable.splash), contentDescription = "" , modifier = Modifier.size(70.dp))
                                        Text(text = "Travelling Routes")
                                    }
                                }
                                Spacer(modifier = Modifier.width(15.dp))

                                Card(
                                    onClick = { navController.navigate(ROUTE_HOME) { popUpTo(
                                        ROUTE_PRODUCTS) } },
                                    modifier = Modifier
                                        .padding(15.dp)
                                        .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                                        .shadow(elevation = 10.dp)
                                ) {
                                    Row(horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                        Color.White)){
                                        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "" , modifier = Modifier.size(70.dp))
                                        Text(text = " Places")
                                    }
                                }
                                Spacer(modifier = Modifier.width(15.dp))

                                Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(
                                    ROUTE_PRODUCTS)} },modifier = Modifier
                                    .padding(15.dp)
                                    .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                                    .shadow(elevation = 10.dp)) {
                                    Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                        Color.White)){
                                        Image(painter = painterResource(id = R.drawable.splash), contentDescription = "", modifier = Modifier.size(70.dp) )
                                        Text(text = " categories")
                                    }
                                }
                                Spacer(modifier = Modifier.width(15.dp))

                                Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(
                                    ROUTE_SPLASH)} },modifier = Modifier
                                    .padding(15.dp)
                                    .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                                    .shadow(elevation = 10.dp)) {
                                    Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                        Color.White)){
                                        Image(painter = painterResource(id = R.drawable.splash), contentDescription = "" , modifier = Modifier.size(70.dp))
                                        Text(text = " view all")
                                    }
                                }
                                Spacer(modifier = Modifier.width(15.dp))

                                Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(
                                    ROUtE_VIEW_STUDENTS)} },modifier = Modifier
                                    .padding(15.dp)
                                    .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                                    .shadow(elevation = 10.dp)) {
                                    Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                        Color.White)){
                                        Image(painter = painterResource(id = R.drawable.publict), contentDescription = "" , modifier = Modifier.size(70.dp))
                                        Text(text = " cco")
                                    }
                                }


                            }

                        }

                        Row (
                            horizontalArrangement = Arrangement.SpaceEvenly , modifier=Modifier.fillMaxWidth()
                        )
                        {
                            Column(horizontalAlignment = AbsoluteAlignment.Left){
                                Text(text = "Popular Packages",fontWeight = FontWeight.ExtraBold)
                            }
                            Spacer(modifier = Modifier.width(50.dp))
                            Column(horizontalAlignment = AbsoluteAlignment.Right){
                                Text(text = " View all", modifier = Modifier.clickable {  navController.navigate(ROUTE_HOME) { popUpTo(
                                    ROUTE_HOME)} })
                            }


                        }

                        LazyRow () {
                            item {
                                Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(
                                    ROUTE_ABOUT) } }) {
                                    Column() {
                                        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "" , modifier = Modifier.fillMaxWidth(),contentScale = ContentScale.Crop)
                                        Row(modifier=Modifier.fillMaxWidth()){
                                            Column (verticalArrangement = Arrangement.Center, horizontalAlignment = AbsoluteAlignment.Left){
                                                Text(text = "Along Rift Valley")
                                                Row (horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
                                                    Icon(imageVector =Icons.Default.LocationOn , contentDescription ="",modifier=Modifier.size(12.dp) )
                                                    Text(text = "Turkana-Kajiado")
                                                }

                                            }
                                            Column (verticalArrangement = Arrangement.Center, horizontalAlignment = AbsoluteAlignment.Right){
                                                Text(text = "3 Days")
                                                Text(text = "2 Nights")
                                            }

                                        }

                                    }
                                }
                                Spacer(modifier = Modifier.width(13.dp))

                                Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(
                                    ROUTE_ADD_STUDENTS)} }, ) {
                                    Column() {
                                        Image(painter = painterResource(id = R.drawable.car), contentDescription = "" , modifier = Modifier.size(12.dp),contentScale = ContentScale.Crop)
                                        Row(modifier=Modifier.width(200.dp)){
                                            Column (verticalArrangement = Arrangement.Center, horizontalAlignment = AbsoluteAlignment.Left){
                                                Text(text = "Summit Madness")
                                                Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
                                                    Icon(imageVector =Icons.Default.LocationOn , contentDescription ="",modifier=Modifier.size(12.dp) )
                                                    Text(text = "Mombasa-Kajiado", fontWeight = FontWeight.ExtraLight,)
                                                }


                                            }

                                            Text(
                                                modifier = Modifier
                                                    .clickable {
                                                        navController.navigate(ROUTE_SERVICES) {
                                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                                        }
                                                    },
                                                text = "Home"
                                            )


                                            Text(
                                                modifier = Modifier
                                                    .clickable {
                                                        navController.navigate(ROUTE_SHOP) {
                                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                                        }
                                                    },
                                                text = "shop"
                                            )


                                            Text(
                                                modifier = Modifier
                                                    .clickable {
                                                        navController.navigate(ROUTE_PRODUCTS) {
                                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                                        }
                                                    },
                                                text = "services"
                                            )

                                            Text(
                                                modifier = Modifier
                                                    .clickable {
                                                        navController.navigate(ROUTE_ADD_STUDENTS) {
                                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                                        }
                                                    },
                                                text = "add"
                                            )


                                            Column (verticalArrangement = Arrangement.Center, horizontalAlignment = AbsoluteAlignment.Right){
                                                Text(text = " 4 Days")
                                                Text(text = " 3 Nights")
                                            }
                                        }


                                    }
                                }
                                Spacer(modifier = Modifier.width(13.dp))

                                Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(
                                    ROUTE_SIGNUP)} },) {
                                    Column() {
                                        Image(painter = painterResource(id = R.drawable.bs), contentDescription = "" , modifier = Modifier.size(12.dp),contentScale = ContentScale.Crop)
                                        Row (modifier=Modifier.fillMaxWidth()){
                                            Column (verticalArrangement = Arrangement.Center, horizontalAlignment = AbsoluteAlignment.Left){
                                                Text(text = "Kenya Classics")
                                                Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
                                                    Icon(imageVector =Icons.Default.LocationOn , contentDescription ="",modifier=Modifier.size(12.dp) )
                                                    Text(text = "Nairobi-Mombasa", fontWeight = FontWeight.ExtraLight,)
                                                }

                                            }
                                            Column (verticalArrangement = Arrangement.Center, horizontalAlignment = AbsoluteAlignment.Right)
                                            {
                                                Text(text = "10 Days")
                                                Text(text = "9 Nights")
                                            }

                                        }


                                    }
                                }
                                Spacer(modifier = Modifier.width(13.dp))

                                Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(
                                    ROUTE_BOOKMARKED_ROUTES)} },) {
                                    Column() {
                                        Image(painter = painterResource(id = R.drawable.yolks), contentDescription = "" , modifier = Modifier.fillMaxWidth(),contentScale = ContentScale.Crop)
                                        Row(modifier=Modifier.size(12.dp)) {

                                            Column (verticalArrangement = Arrangement.Center, horizontalAlignment = AbsoluteAlignment.Left){
                                                Text(text = "Time travel")
                                                Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
                                                    Icon(imageVector =Icons.Default.LocationOn , contentDescription ="",modifier=Modifier.size(15.dp) )
                                                    Text(text = "Mombasa-Turkana", fontWeight = FontWeight.ExtraLight,)
                                                }

                                            }
                                            Column (verticalArrangement = Arrangement.Center, horizontalAlignment = AbsoluteAlignment.Right){
                                                Text(text = "5 Days")
                                                Text(text = "4 Nights")
                                            }
                                        }

                                    }
                                }
                                Spacer(modifier = Modifier.width(13.dp))

                                Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(
                                    ROUTE_ADD_STUDENTS)} },) {

                                    Column() {
                                        Image(painter = painterResource(id = R.drawable.klm), contentDescription = "" , modifier = Modifier.size(12.dp),contentScale = ContentScale.Crop)
                                        Row (modifier=Modifier.fillMaxWidth()){
                                            Column (verticalArrangement = Arrangement.Center, horizontalAlignment = AbsoluteAlignment.Left){
                                                Text(text = "Karibu Kenya")
                                                Row (horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
                                                    Icon(imageVector =Icons.Default.LocationOn , contentDescription ="",modifier=Modifier.size(12.dp) )
                                                    Text(text = "Kiambu-Mombasa", fontWeight = FontWeight.ExtraLight,)

                                                }
                                            }
                                            Column (verticalArrangement = Arrangement.Center, horizontalAlignment = AbsoluteAlignment.Right){
                                                Text(text = "7 Days")
                                                Text(text = "6 Nights")
                                            }
                                        }




                                    }
                                }

                            }
                        }
                        Row (horizontalArrangement = Arrangement.SpaceBetween ,modifier=Modifier.fillMaxWidth()){
                            Column( horizontalAlignment = AbsoluteAlignment.Left) {
                                Text(text = "Recommended Places",fontWeight = FontWeight.ExtraBold,)
                            }
                            Spacer(modifier = Modifier.width(40.dp))

                            Column( horizontalAlignment = AbsoluteAlignment.Right) {
                                Text(text = "View all", modifier = Modifier.clickable {  navController.navigate(ROUTE_HOME) { popUpTo(
                                    ROUTE_ABOUT)}})
                            }


                        }
                        LazyRow (){
                            item {

                                Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                                    Card (shape = CircleShape, modifier = Modifier
                                        .size(80.dp)
                                        .clickable { navController.navigate(ROUTE_HOME) { popUpTo(
                                            ROUTE_SHOP) } }){
                                        Image(painter = painterResource(id = R.drawable.yolks), contentDescription = "",  contentScale = ContentScale.Crop)
                                    }
                                    Text(text = "Vasco da Gama")
                                }
                                Spacer(modifier = Modifier.width(15.dp))

                                Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                                    Card (shape = CircleShape, modifier = Modifier
                                        .size(80.dp)
                                        .clickable { navController.navigate(ROUTE_HOME) { popUpTo(
                                            ROUTE_SERVICES) } }){
                                        Image(painter = painterResource(id = R.drawable.car
                                        ), contentDescription = "", modifier = Modifier.fillMaxSize(),contentScale = ContentScale.Crop)
                                    }
                                    Text(text = "Fort Jesus")
                                }
                                Spacer(modifier = Modifier.width(15.dp))

                                Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                                    Card (shape = CircleShape, modifier = Modifier
                                        .size(80.dp)
                                        .clickable { navController.navigate(ROUTE_HOME) { popUpTo(
                                            ROUTE_HOME) } }){
                                        Image(painter = painterResource(id = R.drawable.klm), contentDescription = "", modifier = Modifier.fillMaxSize(),contentScale = ContentScale.Crop)
                                    }
                                    Text(text = "Hell's gate")
                                }
                                Spacer(modifier = Modifier.width(15.dp))

                                Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                                    Card (shape = CircleShape, modifier = Modifier
                                        .size(80.dp)
                                        .clickable { navController.navigate(ROUTE_HOME) { popUpTo(
                                            ROUTE_SIGNUP) } }){
                                        Image(painter = painterResource(id = R.drawable.klm), contentDescription = "", modifier = Modifier.fillMaxSize(),contentScale = ContentScale.Crop)
                                    }
                                    Text(text = "Travel through Wildebeests")
                                }
                                Spacer(modifier = Modifier.width(15.dp))

                                Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                                    Card (shape = CircleShape, modifier = Modifier
                                        .size(8.dp)
                                        .clickable { navController.navigate(ROUTE_HOME) { popUpTo(
                                            ROUTE_SIGNUP) } }){
                                        Image(painter = painterResource(id = R.drawable.yolks), contentDescription = "",contentScale = ContentScale.Crop)
                                    }
                                    Text(text = "Travel through Fourteen falls")
                                }
                                Spacer(modifier = Modifier.width(15.dp))

                                Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                                    Card (shape = CircleShape, modifier = Modifier
                                        .size(80.dp)
                                        .clickable { navController.navigate(ROUTE_HOME) { popUpTo(
                                            ROUtE_VIEW_STUDENTS) } }){
                                        Image(painter = painterResource(id = R.drawable.yolks), contentDescription = "", modifier = Modifier.fillMaxSize(),contentScale = ContentScale.Crop)
                                    }
                                    Text(text = "Travel through Hot tours")
                                }
                                Spacer(modifier = Modifier.width(10.dp))

                                Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                                    Card(shape = CircleShape, modifier = Modifier
                                        .size(80.dp)
                                        .clickable {
                                            navController.navigate(ROUTE_HOME) {
                                                popUpTo(
                                                    ROUTE_LOGIN
                                                )
                                            }
                                        }) {
                                        Image(
                                            painter = painterResource(id = R.drawable.bs),
                                            contentDescription = "",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.Crop
                                        )
                                    }
                                    Text(text = "More tours")



                                }
                            }
                        }
                    }
                }
            }
        },
        bottomBar = {BottomBar(navController)}



    )
}




@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(
        elevation = 10.dp,
        backgroundColor = Color(0xff0FB06A)


    ) {

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"", tint = Color.White)
        },
            label = { Text(text = "Home",color =  Color.White) }, selected = (selectedIndex.value == 0), onClick = {

                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"",tint = Color.White)
        },
            label = { Text(text = "Favorite",color =  Color.White) }, selected = (selectedIndex.value == 1), onClick = {
                navController.navigate(ROUTE_PRODUCTS) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }


            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.LocationOn, "",tint = Color.White)
        },
            label = { Text(
                text = "Explore",
                color =  Color.White) },
            selected = (selectedIndex.value == 2),
            onClick = {

                navController.navigate(ROUTE_ABOUT) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })




        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Search, "",tint = Color.White)
        },
            label = { Text(
                text = "Find",
                color =  Color.White) },
            selected = (selectedIndex.value == 2),
            onClick = {

                navController.navigate(ROUTE_PRODUCTS) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })



    }
}












