package aqib.littlelemon.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import aqib.littlelemon.R
import aqib.littlelemon.navigation.Home
import aqib.littlelemon.ui.theme.PrimaryGreen

@Composable
fun Onboarding(navHostController: NavHostController) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)) {
        Row(Modifier.fillMaxWidth(0.6f)) {
            Image(painter = painterResource(id = R.drawable.logo),
                contentDescription = "Little Lemon Logo")
        }
        Row(modifier = Modifier
            .height(150.dp),
        verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Let's get to know you",
                style = MaterialTheme.typography.h1,
                color = PrimaryGreen)
        }

        Text(text = "Personal Information",
        textAlign = TextAlign.Start,
        modifier = Modifier.fillMaxWidth(),
        style = MaterialTheme.typography.h3)
        OutlinedTextField(
            value = "",
            onValueChange ={},
            label = { Text(text = "First Name")},
            singleLine = true,
            placeholder = { Text(text = "John")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedLabelColor = PrimaryGreen,
                focusedBorderColor = PrimaryGreen
            ),
            modifier = Modifier.fillMaxWidth())

        OutlinedTextField(
            value = "",
            onValueChange ={},
            label = { Text(text = "Last Name")},
            singleLine = true,
            placeholder = { Text(text = "Doe")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedLabelColor = PrimaryGreen,
                focusedBorderColor = PrimaryGreen
            ),
            modifier = Modifier.fillMaxWidth())

        OutlinedTextField(
            value = "",
            onValueChange ={},
            label = { Text(text = "Email")},
            singleLine = true,
            placeholder = { Text(text = "johndoe@gmail.com")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedLabelColor = PrimaryGreen,
                focusedBorderColor = PrimaryGreen
            ),
            modifier = Modifier.fillMaxWidth())
        
        Spacer(modifier = Modifier.size(40.dp))
        
        Button(onClick = {
                         navHostController.navigate(Home.route)
        },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)) {
            Text(text = "Register")
        }
    }


    
}