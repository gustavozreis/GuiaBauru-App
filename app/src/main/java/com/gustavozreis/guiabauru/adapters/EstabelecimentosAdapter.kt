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

class EstabelecimentosAdapter(
    private val category: String,
    private val context: Context?
) : RecyclerView.Adapter<EstabelecimentosAdapter.EstabelecimentosViewHolder>() {

    // instancia listas a partir dos dados dos estabelecimentos
    private var estabelecimentoList: List<Estabelecimento> =
        EstabelecimentosData.estabelecimentosList
    private var categoriaList: MutableList<Estabelecimento> = mutableListOf()

    // função que filtra a lista de estabelecimentos pelas keywords
    private fun createList() {
        for (estabelecimento in estabelecimentoList) {
            if (estabelecimento.keywords.contains(category))
                categoriaList.add(estabelecimento)
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
                .inflate(R.layout.estabelecimento_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: EstabelecimentosAdapter.EstabelecimentosViewHolder, position: Int) {
        // pega o dado na posição atual na lista
        val estabelecimentoIndex = categoriaList[position]
        // seta a imagem do card do estabelecimento
        holder.image.setImageResource(estabelecimentoIndex.image)
        // seta o nome do estabelecimento
        holder.name.text = estabelecimentoIndex.name
        // setar mudança de fragmento ao clicar
        holder.cardView.setOnClickListener {
            holder.cardView.findNavController()
                .navigate(R.id.action_categoryFragment_to_estabelecimentosFragment)
        }
    }

    override fun getItemCount(): Int = categoriaList.size


}