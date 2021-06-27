package com.baianat.app.estshara.doctor.ui.fragments.register.fragments.otp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.baianat.app.estshara.doctor.databinding.FragmentOtpBinding
import com.baianat.app.estshara.doctor.ui.activities.LoginActivity
import com.baianat.app.estshara.doctor.ui.viewmodels.SharedRegisterViewModel
import com.baianat.app.estshara.doctor.utils.ActivityCreatedObserver

class OtpFragment : Fragment() {

    // This property is only valid between onCreateView and
    // onDestroyView.
    private var _binding: FragmentOtpBinding? = null
    private val binding get() = _binding!!

    private lateinit var navController : NavController
    private lateinit var viewModel: SharedRegisterViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(SharedRegisterViewModel::class.java)
        _binding = FragmentOtpBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //  Use the ViewModel
        requireActivity().lifecycle.addObserver(ActivityCreatedObserver {
            (activity as LoginActivity).apply {
                setTitle("")
                hideToolBar()
            }
        })
        //(activity as LoginActivity).hideToolBar()
        navController = Navigation.findNavController(view)
        viewModel.item.observe(requireActivity(), Observer {
            it.password = "454545"
        })
        binding.viewmodel = viewModel


        binding.firstPinView.doAfterTextChanged {
            if(it?.length == 6){
                Navigation.findNavController(view).navigate(OtpFragmentDirections.actionFragmentOtpToFragmentScreen1())
                it.clear()
            }
        }
        binding.lifecycleOwner= viewLifecycleOwner

        binding.backButton.setOnClickListener{
            navController.navigateUp()
        }


    }
    companion object {
        fun newInstance() = OtpFragment()
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as LoginActivity).setTitle("Login")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}