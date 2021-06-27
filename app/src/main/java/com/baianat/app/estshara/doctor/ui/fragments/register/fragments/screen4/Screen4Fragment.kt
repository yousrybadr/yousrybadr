package com.baianat.app.estshara.doctor.ui.fragments.register.fragments.screen4

import android.content.SharedPreferences
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.baianat.app.estshara.doctor.databinding.FragmentScreen4Binding
import com.baianat.app.estshara.doctor.ui.EventObserver
import com.baianat.app.estshara.doctor.ui.activities.LoginActivity
import com.baianat.app.estshara.doctor.ui.viewmodels.SharedRegisterViewModel
import com.baianat.app.estshara.doctor.utils.ActivityCreatedObserver

class Screen4Fragment : Fragment() {

    private var _binding: FragmentScreen4Binding? = null
    private val binding get() = _binding!!

    private lateinit var navController: NavController
    private lateinit var viewModel: SharedRegisterViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(SharedRegisterViewModel::class.java)
        _binding = FragmentScreen4Binding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().lifecycle.addObserver(ActivityCreatedObserver {
            (activity as LoginActivity).apply {
                setTitle("4 / 4")
                showToolBar()

            }
        })
        navController = Navigation.findNavController(view)
        binding.viewmodel = viewModel
        viewModel.navigateScreen.observe(requireActivity(), EventObserver {
            navController.navigate(it as Int)
        })
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}