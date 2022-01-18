package com.gustavozreis.guiabauru.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.gustavozreis.guiabauru.adapters.CategoryAdapter
import com.gustavozreis.guiabauru.databinding.FragmentStartPageBinding

class CategoryFragment : Fragment() {

    // vinculação de visualização
    private var _binding: FragmentStartPageBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartPageBinding.inflate(inflater, container, false)
        recyclerView = binding.recyclerView
        recyclerView.adapter = CategoryAdapter(context)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}