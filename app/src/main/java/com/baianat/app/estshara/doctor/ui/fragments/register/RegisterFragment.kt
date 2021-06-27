package com.baianat.app.estshara.doctor.ui.fragments.register

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.baianat.app.estshara.doctor.databinding.FragmentRegisterBinding
import com.baianat.app.estshara.doctor.ui.EventObserver
import com.baianat.app.estshara.doctor.ui.activities.LoginActivity
import com.baianat.app.estshara.doctor.ui.viewmodels.SharedRegisterViewModel

class RegisterFragment : Fragment() {
    private var _binding: FragmentRegisterBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var viewModel: SharedRegisterViewModel
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(SharedRegisterViewModel::class.java)

        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // use viewModel Here

        (activity as LoginActivity).setTitle("SignUp")
        (activity as LoginActivity).showToolBar()
        binding.viewmodel = viewModel
        navController = Navigation.findNavController(view)
        viewModel.navigateScreen.observe(requireActivity(), EventObserver{
            navController.navigate(it as Int)
        })

        binding.phoneET.apply {
            doAfterTextChanged {
                viewModel.setPhone(it.toString())
            }
        }

    }


}