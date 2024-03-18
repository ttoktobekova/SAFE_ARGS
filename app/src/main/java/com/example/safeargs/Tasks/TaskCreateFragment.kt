package com.example.safeargs.Tasks

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import com.example.safeargs.databinding.FragmentTaskCreateBinding

class TaskCreateFragment : Fragment() {
    private lateinit var binding: FragmentTaskCreateBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTaskCreateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSave.setOnClickListener {
            Log.e("ololol", "ol")
            val title = binding.editTextTitle.text.toString()
            setFragmentResult(
                requestKey = "ContactCreateFragmentResult",
                result = bundleOf(
                    title to title
                )
            )
        }
    }
}