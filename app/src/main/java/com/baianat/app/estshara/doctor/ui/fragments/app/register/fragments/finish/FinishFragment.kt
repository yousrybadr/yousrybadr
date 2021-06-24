package com.baianat.app.estshara.doctor.ui.fragments.app.register.fragments.finish

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baianat.app.estshara.doctor.R

class FinishFragment : Fragment() {

    companion object {
        fun newInstance() = FinishFragment()
    }

    private lateinit var viewModel: FinishViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_finish, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FinishViewModel::class.java)
        // TODO: Use the ViewModel
    }

}