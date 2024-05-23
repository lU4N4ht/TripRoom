package br.senai.sp.jandira.triproom.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.senai.sp.jandira.triproom.model.Categorias

@Dao
interface CategoriasDao {
    @Insert
    fun salvar(categorias: Categorias): Long

    @Update
    fun atualizar(categorias: Categorias): Int

    @Delete
    fun deletar(categorias: Categorias): Int

    @Query("SELECT * FROM tbl_categorias ORDER BY nome ASC")
    fun listarTodasAsCategorias(): List<Categorias>

    @Query("SELECT * FROM tbl_viagens WHERE id = :id")
    fun buscarCategoriasPeloId(id: Long): Categorias
}