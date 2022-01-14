package com.gustavozreis.guiabauru.data

import com.gustavozreis.guiabauru.R
import com.gustavozreis.guiabauru.entities.Category

object CategoriesStartData {
    val categoriesList: List<Category> = listOf(
        Category(
            categoryImg = R.drawable.guia_bauru_categoria_gastronomia,
            categoryType = "Gastronomia"
                ),
        Category(
            categoryImg = R.drawable.guia_bauru_categoria_gastronomia,
            categoryType = "Vida Noturna"
                ),
        Category(
            categoryImg = R.drawable.guia_bauru_categoria_gastronomia,
            categoryType = "Turismo"
            ),
        Category(
            categoryImg = R.drawable.guia_bauru_categoria_gastronomia,
            categoryType = "Esportes"
        )

    )
}