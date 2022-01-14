package com.gustavozreis.guiabauru.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.gustavozreis.guiabauru.Data.CategoriesStart
import com.gustavozreis.guiabauru.Data.CategoriesStartData
import com.gustavozreis.guiabauru.entities.Category

class StartPageAdapter(
    private val context: Context?
): RecyclerView.Adapter<StartPageAdapter.StartPageViewHolder> {

    // inicializar uma lista das categorias
    val categoriesList = CategoriesStartData.categoriesList

    // inicializar ViewHolder
    class StartPageViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val categoryImage: ImageView
        val categoryName: String
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StartPageAdapter.StartPageViewHolder {
        val adapterLayout: View
    }

    override fun onBindViewHolder(holder: StartPageAdapter.StartPageViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}