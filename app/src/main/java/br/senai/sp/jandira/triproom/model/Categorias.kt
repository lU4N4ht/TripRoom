package br.senai.sp.jandira.triproom.model

import androidx.compose.ui.graphics.painter.Painter
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "tbl_categorias")
data class Categorias(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var imagem: Painter? = null,
    var nome: String = ""
)
