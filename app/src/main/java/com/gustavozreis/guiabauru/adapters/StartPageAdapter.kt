package com.gustavozreis.guiabauru.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.gustavozreis.guiabauru.R
import com.gustavozreis.guiabauru.data.CategoriesStartData
import androidx.navigation.fragment.findNavController
import com.gustavozreis.guiabauru.MainActivity
import com.gustavozreis.guiabauru.pages.StartPageFragment
import com.gustavozreis.guiabauru.pages.StartPageFragmentDirections

class StartPageAdapter(
    private val context: Context?
): RecyclerView.Adapter<StartPageAdapter.StartPageViewHolder> (){

    // inicializar uma lista das categorias
    val categoriesList = CategoriesStartData.categoriesList

    // inicializar ViewHolder maneira antiga
    class StartPageViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val categoryImage: ImageView = view!!.findViewById(R.id.place_image)
        val categoryName: TextView = view!!.findViewById(R.id.text_category)
        val cardView: View = view!!.findViewById(R.id.list_cardview)
    }
    /*class StartPageViewHolder(var binding: CategoryItemsBinding): RecyclerView.ViewHolder(binding.root) {
        val categoryImage: ImageView = binding.placeImage
        val categoryName: TextView = binding.textCategory
    }*/

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StartPageAdapter.StartPageViewHolder {
        return StartPageViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.category_items, parent, false))
    }

    override fun onBindViewHolder(holder: StartPageAdapter.StartPageViewHolder, position: Int) {
        // pega o dado na posição atual na lista
        val categoryIndex = categoriesList[position]
        // seta a imagem do card da categoria
        holder.categoryImage.setImageResource(categoryIndex.categoryImg)
        // seta o nome da categoria
        holder.categoryName.text = categoryIndex.categoryType
        // setar mudança de fragmento ao clicar
        holder.cardView.setOnClickListener {
            val action = StartPageFragmentDirections.actionStartPageFragmentToCategoryFragment(holder.categoryName.text.toString())
            holder.cardView.findNavController().navigate(action)
            //holder.cardView.findNavController().navigate(R.id.action_startPageFragment_to_categoryFragment(category = "oi"))
        }
    }

    override fun getItemCount(): Int = categoriesList.size

}


