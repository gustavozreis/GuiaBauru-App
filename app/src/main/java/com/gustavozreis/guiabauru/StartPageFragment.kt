package com.gustavozreis.guiabauru

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gustavozreis.guiabauru.databinding.FragmentStartPageBinding

class StartPageFragment : Fragment() {

    // instancia do objeto corresponde ao fragment_start_page.xml
    private var _binding: FragmentStartPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartPageBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}