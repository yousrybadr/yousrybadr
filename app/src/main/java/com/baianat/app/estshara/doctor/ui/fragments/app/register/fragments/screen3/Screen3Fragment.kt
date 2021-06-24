package com.baianat.app.estshara.doctor.ui.fragments.app.register.fragments.screen3

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baianat.app.estshara.doctor.R

class Screen3Fragment : Fragment() {

    companion object {
        fun newInstance() = Screen3Fragment()
    }

    private lateinit var viewModel: Screen3ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen3, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Screen3ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}