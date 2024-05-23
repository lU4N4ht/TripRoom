package br.senai.sp.jandira.triproom.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.triproom.model.Viagens

@Database(entities = [Viagens::class], version = 1)
abstract class ViagensDb : RoomDatabase() {

    abstract fun viagemDao() : ViagemDao

    companion object{

        private lateinit var instancia: ViagensDb

        fun getBancoDeDados(context: Context): ViagensDb{
            instancia = Room
                .databaseBuilder(
                    context,
                    ViagensDb::class.java,
                    "db_viagens"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return instancia
        }
    }
}