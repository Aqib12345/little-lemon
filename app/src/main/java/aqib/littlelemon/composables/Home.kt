package aqib.littlelemon.composables

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import aqib.littlelemon.R
import aqib.littlelemon.navigation.Profile
import aqib.littlelemon.ui.theme.PrimaryGreen

@Composable
fun Home(context: Context, navController: NavHostController) {
    val sharedPreferences = context.getSharedPreferences("Little Lemon", Context.MODE_PRIVATE)

    val firstName = sharedPreferences.getString("firstName", "")
    val lastName = sharedPreferences.getString("lastName", "")
    val email = sharedPreferences.getString("email", "")

    Column() {

        Header(navController)

        Card(border = BorderStroke(1.dp, PrimaryGreen),
            elevation = 10.dp,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .requiredHeight(100.dp)) {
            Column(verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()) {
                Text(text = "$firstName $lastName", style = MaterialTheme.typography.h1, textAlign = TextAlign.Center)
                Text(text = "$email", style = MaterialTheme.typography.h3, textAlign = TextAlign.Center)
            }

        }





    }


}

@Composable
fun Header(navController: NavHostController){
    Row(
        Modifier
            .fillMaxWidth()
            .padding(20.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceBetween) {
        Spacer(modifier = Modifier.width(50.dp))
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "Little Lemon Logo",
            modifier = Modifier
                .fillMaxWidth(0.65f))

        Box(modifier = Modifier
            .size(50.dp)
            .clickable { navController.navigate(Profile.route) }){
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Profile Icon",
                tint = PrimaryGreen,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 2.dp))
        }


    }
}