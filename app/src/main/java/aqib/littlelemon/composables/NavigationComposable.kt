package aqib.littlelemon.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import aqib.littlelemon.navigation.Home
import aqib.littlelemon.navigation.Onboarding
import aqib.littlelemon.navigation.Profile

@Composable
fun NavigationComposable(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Onboarding.route){
        composable(Onboarding.route){
            Onboarding(navController)
        }
        composable(Home.route){
            Home()
        }
        composable(Profile.route){
            Profile()
        }
    }
}