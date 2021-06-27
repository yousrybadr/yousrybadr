package com.baianat.app.estshara.doctor.ui.fragments.drawer.reportproblem

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baianat.app.estshara.doctor.R

class ReportProblemFragment : Fragment() {

    companion object {
        fun newInstance() = ReportProblemFragment()
    }

    private lateinit var viewModel: ReportProblemViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_report_problem, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ReportProblemViewModel::class.java)
        // TODO: Use the ViewModel
    }

}