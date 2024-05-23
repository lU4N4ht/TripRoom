package br.senai.sp.jandira.triproom.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.triproom.model.Categorias

@Database(entities = [Categorias::class], version = 1)
abstract class CategoriasDb : RoomDatabase() {

    abstract fun categoriasDao() : CategoriasDao

    companion object{

        private lateinit var instancia: CategoriasDb

        fun getBancoDeDados(context: Context): CategoriasDb{
            instancia = Room
                .databaseBuilder(
                    context,
                    CategoriasDb::class.java,
                    "db_categorias"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return instancia
        }
    }
}