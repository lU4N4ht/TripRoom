package br.senai.sp.jandira.triproom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme
import java.nio.file.WatchEvent

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

                }
            }
        }
    }
}

@Composable
fun TripRoomLogin() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Row(
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp)
                    .background(
                        color = Color(0xFFED4D5E),
                        shape = RoundedCornerShape(bottomStart = 16.dp)
                    )
            ) {

            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Card(
                modifier = Modifier
                    .width(99.dp)
                    .height(99.dp),
                shape = CircleShape,
                CardDefaults.cardColors(containerColor = Color(0xff1D213B))
            ) {

            }
        }
        Column(
            modifier = Modifier
                .padding(horizontal = 14.dp)
                .padding(bottom = 100.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Login",
                color = Color(0xFFED4D5E),
                fontSize = 48.sp,
                fontWeight = FontWeight.W900,
                fontFamily = FontFamily.SansSerif
            )

            Text(
                text = "Please sign in to continue.",
                color = Color(0xff1D213B),
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                fontFamily = FontFamily.SansSerif
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 45.dp)
                    .height(200.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(text = "E-mail")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFED4D5E),
                        unfocusedBorderColor = Color(0xFFED4D5E)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .width(327.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = {
                        Text(text = "Password")


                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFED4D5E),
                        unfocusedBorderColor = Color(0xFFED4D5E)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .width(327.dp)
                )
            }

            Row(
                modifier = Modifier
                    .align(alignment = Alignment.End)
                    .padding(end = 18.dp, top = 10.dp)
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(134.dp)
                        .height(48.dp)
                        .background(
                            color = Color(0xFFED4D5E),
                            shape = RoundedCornerShape(16.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFED4D5E))
                )
                {
                    Text(
                        text = "SIGN IN",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W700
                    )

                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = "imagem de uma seta para frente",
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                }
            }

            Row(
                modifier = Modifier
                    .align(alignment = Alignment.End)
                    .padding(end = 18.dp, top = 28.dp)
            ) {
                Text(
                    text = "Don’t have an account?",
                    color = Color.Gray,
                    fontWeight = FontWeight.W300,
                    fontSize = 12.sp
                )
                Text(
                    text = "Sign up",
                    color = Color(0xFFED4D5E),
                    fontWeight = FontWeight.W700,
                    fontSize = 12.sp
                )
            }

        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ){
            Row (
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp)
                    .background(
                        color = Color(0xFFED4D5E),
                        shape = RoundedCornerShape(topEnd = 16.dp)
                    )
            ){

            }
        }

    }

}


@Composable
fun  TripRoomSignUp(){
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Row(
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp)
                    .background(
                        color = Color(0xFFED4D5E),
                        shape = RoundedCornerShape(bottomStart = 16.dp)
                    )
            ) {

            }
        }
        Column (
            modifier = Modifier.fillMaxSize()
        ){
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 18.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )
            {
                Text(
                    text = "Sign Up",
                    color = Color(0xFFED4D5E),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.W900,
                    fontFamily = FontFamily.SansSerif
                )
                Text(
                    text = "Create a new account",
                    color = Color(0xff1D213B),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400,
                    fontFamily = FontFamily.SansSerif
                )
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp),
                horizontalArrangement = Arrangement.Center
            ){
                Card(
                    modifier = Modifier
                        .width(99.dp)
                        .height(99.dp),
                    shape = CircleShape,
                    CardDefaults.cardColors(containerColor = Color(0xff1D213B))
                ) {
//                    Icon(
//                        imageVector = Icons.Filled.Person,
//                        tint = Color.White,
//                        contentDescription = "imagem de um email",
//                        modifier = Modifier
//                            .padding(start = 10.dp)
//                    )
                }

            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(340.dp)
                    .padding(top = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ){
                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = {
                        Row (
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Icon(
                                imageVector = Icons.Filled.Person,
                                tint = Color(0xFFED4D5E),
                                contentDescription = "imagem de um email",
                                modifier = Modifier
                                .padding(start = 10.dp)
                    )
                            Text(
                                text = "Username",
                                modifier = Modifier
                                    .padding(start = 18.dp)
                            )
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFED4D5E),
                        unfocusedBorderColor = Color(0xFFED4D5E)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .width(327.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = {
                        Row (
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Icon(
                                imageVector = Icons.Filled.Phone,
                                tint = Color(0xFFED4D5E),
                                contentDescription = "imagem de um email",
                                modifier = Modifier
                                    .padding(start = 10.dp)
                            )
                            Text(
                                text = "Phone",
                                modifier = Modifier
                                    .padding(start = 18.dp)
                            )
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFED4D5E),
                        unfocusedBorderColor = Color(0xFFED4D5E)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .width(327.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = {
                        Row (
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Icon(
                                imageVector = Icons.Filled.Email,
                                tint = Color(0xFFED4D5E),
                                contentDescription = "imagem de um email",
                                modifier = Modifier
                                    .padding(start = 10.dp)
                            )
                            Text(
                                text = "E-mail",
                                modifier = Modifier
                                    .padding(start = 18.dp)
                            )
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFED4D5E),
                        unfocusedBorderColor = Color(0xFFED4D5E)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .width(327.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = {
                        Row (
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Icon(
                                imageVector = Icons.Filled.Lock,
                                tint = Color(0xFFED4D5E),
                                contentDescription = "imagem de um email",
                                modifier = Modifier
                                    .padding(start = 10.dp)
                            )
                            Text(
                                text = "Password",
                                modifier = Modifier
                                    .padding(start = 18.dp)
                            )
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFED4D5E),
                        unfocusedBorderColor = Color(0xFFED4D5E)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .width(327.dp)
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 19.dp, top = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ){
                Checkbox(
                    checked = true,
                    onCheckedChange = { }
                )
                Text(text = "Over 18?")
            }




        }




    }

}








@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TripRoomPreview() {
    TripRoomTheme {
        TripRoomSignUp()

    }
}