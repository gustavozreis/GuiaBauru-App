package com.gustavozreis.guiabauru.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.gustavozreis.guiabauru.R
import com.gustavozreis.guiabauru.data.CategoriesStartData
import com.gustavozreis.guiabauru.pages.CategoryFragmentDirections

/*

Esse adaptador vai pegar as categorias que fazem parte do "CategoriesStarData"
e criar uma lista automática. Qualquer adição de uma nova categoria será
automáticamente adicionada a lista na criação do fragmento

*/

class CategoryAdapter(
    private val context: Context?
) : RecyclerView.Adapter<CategoryAdapter.StartPageViewHolder>() {

    // inicializar uma lista das categorias
    val categoriesList = CategoriesStartData.categoriesList

    // inicializar ViewHolder
    class StartPageViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val categoryImage: ImageView = view!!.findViewById(R.id.place_image)
        val categoryName: TextView = view!!.findViewById(R.id.text_category)
        val cardView: View = view!!.findViewById(R.id.list_cardview)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryAdapter.StartPageViewHolder {
        return StartPageViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.category_items, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CategoryAdapter.StartPageViewHolder, position: Int) {
        // pega o dado na posição atual na lista
        val categoryIndex = categoriesList[position]
        // seta a imagem do card da categoria
        holder.categoryImage.setImageResource(categoryIndex.categoryImg)
        // seta o nome da categoria
        holder.categoryName.text = categoryIndex.categoryType
        // setar mudança de fragmento ao clicar
        holder.cardView.setOnClickListener {
            val action =
                CategoryFragmentDirections.actionStartPageFragmentToCategoryFragment(holder.categoryName.text.toString())
            holder.cardView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int = categoriesList.size

}


