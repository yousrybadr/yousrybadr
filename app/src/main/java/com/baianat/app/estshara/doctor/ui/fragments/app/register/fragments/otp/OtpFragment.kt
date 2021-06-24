package com.baianat.app.estshara.doctor.ui.fragments.app.register.fragments.otp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baianat.app.estshara.doctor.R

class OtpFragment : Fragment() {

    companion object {
        fun newInstance() = OtpFragment()
    }

    private lateinit var viewModel: OtpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.otp_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(OtpViewModel::class.java)
        // TODO: Use the ViewModel
    }

}