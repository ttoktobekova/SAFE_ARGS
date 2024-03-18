package com.example.safeargs.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import com.example.safeargs.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private var title: String? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.btnCreate.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.actionNavHomeToTaskCreateFragment2()

            )
        }


        binding.btnOpen.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.actionNavHomeToTaskFragment(
                    title.toString()
                )
            )
        }
        setFragmentResultListener(requestKey = "ContactCreateFragmentResult") { key, result ->
            title = result.getString("title")



        }
    }

    companion object {
        val REQUEST_KEY = "request_key"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}