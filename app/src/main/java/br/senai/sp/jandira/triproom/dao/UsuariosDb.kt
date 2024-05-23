package br.senai.sp.jandira.triproom.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.triproom.model.Usuarios

@Database(entities = [Usuarios::class], version = 1)
abstract class UsuariosDb : RoomDatabase(){

    abstract fun usuarioDao() : UsuariosDao

    companion object{

        private lateinit var instancia: UsuariosDb

        fun getBancoDeDados(context: Context): UsuariosDb{
            instancia = Room
                .databaseBuilder(
                    context,
                    UsuariosDb::class.java,
                    "db_usuarios"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return instancia
        }
    }
}