package br.senai.sp.jandira.triproom.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_usuarios")
data class Usuarios(

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,

    var nome: String = "",
    var telefone: String = "",
    var email: String = "",
    var senha: String = "",

    @ColumnInfo(name = "is_maior_idade")
    var isMaiorIdade: Boolean = false
)
