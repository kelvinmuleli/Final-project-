package net.ezra.ui.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_ROUTES_LIST
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

@Composable
fun ProductsScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp)
            .padding(top = 10.dp)

    ){
        Text(text = "this is the product screen")

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_PRODUCTS) { inclusive = true }
                    }
                },
            text = "Go home", color = Color(0xff23D342)
        )
        LazyColumn {
            item {


                Image(
                    painter = painterResource(id = R.drawable.yolks),
                    contentDescription =null,

                    colorFilter = ColorFilter.tint(Color.Transparent)

                )

                Image(
                    painter = painterResource(id = R.drawable.klm),
                    contentDescription =null,

                    colorFilter = ColorFilter.tint(Color.Transparent)

                )

                Image(
                    painter = painterResource(id = R.drawable.trn),
                    contentDescription =null,

                    colorFilter = ColorFilter.tint(Color.Transparent)

                )

                Image(
                    painter = painterResource(id = R.drawable.publict),
                    contentDescription =null,

                    colorFilter = ColorFilter.tint(Color.Transparent)

                )

                Image(
                    painter = painterResource(id = R.drawable.car),
                    contentDescription =null,

                    colorFilter = ColorFilter.tint(Color.Transparent)

                )

                Image(
                    painter = painterResource(id = R.drawable.bs),
                    contentDescription =null,

                    colorFilter = ColorFilter.tint(Color.Transparent)

                )








            }
            }
        }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProductsScreen(rememberNavController())
}
