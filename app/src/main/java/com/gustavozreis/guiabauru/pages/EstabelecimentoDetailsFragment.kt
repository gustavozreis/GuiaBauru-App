package com.gustavozreis.guiabauru.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gustavozreis.guiabauru.R
import com.gustavozreis.guiabauru.data.EstabelecimentosData
import com.gustavozreis.guiabauru.databinding.FragmentEstabelecimentoDetailBinding
import com.gustavozreis.guiabauru.entities.Estabelecimento

class EstabelecimentoDetailsFragment : Fragment() {

    // argumento 'id' passado pelo fragmento anterior
    private var id: String = ""

    // lista para filtrar estabelecimento por 'id'
    private val estabelecimentosList: List<Estabelecimento> =
        EstabelecimentosData.estabelecimentosList
    private var estabelecimentosFilteredById: MutableList<Estabelecimento> = mutableListOf()
    private fun getEstabelecimentoByID() {
        for (estabelecimento in estabelecimentosList) {
            if (estabelecimento.id.toString() == id) {
                estabelecimentosFilteredById.add(estabelecimento)
            }
        }
    }

    // vinculação de visualização
    private var _binding: FragmentEstabelecimentoDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            id = it.getString("id").toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEstabelecimentoDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        getEstabelecimentoByID()
        binding.image.setImageResource(R.drawable.guia_bauru_categoria_gastronomia)
        binding.name.text = estabelecimentosFilteredById[0].name
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}