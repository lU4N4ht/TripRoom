package br.senai.sp.jandira.triproom

import android.os.Bundle
import android.util.Log
import android.widget.HorizontalScrollView
import android.widget.ScrollView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.AreaChart
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.widget.NestedScrollView
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
                        Row (
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Icon(
                                imageVector = Icons.Filled.Email,
                                tint = Color(0xFFED4D5E),
                                contentDescription = "ícone de um email",
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
                                contentDescription = "ícone de um cadeado",
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
            modifier = Modifier.fillMaxWidth()
        ){
            Column (
                modifier = Modifier
                    .fillMaxWidth(),
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
                    .padding(top = 15.dp),
                horizontalArrangement = Arrangement.Center
            ){
                Card(
                    modifier = Modifier
                        .width(99.dp)
                        .height(99.dp),
                    shape = CircleShape,
                    CardDefaults.cardColors(containerColor = Color(0xffF6F6F6)),
                    border = BorderStroke(2.dp, color = Color(0xffED4D5E))
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Person,
                        tint = Color(0xffED4D5E),
                        contentDescription = "ícone de uma pessoa",
                        modifier = Modifier
                            .padding(start = 18.dp, top = 14.dp)
                            .height(64.dp)
                            .width(64.dp)
                    )
                }
//                Icon(
//                    imageVector = Icons.Filled.AddCircle,
//                    tint = Color(0xff1D213B),
//                    contentDescription = "ícone de um circulo para adicionar",
//                    modifier = Modifier
//                        .padding(top = 40.dp)
//                        .height(28.dp)
//                        .width(28.dp)
//                )

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
                                contentDescription = "ícone de uma pessoa",
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
                                contentDescription = "ícone de um telefone",
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
                                contentDescription = "ícone de um email",
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
                                contentDescription = "ícone de um cadeado",
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
                    checked = false,
                    onCheckedChange = {},
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color(0xFFED4D5E),
                        uncheckedColor = Color(0xFFED4D5E)
                    )

                )
                Text(text = "Over 18?")
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(327.dp)
                        .height(48.dp)
                        .background(
                            color = Color(0xFFED4D5E),
                            shape = RoundedCornerShape(16.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFED4D5E))
                ){
                    Text(
                        text = "CREATE ACCOUNT",
                        fontWeight = FontWeight.W900,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
            Row(
                modifier = Modifier
                    .align(alignment = Alignment.End)
                    .padding(end = 40.dp, top = 12.dp)
            ) {
                Text(
                    text = "Already have an account?",
                    color = Color.Gray,
                    fontWeight = FontWeight.W300,
                    fontSize = 12.sp
                )
                Text(
                    text = "Sign in",
                    color = Color(0xFFED4D5E),
                    fontWeight = FontWeight.W700,
                    fontSize = 12.sp
                )
            }

        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Bottom
        ) {
            Row(
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp)
                    .background(
                        color = Color(0xFFED4D5E),
                        shape = RoundedCornerShape(topEnd = 16.dp)
                    )
            ) {

            }
        }
    }

}

@Composable
fun TripRoomHome(){
    var destinoState = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .height(197.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.homebg),
            contentDescription = "imagem da torre eiffel",
            contentScale = ContentScale.Crop
        )
    }
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .height(197.dp)
                .padding(horizontal = 19.dp)
                .padding(top = 13.dp, bottom = 7.dp),
            verticalArrangement = Arrangement.SpaceBetween

        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Card(
                        modifier = Modifier
                            .width(61.dp)
                            .height(61.dp),
                        shape = CircleShape,
                        border = BorderStroke(2.dp, color = Color(0xFFFFFFFF))
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.profileimg),
                            contentDescription = "imagem de uma mulher",
                            contentScale = ContentScale.Crop
                        )

                    }
                    Text(
                        text = "Susanna Hoffs",
                        color = Color.White,
                        fontWeight = FontWeight.W400,
                        fontSize = 12.sp
                    )
                }
            }

            Column (
                horizontalAlignment = Alignment.Start
            ){
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(
                        imageVector = Icons.Default.Place,
                        contentDescription = "ícone de localização",
                        tint = Color.White
                    )
                    Text(
                        text = "You're in Paris",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                }
                Text(
                    text = "My Trips",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.W700,
                    color = Color.White,
                    modifier = Modifier
                        .padding(start = 8.dp)
                )
            }

        }
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 17.dp, top = 13.dp)
                .background(
                    color = Color(0xfff6f6f6)
                ),
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
            ){
                    Text(
                    text = "Categories",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400,
                    color = Color(0xff565454)
                )
            }
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 7.dp)
            ){
                item{
                    Card(
                        modifier = Modifier
                            .width(109.dp)
                            .height(64.dp)
                            .padding(end = 8.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0xffCF06F0)
                            )
                    )  {
                        Column (
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Card (
                                modifier = Modifier
                                    .width(32.dp)
                                    .height(32.dp),
                                colors = CardDefaults
                                    .cardColors(
                                        containerColor = Color(0x00CF06F0)
                                    )

                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.montanha),
                                    contentDescription = "ícone de uma montanha"
                                )
                            }
                            Text(
                                text = "Montain",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.W400,
                                color = Color.White

                                )
                        }
                    }
                    Card(
                        modifier = Modifier
                            .width(109.dp)
                            .height(64.dp)
                            .padding(end = 8.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0xffEAABF4)
                            )
                    )  {
                        Column (
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Card (
                                modifier = Modifier
                                    .width(32.dp)
                                    .height(32.dp),
                                colors = CardDefaults
                                    .cardColors(
                                        containerColor = Color(0x00CF06F0)
                                    )

                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.snow),
                                    contentDescription = "ícone de uma pessoa esquiando"
                                )
                            }
                            Text(
                                text = "Snow",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.W400,
                                color = Color.White

                            )
                        }
                    }
                    Card(
                        modifier = Modifier
                            .width(109.dp)
                            .height(64.dp)
                            .padding(end = 8.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0xffEAABF4)
                            )
                    )  {
                        Column (
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Card (
                                modifier = Modifier
                                    .width(32.dp)
                                    .height(32.dp),
                                colors = CardDefaults
                                    .cardColors(
                                        containerColor = Color(0x00CF06F0)
                                    )

                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.beach),
                                    contentDescription = "ícone de uma praia"
                                )
                            }
                            Text(
                                text = "Montain",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.W400,
                                color = Color.White

                            )
                        }
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center

            ){
                Row (
                    modifier = Modifier
                        .height(54.dp)
                        .width(327.dp)
                        .padding(horizontal = 19.dp)
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(16.dp)
                        ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    OutlinedTextField(
                        value = destinoState.value,
                        onValueChange = {
                            destinoState.value = it
                        },
                        placeholder = {
                            Text(
                                text = "Search your destiny",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.W400,
                                color = Color(0xffA09C9C)
                                )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0x00ED4D5E),
                            unfocusedBorderColor = Color(0x00ED4D5E)
                        ),
                        modifier = Modifier
                            .width(190.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "ícone de lupa",
                        tint = Color(0xffA09C9C),
                        modifier = Modifier
                            .padding(end = 19.dp)
                    )

                }
            }
        }

    }








}






@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TripRoomPreview() {
    TripRoomTheme {
//        TripRoomSignUp()
//        TripRoomLogin()
        TripRoomHome()

    }
}