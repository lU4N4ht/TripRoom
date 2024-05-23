package br.senai.sp.jandira.triproom.model

import androidx.compose.ui.graphics.painter.Painter
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
@Entity(tableName = "tbl_viagens")
data class Viagens(

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    var destino: String = "",
    var descricao: String = "",

    @ColumnInfo(name = "data_chegada", defaultValue = "1990-01-01")
    var dataChegada: LocalDate = LocalDate.now(),

    @ColumnInfo(name = "data_partida", defaultValue = "1990-01-01")
    var dataPartida: LocalDate = LocalDate.now(),

    var imagem: Painter? = null
)
