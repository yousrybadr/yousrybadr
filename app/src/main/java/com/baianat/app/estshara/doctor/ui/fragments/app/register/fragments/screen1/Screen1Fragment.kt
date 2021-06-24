package com.baianat.app.estshara.doctor.ui.fragments.app.register.fragments.screen1

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baianat.app.estshara.doctor.R

class Screen1Fragment : Fragment() {

    companion object {
        fun newInstance() = Screen1Fragment()
    }

    private lateinit var viewModel: Screen1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Screen1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}