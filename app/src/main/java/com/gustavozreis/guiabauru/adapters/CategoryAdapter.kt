package com.gustavozreis.guiabauru.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.gustavozreis.guiabauru.data.EstabelecimentosData
import com.gustavozreis.guiabauru.entities.Estabelecimento

class CategoryAdapter {

    // instancia listas a partir dos dados dos estabelecimentos
    private var estabelecimentosList: List<Estabelecimento> = EstabelecimentosData.estabelecimentosList
    private var gastronomiaList: MutableList<Estabelecimento> =  mutableListOf()

    // função que filtra a lista de estabelecimentos pela palavra chave "Gastronomia"
    private fun createList() {
        for (estabelecimento in estabelecimentosList) {
            if (estabelecimento.keywords.contains("Gastronomia"))
                gastronomiaList.add(estabelecimento)
        }
    }

    init {
        createList()
    }

    // inicializar ViewHolder
    class GastronomiaAdapter(view: View) : RecyclerView.ViewHolder(view) {
        // criar fragmento Gastronomia antes de finalizar o adaptador aqui
    }


}