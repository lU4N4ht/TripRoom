package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.repository.CategoriasRepository
import br.senai.sp.jandira.triproom.repository.ViagensRepository
import br.senai.sp.jandira.triproom.utils.encurtarData

@Composable
fun HomeScreen() {
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
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(197.dp)
                .padding(horizontal = 19.dp)
                .padding(top = 13.dp, bottom = 7.dp),
            verticalArrangement = Arrangement.SpaceBetween

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        modifier = Modifier
                            .width(61.dp)
                            .height(61.dp),
                        shape = CircleShape,
                        border = BorderStroke(2.dp, color = Color(0xFFFFFFFF))
                    ) {
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

            Column(
                horizontalAlignment = Alignment.Start
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 13.dp)
                .background(
                    color = Color(0xfff6f6f6)
                ),
            verticalArrangement = Arrangement.Top
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp, top = 13.dp)
            ) {
                Text(
                    text = "Categories",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400,
                    color = Color(0xff565454)
                )
            }

            val categorias = CategoriasRepository().listarTodasAsCategorias()

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 7.dp, start = 17.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                items(categorias) {
                    Card(
                        modifier = Modifier
                            .width(109.dp)
                            .height(64.dp)
                            .padding(end = 8.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0xFFED4D5E)
                            )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Card(
                                modifier = Modifier
                                    .width(32.dp)
                                    .height(32.dp),
                                colors = CardDefaults
                                    .cardColors(
                                        containerColor = Color(0x00CF06F0)
                                    )

                            ) {
                                Image(
                                    painter = if (it.imagem == null) painterResource(id = R.drawable.lugar) else it.imagem!!,
                                    contentDescription = "ícone das categorias"
                                )
                            }
                            Text(
                                text = it.nome,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.W400,
                                color = Color.White

                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center

            ) {
                Row(
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
                ) {
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
                            unfocusedBorderColor = Color(0x00ED4D5E),
                            focusedTextColor = Color.Black
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
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp)
            ) {
                Text(
                    text = "Past Trips",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400,
                    color = Color(0xff565454)
                )

            }
            val viagens = ViagensRepository().listarTodasAsViagens()

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 9.dp, bottom = 9.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(viagens) {
                    Card(
                        modifier = Modifier
                            .width(325.dp)
                            .padding(bottom = 12.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0xFFFFFFFF)
                            )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(5.dp),
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                modifier = Modifier
                                    .width(315.dp)
                                    .height(106.dp),
                                horizontalArrangement = Arrangement.Center

                            ) {
                                Image(
                                    painter = if (it.imagem == null) painterResource(id = R.drawable.imgnotavailable) else it.imagem!!,
                                    contentDescription = " ",
                                    contentScale = ContentScale.FillWidth
                                )
                            }
                            Row {
                                Text(
                                    text = "${it.destino}, ${it.dataChegada.year}",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.W400,
                                    color = Color(0xFFED4D5E)

                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 5.dp)
                            ) {
                                Text(
                                    text = it.descricao,
                                    fontSize = 10.sp,
                                    textAlign = TextAlign.Justify,
                                    fontWeight = FontWeight.W400,
                                    color = Color(0xffA09C9C)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(end = 11.dp, bottom = 11.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    text = "${encurtarData(it.dataChegada)} - ${encurtarData(it.dataPartida)}",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.W400,
                                    color = Color(0xFFED4D5E)
                                )
                            }

                        }
                    }
                }
            }

        }

    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(end = 27.dp, bottom = 8.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        Box(
            modifier = Modifier
                .width(49.dp)
                .height(49.dp)
                .background(
                    color = Color(0xFFED4D5E),
                    shape = CircleShape
                )
                .border(1.dp, color = Color(0xFFFFFFFF), shape = CircleShape),


        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "ícone de mais",
                tint = Color(0xFFFFFFFF),
                modifier = Modifier
                    .height(20.dp)
                    .align(alignment = Alignment.Center)
            )

        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}