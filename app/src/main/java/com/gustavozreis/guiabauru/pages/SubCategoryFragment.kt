package com.gustavozreis.guiabauru.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.gustavozreis.guiabauru.adapters.SubCategoryAdapter
import com.gustavozreis.guiabauru.databinding.FragmentCategoryBinding

class SubCategoryFragment : Fragment() {

    // argumento vindo do fragmento das categorias
    private var category: String = ""

    // vinculação de visualização
    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            category = it.getString("category").toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        recyclerView.adapter = SubCategoryAdapter(category, requireContext())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}