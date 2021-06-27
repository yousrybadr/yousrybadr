package com.baianat.app.estshara.doctor.ui.fragments.register.fragments.finish

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import com.baianat.app.estshara.doctor.databinding.FragmentFinishBinding
import com.baianat.app.estshara.doctor.ui.activities.LoginActivity
import com.baianat.app.estshara.doctor.utils.ActivityCreatedObserver

class FinishFragment : Fragment() {

    // This property is only valid between onCreateView and
    // onDestroyView.
    private var _binding: FragmentFinishBinding? = null
    private val binding get() = _binding!!

    private lateinit var navController : NavController
    private lateinit var viewModel: FinishViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(FinishViewModel::class.java)
        _binding = FragmentFinishBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // TODO: Use the ViewModel
        requireActivity().lifecycle.addObserver(ActivityCreatedObserver {
            (activity as LoginActivity).apply {
                setTitle("Login")
            }
        })
    }
}