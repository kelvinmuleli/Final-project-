package net.ezra.ui.routes

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_ROUTES_LIST
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_SPLASH


@Composable
fun MitScreen(navController: NavHostController) {


Column (
    verticalArrangement = Arrangement.Top

){
    Image(painter = painterResource(id =R.drawable.yolks ) ,
        contentDescription ="yolks" )

}

    Spacer(modifier = Modifier.height(91.dp))

Column(
    verticalArrangement = Arrangement.Center
) {

    Text(text ="Welcome to RoadRover Transport! Log in or You can continue as a guest to tour???", fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily.Serif )

}

 Column(modifier = Modifier
     .background(Color.Transparent)
     .fillMaxSize()
     ,
     verticalArrangement = Arrangement.Bottom,
     horizontalAlignment = Alignment.CenterHorizontally
 ) {



     Button(

         onClick = {
         navController.navigate(ROUTE_LOGIN) {
             popUpTo(ROUTE_ROUTES_LIST) { inclusive = true }
         }
     }, shape = RoundedCornerShape(19.dp))  {
         Image(
             painterResource(id = R.drawable.login),
             contentDescription ="log in button icon",
             modifier = Modifier.size(20.dp))
         Text(text = "Log in?")
     }

     Spacer(modifier = Modifier.height(11.dp))


     Button(onClick = {
         navController.navigate(ROUTE_ADD_STUDENTS) {
             popUpTo(ROUTE_ROUTES_LIST) { inclusive = true }
         }
     }, shape = RoundedCornerShape(19.dp))  {
         Image(
             painterResource(id = R.drawable.login),
             contentDescription ="log in button icon",
             modifier = Modifier.size(20.dp))
         Text(text = "Continue as a guest?")
     }






 }





    }


























@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    MitScreen(rememberNavController())
}




