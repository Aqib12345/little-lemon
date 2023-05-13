package aqib.littlelemon.composables

import android.content.Context
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Home(context: Context) {
    val sharedPreferences = context.getSharedPreferences("Little Lemon", Context.MODE_PRIVATE)

    val firstName = sharedPreferences.getString("firstName", "")
    val lastName = sharedPreferences.getString("lastName", "")

    Text(text = "Welcome $firstName $lastName")

}