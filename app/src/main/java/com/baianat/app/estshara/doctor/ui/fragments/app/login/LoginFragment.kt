package com.baianat.app.estshara.doctor.ui.fragments.app.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.baianat.app.estshara.doctor.R
import com.baianat.app.estshara.doctor.databinding.LoginFragmentBinding
import com.baianat.app.estshara.doctor.ui.activities.LoginActivity

class LoginFragment : Fragment() {
    private var _binding: LoginFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = LoginFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }
    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.registerButton.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_content_login)
                .navigate(R.id.action_login_to_register)
        }
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        // TODO: Use the ViewModel
        (activity as LoginActivity).setTitle("Login")

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}