package aqib.littlelemon.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import aqib.littlelemon.R

@Preview(showBackground = true)
@Composable
fun Onboarding() {
    Column() {
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "Little Lemon Logo")
        Text(text = "Let's get to know you")
        Text(text = "Personal Information")
        OutlinedTextField(
            value = "",
            onValueChange ={},
            label = { Text(text = "First Name")},
            singleLine = true,
            placeholder = { Text(text = "John")})

        OutlinedTextField(
            value = "",
            onValueChange ={},
            label = { Text(text = "Last Name")},
            singleLine = true,
            placeholder = { Text(text = "Doe")})

        OutlinedTextField(
            value = "",
            onValueChange ={},
            label = { Text(text = "Email")},
            singleLine = true,
            placeholder = { Text(text = "johndoe@gmail.com")})
        
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Register")
        }
    }


    
}