package br.senai.sp.jandira.triproom.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalDate

data class Categorias(
    var id: Int = 0,
    var imagem: Painter? = null,
    var nome: String = ""
)
