package com.proway.gitrepoapp.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.proway.gitrepoapp.R
import com.proway.gitrepoapp.ViewModel.SplashViewModel
import com.proway.gitrepoapp.repository.ReposRepository
import com.proway.gitrepoapp.utils.replaceView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SplashFragment : Fragment(R.layout.splash_fragment) {

    companion object {
        fun newInstance() = SplashFragment()
    }

    private lateinit var viewModel: SplashViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
        viewModel.LoadModels()
        viewModel.changes.observe(viewLifecycleOwner, observerResponse)
    }

    private var observerResponse = Observer<Boolean> {
        requireActivity().replaceView(ListFragment())
    }


}