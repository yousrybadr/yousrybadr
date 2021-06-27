package com.baianat.app.estshara.doctor.ui.fragments.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.baianat.app.estshara.doctor.databinding.FragmentLoginBinding
import com.baianat.app.estshara.doctor.ui.EventObserver
import com.baianat.app.estshara.doctor.ui.activities.LoginActivity
import com.baianat.app.estshara.doctor.utils.ActivityCreatedObserver

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var viewModel: LoginViewModel

    private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        return binding.root

    }
    companion object {
        fun newInstance() = LoginFragment()
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewmodel = viewModel
        navController = Navigation.findNavController(view)
        viewModel.navigateScreen.observe(requireActivity(), EventObserver{
            navController.navigate(it as Int)
        })
        requireActivity().lifecycle.addObserver(ActivityCreatedObserver {
            (activity as LoginActivity).apply {
                setTitle("Login")
            }
        })
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}


