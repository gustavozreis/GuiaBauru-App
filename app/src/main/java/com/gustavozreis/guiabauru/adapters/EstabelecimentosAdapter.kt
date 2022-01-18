package com.gustavozreis.guiabauru.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.gustavozreis.guiabauru.R
import com.gustavozreis.guiabauru.data.EstabelecimentosData
import com.gustavozreis.guiabauru.entities.Estabelecimento
import com.gustavozreis.guiabauru.pages.EstabelecimentosListFragmentDirections
import com.gustavozreis.guiabauru.pages.SubCategoryFragmentDirections

/*

Esse adaptador lista os estabelecimentos que tem a keyword escolhida
dentro as subcategorias do fragmento [SubCategoryFragment]

*/

class EstabelecimentosAdapter(
    private val subCategory: String,
    private val context: Context?
) : RecyclerView.Adapter<EstabelecimentosAdapter.EstabelecimentosViewHolder>() {

    // instancia listas a partir da keyword da lista de estabelecimentos
    private var estabelecimentoList: List<Estabelecimento> =
        EstabelecimentosData.estabelecimentosList
    private var estabCategoriaList: MutableList<Estabelecimento> = mutableListOf()

    // função que cria a lista de estabelecimentos seguindo a subcategoria escolhida
    private fun createList() {
        for (estabelecimento in estabelecimentoList) {
            if (estabelecimento.keywords.contains(subCategory))
                estabCategoriaList.add(estabelecimento)
        }

    }

    init {
        createList()
    }

    // inicializar ViewHolder
    class EstabelecimentosViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val image: ImageView = view!!.findViewById(R.id.image)
        val name: TextView = view!!.findViewById(R.id.name)
        val cardView: CardView = view!!.findViewById(R.id.estabelecimento_cardview)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EstabelecimentosAdapter.EstabelecimentosViewHolder {
        return EstabelecimentosAdapter.EstabelecimentosViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.estabelecimento_list, parent, false)
        )
    }

    override fun onBindViewHolder(
        holder: EstabelecimentosAdapter.EstabelecimentosViewHolder,
        position: Int
    ) {
        // pega o dado na posição atual na lista
        val estabelecimentoIndex = estabCategoriaList[position]
        // seta a imagem do card do estabelecimento
        holder.image.setImageResource(estabelecimentoIndex.image)
        // seta o nome da subcategoria
        holder.name.text = estabelecimentoIndex.name
        // setar mudança de fragmento ao clicar
        holder.cardView.setOnClickListener {
            val action =
                EstabelecimentosListFragmentDirections.actionEstabelecimentosFragmentToEstabelecimentoDetaisFragment(
                    estabelecimentoIndex.id.toString()
                )
            holder.cardView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int = estabCategoriaList.size


}