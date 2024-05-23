package br.senai.sp.jandira.triproom.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.senai.sp.jandira.triproom.model.Viagens

@Dao
interface ViagemDao {

    @Insert
    fun salvar(viagens: Viagens): Long

    @Update
    fun atualizar(viagens: Viagens): Int

    @Delete
    fun deletar(viagens: Viagens): Int

    @Query("SELECT * FROM tbl_viagens ORDER BY destino ASC")
    fun listarTodasAsViagens(): List<Viagens>

    @Query("SELECT * FROM tbl_viagens WHERE id = :id")
    fun buscarViagensPeloId(id: Long): Viagens

}