package br.senai.sp.jandira.triproom.repository

import android.content.Context
import br.senai.sp.jandira.triproom.dao.UsuariosDb
import br.senai.sp.jandira.triproom.model.Usuarios

class UsuariosRepository (context: Context) {

    private val db = UsuariosDb.getBancoDeDados(context).usuarioDao()

    fun salvar(usuarios: Usuarios): Long {
        return db.salvar(usuarios)
    }

    fun listarTodosOsUsuarios(): List<Usuarios>{
        return db.listarTodosOsUsuarios()
    }

    fun login(email: String, password: String): Usuarios{
        return db.login(email, password)
    }

}