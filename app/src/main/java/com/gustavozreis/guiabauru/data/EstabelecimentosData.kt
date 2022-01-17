package com.gustavozreis.guiabauru.data

import androidx.annotation.DrawableRes
import com.gustavozreis.guiabauru.R
import com.gustavozreis.guiabauru.entities.Estabelecimento

object EstabelecimentosData {
    var estabelecimentosList: List<Estabelecimento> = listOf(
        Estabelecimento(
            id = 1,
            name = "Skinão",
            keywords = mutableListOf("Gastronomia", "Fast-Food") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Fundado em 1980, o Skinão serve porções, drinks e o mais famoso lanche Bauru da cidade.",
            localization = "Av Octávio Pinheiro Brisola, 21-21"
        ),
        Estabelecimento(
            id = 2,
            name = "La Terrase",
            keywords = mutableListOf("Gastronomia", "Alta Cozinha") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "La Terrasse é um restaurante de alto nível com pratos sofisticados.",
            localization = "Rua Lero Lero, 21-21"
        ),
        Estabelecimento(
            id = 3,
            name = "Sampa",
            keywords = mutableListOf("Vida Noturna", "Bar") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Sampa é uma balada mas também um barzinho.",
            localization = "Av Octávio Pinheiro Brisola, 21-21"
        ),
        Estabelecimento(
            id = 4,
            name = "Parque Vitória Régia",
            keywords = mutableListOf("Turismo", "Gratuito") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "O Parque Vitória Régia é o mais famoso parque de Bauru.",
            localization = "Av. Nações Unidas, 21-21"
        ),
        Estabelecimento(
            id = 5,
            name = "Ginásio Panela de Pressão",
            keywords = mutableListOf("Esporte", "Pago") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "O Ginásio Panela de Pressão é um ginásio de esportes.",
            localization = "Rua Seu João, 21-21"
        )

    )
}