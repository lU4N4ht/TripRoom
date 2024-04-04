package br.senai.sp.jandira.triproom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.triproom.screens.HomeScreen
import br.senai.sp.jandira.triproom.screens.LoginScreen
import br.senai.sp.jandira.triproom.screens.SignUpScreen
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripRoomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    val controleDeNavegacao = rememberNavController()
                    NavHost(
                        navController = controleDeNavegacao,
                        startDestination = "login"
                    ){
                        composable(route = "login"){
                            LoginScreen(controleDeNavegacao)
                        }
                        composable(route = "signup"){
                            SignUpScreen(controleDeNavegacao)
                        }
                        composable(route = "home"){
                            HomeScreen()
                        }
                    }

                }
            }
        }
    }
}








@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TripRoomPreview() {
    TripRoomTheme {

    }
}