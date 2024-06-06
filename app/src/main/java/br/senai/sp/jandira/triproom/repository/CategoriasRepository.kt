package br.senai.sp.jandira.triproom.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.Categorias
import java.time.LocalDate

class CategoriasRepository {
    @Composable
    fun listarTodasAsCategorias(): List<Categorias>{

        val montain = Categorias(
            1,
            imagem = painterResource(id = R.drawable.montanha),
            "Montain"
        )
        val snow = Categorias(
            2,
            imagem = painterResource(id = R.drawable.snow),
            "Snow"
        )
        val beach = Categorias(
            3,
            imagem = painterResource(id = R.drawable.beach),
            "Beach"
        )
        val city = Categorias(
            3,
            imagem = painterResource(id = R.drawable.city),
            "City"
        )
        val museum = Categorias(
            3,
            imagem = painterResource(id = R.drawable.museum),
            "Museum"
        )


        return listOf(montain, snow, beach, city, museum)

    }
}