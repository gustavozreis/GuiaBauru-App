package com.gustavozreis.guiabauru.Data

import com.gustavozreis.guiabauru.R
import com.gustavozreis.guiabauru.entities.Category

object CategoriesStartData {
    val categoriesList: List<Category> = listOf(
        Category(
            R.drawable.guia_bauru_categoria_gastronomia,
            categoryType = "Gastronomia"
                ),
        Category(
            R.drawable.guia_bauru_categoria_gastronomia,
            categoryType = "Vida Noturna"
                ),
        Category(
            R.drawable.guia_bauru_categoria_gastronomia,
            categoryType = "Turismo"
                )

    )
}