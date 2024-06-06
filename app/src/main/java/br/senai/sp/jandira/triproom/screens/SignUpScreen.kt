package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
fun  SignUpScreen(controleDeNavegacao: NavHostController) {

    val ur = UsuariosRepository(LocalContext.current)

    //Definindo as variáveis de estado
    var nameState = remember {
        mutableStateOf("")
    }
    var phoneState = remember {
        mutableStateOf("")
    }
    var emailState = remember {
        mutableStateOf("")
    }
    var passwordState = remember {
        mutableStateOf("")
    }
    var checkBoxState = remember {
        mutableStateOf(false)
    }
    var mensagemErroState = remember {
        mutableStateOf("")
    }


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
                    text = stringResource(id = R.string.sign_up),
                    color = Color(0xFFED4D5E),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.W900,
                    fontFamily = FontFamily.SansSerif
                )
                Text(
                    text = stringResource(id = R.string.create_account),
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
                    value = nameState.value,
                    onValueChange = {
                        nameState.value = it
                    },
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
                                text = stringResource(id = R.string.user_name),
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
                    value = phoneState.value,
                    onValueChange = {
                        phoneState.value = it
                    },
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
                                text = stringResource(id = R.string.user_phone),
                                modifier = Modifier
                                    .padding(start = 18.dp)
                            )
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFED4D5E),
                        unfocusedBorderColor = Color(0xFFED4D5E),
                        focusedTextColor = Color.Black
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .width(327.dp)
                )
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
                        .width(327.dp),

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
                    .fillMaxWidth()
                    .padding(start = 19.dp, top = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ){
                Checkbox(
                    checked = checkBoxState.value,
                    onCheckedChange = {
                                      checkBoxState.value = it
                    },
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color(0xFFED4D5E),
                        uncheckedColor = Color(0xFFED4D5E)
                    )

                )
                Text(text = stringResource(id = R.string.user_over_18))
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ){
                Text(text = mensagemErroState.value, color = Color.Red)
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                        if (nameState.value == "" || phoneState.value == "" || emailState.value == "" || passwordState.value == ""){
                            mensagemErroState.value = "Preencha todos os campos!"

                        } else{

                            val usuario = Usuarios(
                                nome = nameState.value,
                                telefone = phoneState.value,
                                email = emailState.value,
                                senha = passwordState.value,
                                isMaiorIdade = checkBoxState.value
                            )

                            ur.salvar(usuario)

                            mensagemErroState.value = ""
                            controleDeNavegacao.navigate("login")
                        }
                    },
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
                        text = stringResource(id = R.string.create_account),
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
                    text = stringResource(id = R.string.sign_up_change_to_login),
                    color = Color.Gray,
                    fontWeight = FontWeight.W300,
                    fontSize = 12.sp
                )
                Text(
                    text = stringResource(id = R.string.sign_in),
                    color = Color(0xFFED4D5E),
                    fontWeight = FontWeight.W700,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .clickable {
                            controleDeNavegacao.navigate("login")
                        }
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

@Preview(showSystemUi = true)
@Composable
fun SignUpScreenPreview() {
//    SignUpScreen(controleDeNavegacao)
}