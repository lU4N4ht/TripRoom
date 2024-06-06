package br.senai.sp.jandira.triproom.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.senai.sp.jandira.triproom.model.Usuarios

@Dao
interface UsuariosDao {
    @Insert
    fun salvar (usuarios: Usuarios) : Long

    @Update
    fun atualizar (usuarios: Usuarios) : Int

    @Delete
    fun deletar (usuarios: Usuarios) : Int

    @Query("SELECT * FROM tbl_usuarios ORDER BY nome ASC")
    fun listarTodosOsUsuarios(): List<Usuarios>

    @Query("SELECT * FROM tbl_usuarios WHERE id = :id")
    fun buscarUsuariosPeloId(id: Long): Usuarios

    @Query("SELECT * FROM tbl_usuarios WHERE email = :email AND senha = :senha")
    fun login(email: String, senha: String) : Usuarios

}