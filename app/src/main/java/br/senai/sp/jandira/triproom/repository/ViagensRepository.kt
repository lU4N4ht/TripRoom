package br.senai.sp.jandira.triproom.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.triproom.model.Viagens
import java.time.LocalDate

class ViagensRepository {
    @Composable
    fun listarTodasAsViagens(): List<Viagens>{

        val machupicchu = Viagens(
            1,
            "Machu Picchu",
            "Machu Picchu, a misteriosa cidade dos Incas, mistura o real e o imaginário em doses perfeitas de natureza, cultura e misticismo.",
            dataChegada =  LocalDate.of(2019,2,18),
            dataPartida =  LocalDate.of(2019,2,21),
            imagem = painterResource(id = br.senai.sp.jandira.triproom.R.drawable.macgupicchu)
        )
        val paris = Viagens(
            2,
            "Paris",
            "Paris, a capital da França, é uma importante cidade europeia e um centro mundial de arte, moda, gastronomia e cultura.",
            dataChegada =  LocalDate.of(2022,6,1),
            dataPartida =  LocalDate.of(2022,6,30),
            imagem = painterResource(id = br.senai.sp.jandira.triproom.R.drawable.paris)
        )
        val recife = Viagens(
            3,
            "Recife",
            "Recife, a capital do estado de Pernambuco, no nordeste do Brasil, distingue-se pelos seus vários rios, pontes, ilhéus e penínsulas.",
            dataChegada =  LocalDate.of(2010,3,12),
            dataPartida =  LocalDate.of(2010,3,29),
            imagem = painterResource(id = br.senai.sp.jandira.triproom.R.drawable.recife)
        )
        val cancun = Viagens(
            4,
            "Cancun",
            "Cancún, uma cidade mexicana situada na Península de Iucatã, na costa do Mar do Caribe, é conhecida por suas praias, seus vários resorts e sua vida noturna.",
            dataChegada =  LocalDate.of(2023,10,12),
            dataPartida =  LocalDate.of(2023,10,18),
            imagem = painterResource(id = br.senai.sp.jandira.triproom.R.drawable.cancun)
        )
        val aruba = Viagens(
            5,
            "Aruba",
            "Aruba, pequena ilha do Caribe holandês ao largo da costa da Venezuela, tem clima seco, praias ensolaradas e ondas suaves.",
            dataChegada =  LocalDate.of(2023,11,1),
            dataPartida =  LocalDate.of(2023,11,7),
            imagem = painterResource(id = br.senai.sp.jandira.triproom.R.drawable.aruba)
        )

        return listOf(machupicchu,paris,recife,cancun,aruba)

    }
}