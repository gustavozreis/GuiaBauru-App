package com.gustavozreis.guiabauru.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gustavozreis.guiabauru.Data.CategoriesStartData
import com.gustavozreis.guiabauru.R
import com.gustavozreis.guiabauru.entities.Category

class StartPageAdapter(
    private val context: Context?
): RecyclerView.Adapter<StartPageAdapter.StartPageViewHolder> (){

    // inicializar uma lista das categorias
    val categoriesList = CategoriesStartData.categoriesList

    // inicializar ViewHolder
    class StartPageViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val categoryImage: ImageView = view!!.findViewById(R.id.place_image)
        val categoryName: TextView = view!!.findViewById(R.id.text_category)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StartPageAdapter.StartPageViewHolder {
        val adapterLayout: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_items, parent, false)
        return StartPageViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: StartPageAdapter.StartPageViewHolder, position: Int) {
        // pega o dado na posição atual na lista
        val categoryIndex = categoriesList[position]
        // seta a imagem do card da categoria
        holder.categoryImage.setImageResource(categoryIndex.categoryImg)
        // seta o nome da categoria
        holder.categoryName.text = categoryIndex.categoryType
    }

    override fun getItemCount(): Int = categoriesList.size

}


