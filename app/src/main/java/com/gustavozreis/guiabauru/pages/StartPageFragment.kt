package com.gustavozreis.guiabauru.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.gustavozreis.guiabauru.adapters.StartPageAdapter
import com.gustavozreis.guiabauru.databinding.FragmentStartPageBinding

class StartPageFragment : Fragment() {

    // instancia do objeto corresponde ao fragment_start_page.xml
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
        recyclerView.adapter = StartPageAdapter(context)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}