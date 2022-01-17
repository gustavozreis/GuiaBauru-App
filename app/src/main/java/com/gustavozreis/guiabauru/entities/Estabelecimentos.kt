package com.gustavozreis.guiabauru.entities

import androidx.annotation.DrawableRes

class Estabelecimento(
    val id: Int,
    val name: String,
    val keywords: MutableList<String>,
    @DrawableRes val image: Int,
    val description: String,
    val localization: String
) {
}