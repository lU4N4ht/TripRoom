package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.Usuarios
import br.senai.sp.jandira.triproom.repository.UsuariosRepository

@Composable
fun LoginScreen(controleDeNavegacao: NavHostController) {

    //Definindo as variáveis de estado
    var emailState = remember {
        mutableStateOf("")
    }
    var passwordState = remember {
        mutableStateOf("")
    }
    var mensagemErroState = remember {
        mutableStateOf("")
    }
    var usuario = UsuariosRepository(LocalContext.current)
    

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
                text = stringResource(id = R.string.login_message),
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
                    value = emailState.value,
                    onValueChange = {
                        emailState.value = it
                    },
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
                        unfocusedBorderColor = Color(0xFFED4D5E),
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .width(327.dp)
                )
                OutlinedTextField(
                    value = passwordState.value,
                    onValueChange = {
                        passwordState.value = it
                    },
                    visualTransformation = PasswordVisualTransformation(),
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
                                text = stringResource(id = R.string.user_password),
                                modifier = Modifier
                                    .padding(start = 18.dp)
                            )
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFED4D5E),
                        unfocusedBorderColor = Color(0xFFED4D5E),
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .width(327.dp)
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ){
                Text(text = mensagemErroState.value, color = Color.Red)
            }
            Row(
                modifier = Modifier
                    .align(alignment = Alignment.End)
                    .padding(end = 18.dp, top = 10.dp)
            ) {
                Button(
                    onClick = {
                        if (emailState.value == " " || passwordState.value == ""){

                            mensagemErroState.value = "Preencha os campos corretamente."

                        } else{

                            val usuarios = usuario.login(emailState.value, passwordState.value)

                            if (emailState.value == usuarios.email && passwordState.value == usuarios.senha){

                                controleDeNavegacao.navigate("home")
                            }
                            mensagemErroState.value = "E-mail ou senha incorretos!"
                        }
                              },
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
                        text = stringResource(id = R.string.sign_in),
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
                    text = stringResource(id = R.string.login_change_to_sign_up),
                    color = Color.Gray,
                    fontWeight = FontWeight.W300,
                    fontSize = 12.sp
                )
                Text(
                    text = stringResource(id = R.string.sign_up),
                    color = Color(0xFFED4D5E),
                    fontWeight = FontWeight.W700,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .clickable {
                            controleDeNavegacao.navigate("signup")
                        }
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

@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview() {
//    LoginScreen(controleDeNavegacao)
}