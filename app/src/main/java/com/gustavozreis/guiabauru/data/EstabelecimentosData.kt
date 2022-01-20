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
            id = 14,
            name = "Fran's Café",
            keywords = mutableListOf("Restaurantes", "Cafés") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Rede de cafeterias tem cafés quentes e frios e menu leve, em ambiente acolhedor e confortável para leitura.",
            location = "Av. Getúlio Vargas, 6-15"
        ),
        Estabelecimento(
            id = 13,
            name = "Comanella",
            keywords = mutableListOf("Restaurantes", "Pizza", "Churrasco", "Brasileira") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Marmitex, marmitas fitness e pizzas.",
            location = "Alameda Dr. Octávio Pinheiro Brisolla, 7-71"
        ),
        Estabelecimento(
            id = 12,
            name = "Lalai Restaurante",
            keywords = mutableListOf("Restaurantes", "Brasileira", "Portuguesa") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Restaurante a lá carte com pratos contemporâneos e variados.",
            location = "Av. Nações Unidas, 26 - 19"
        ),
        Estabelecimento(
            id = 11,
            name = "Lalai Restaurante",
            keywords = mutableListOf("Restaurantes", "Churrasco", "Brasileira") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Restaurante a lá carte com pratos contemporâneos e variados.",
            location = "Av. Nações Unidas, 26 - 19"
        ),
        Estabelecimento(
            id = 10,
            name = "Casarão da Picanha",
            keywords = mutableListOf("Restaurantes", "Churrasco", "Brasileira") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Atradição, a qualidade, o atendimento e amizade que conquistamos ao longo de 17 anos na região de Jundiaí, nos deu experiência e competência para expandirmos esse sonho para um novo horizonte, E é com muita expectativa, humildade e perseverança que escolhemos Bauru.",
            location = "R. Henrique Savi, 11"
        ),
        Estabelecimento(
            id = 9,
            name = "Fried Fish Vilarejo",
            keywords = mutableListOf("Restaurantes", "Brasileira", "Frutos do Mar", "Nordestino") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Camarões, peixe frito e saladas, além de fritas e cervejas, em espaço informal com mesinhas e música ao vivo.",
            location = "R. José Ruíz Pelegrina, 7-55"
        ),
        Estabelecimento(
            id = 8,
            name = "La Parmigiana",
            keywords = mutableListOf("Restaurantes", "Italiana") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Viva a experiência da gastronomia italiana em Bauru.",
            location = "R. Prof. Antônio Réis Filho, 3-94"
        ),
        Estabelecimento(
            id = 7,
            name = "Alex Restaurante",
            keywords = mutableListOf("Restaurantes", "Caseira", "Brasileira") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "O Alex Restaurante une conceitos de qualidade e agilidade em seus serviços e está pronto para atender todos os clientes que buscam refeições saudáveis e balanceadas por preços justos.",
            location = "Avenida Affonso José Aiello 4-19"
        ),
        Estabelecimento(
            id = 6,
            name = "Tayu",
            keywords = mutableListOf("Restaurantes", "Japonesa", "Chinesa") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Tradição, respeito e dedicação à arte culinária. Cozinha tradicional asiática, hawaiana e brasileira.",
            location = "R. José Antonio Braga, 2-77"
        ),
        Estabelecimento(
            id = 5,
            name = "Skinão",
            keywords = mutableListOf("Restaurantes", "Hambúrguer") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Fundado em 1980, o Skinão serve porções, drinks e o mais famoso lanche Bauru da cidade.",
            location = "Av Octávio Pinheiro Brisola, 21-21"
        ),
        Estabelecimento(
            id = 4,
            name = "La Terrase",
            keywords = mutableListOf("Restaurantes", "Francesa") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "O La Terrasse é um bistrô de inspiração francesa, que a cada dia ganha destaque na cidade.\n" +
                    "Com uma decoração charmosa e aconchegante, conta com um serviço diferenciado, oferecendo a seus clientes uma experiência mais do que especial em cada detalhe.",
            location = "Praça Antônio Padilha Filho, 1-16"
        ),
        Estabelecimento(
            id = 3,
            name = "Sampa",
            keywords = mutableListOf("Vida Noturna", "Balada") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "Sampa é uma balada mas também um barzinho.",
            location = "R. Antônio Alves, 27-28"
        ),
        Estabelecimento(
            id = 2,
            name = "Parque Vitória Régia",
            keywords = mutableListOf("Turismo", "Parques") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "O Parque Vitória Régia é o mais famoso parque de Bauru.",
            location = "105, Av. Nações Unidas, 25-25"
        ),
        Estabelecimento(
            id = 1,
            name = "Ginásio Panela de Pressão",
            keywords = mutableListOf("Esporte", "Pago") ,
            image = R.drawable.guia_bauru_categoria_gastronomia,
            description = "O Ginásio Panela de Pressão é um ginásio de esportes.",
            location = "Rua Seu João, 21-21"
        )

    )
}