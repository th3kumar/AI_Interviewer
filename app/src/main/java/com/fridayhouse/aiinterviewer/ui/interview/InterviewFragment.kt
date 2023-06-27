package com.fridayhouse.aiinterviewer.ui.interview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.fridayhouse.aiinterviewer.databinding.FragmentInterviewBinding

class InterviewFragment : Fragment() {

    private var _binding: FragmentInterviewBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val interviewViewModel =
            ViewModelProvider(this).get(InterviewViewModel::class.java)

        _binding = FragmentInterviewBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textInterview
        interviewViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}