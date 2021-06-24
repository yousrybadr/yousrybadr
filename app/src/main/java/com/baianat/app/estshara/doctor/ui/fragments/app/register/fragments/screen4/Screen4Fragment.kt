package com.baianat.app.estshara.doctor.ui.fragments.app.register.fragments.screen4

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baianat.app.estshara.doctor.R

class Screen4Fragment : Fragment() {

    companion object {
        fun newInstance() = Screen4Fragment()
    }

    private lateinit var viewModel: Screen4ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen4, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Screen4ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}