package com.gustavozreis.guiabauru.data

import androidx.annotation.DrawableRes
import com.gustavozreis.guiabauru.R
import com.gustavozreis.guiabauru.entities.Estabelecimento

/*

Essa classe de objetos contém todos os estabelecimentos que serão utilizados no app.
Dentro das keywords é obrigatório conter uma e somente uma das keywords que definem
as categorias em [CategoriesStartData]

 */

object EstabelecimentosData {
    var estabelecimentosList: List<Estabelecimento> = listOf(
        Estabelecimento(
            id = 9,
            name = "Fried Fish Vilarejo",
            keywords = mutableListOf("Restaurantes", "Brasileira", "Frutos do Mar") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Camarões, peixe frito e saladas, além de fritas e cervejas, em espaço informal com mesinhas e música ao vivo.",
            localization = "R. José Ruíz Pelegrina, 7-55"
        ),
        Estabelecimento(
            id = 8,
            name = "La Parmigiana",
            keywords = mutableListOf("Restaurantes", "Italiana") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Viva a experiência da gastronomia italiana em Bauru.",
            localization = "R. Prof. Antônio Réis Filho, 3-94"
        ),
        Estabelecimento(
            id = 7,
            name = "Alex Restaurante",
            keywords = mutableListOf("Restaurantes", "Caseira", "Brasileira") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "O Alex Restaurante une conceitos de qualidade e agilidade em seus serviços e está pronto para atender todos os clientes que buscam refeições saudáveis e balanceadas por preços justos.",
            localization = "Avenida Affonso José Aiello 4-19"
        ),
        Estabelecimento(
            id = 6,
            name = "Tayu",
            keywords = mutableListOf("Restaurantes", "Japonesa", "Chinesa") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Tradição, respeito e dedicação à arte culinária. Cozinha tradicional asiática, hawaiana e brasileira.",
            localization = "R. José Antonio Braga, 2-77"
        ),
        Estabelecimento(
            id = 5,
            name = "Skinão",
            keywords = mutableListOf("Restaurantes", "Fast-Food") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Fundado em 1980, o Skinão serve porções, drinks e o mais famoso lanche Bauru da cidade.",
            localization = "Av Octávio Pinheiro Brisola, 21-21"
        ),
        Estabelecimento(
            id = 4,
            name = "La Terrase",
            keywords = mutableListOf("Restaurantes", "Alta Cozinha") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "La Terrasse é um restaurante de alto nível com pratos sofisticados.",
            localization = "Rua Lero Lero, 21-21"
        ),
        Estabelecimento(
            id = 3,
            name = "Sampa",
            keywords = mutableListOf("Vida Noturna", "Balada") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Sampa é uma balada mas também um barzinho.",
            localization = "Av Octávio Pinheiro Brisola, 21-21"
        ),
        Estabelecimento(
            id = 2,
            name = "Parque Vitória Régia",
            keywords = mutableListOf("Turismo", "Parque") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "O Parque Vitória Régia é o mais famoso parque de Bauru.",
            localization = "Av. Nações Unidas, 21-21"
        ),
        Estabelecimento(
            id = 1,
            name = "Ginásio Panela de Pressão",
            keywords = mutableListOf("Esporte", "Pago") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "O Ginásio Panela de Pressão é um ginásio de esportes.",
            localization = "Rua Seu João, 21-21"
        )

    )
}