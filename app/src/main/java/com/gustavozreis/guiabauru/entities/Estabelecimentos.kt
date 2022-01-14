package com.gustavozreis.guiabauru.entities

import androidx.annotation.DrawableRes

class Estabelecimentos (
    val name: String,
    val category: String,
    @DrawableRes val image: Int,
    val description: String,
    val localization: String
        ) {
}