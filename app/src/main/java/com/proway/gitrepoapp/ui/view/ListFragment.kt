package com.proway.gitrepoapp.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.proway.gitrepoapp.R
import com.proway.gitrepoapp.ViewModel.ListViewModel
import com.proway.gitrepoapp.adapter.AdapterRepositorios
import com.proway.gitrepoapp.databinding.ListFragmentBinding
import com.proway.gitrepoapp.singletons.SingletonRepoResponse
import com.proway.gitrepoapp.utils.replaceView

class ListFragment : Fragment(R.layout.list_fragment) {

    companion object {
        fun newInstance() = ListFragment()
    }

    private lateinit var viewModel: ListViewModel
    private lateinit var recycler: RecyclerView
    private var adapter = AdapterRepositorios() { rr ->
        viewModel.callGetRepoPrs(rr.ownerInfo.login, rr.repoName)
    }
    private lateinit var binding: ListFragmentBinding
    private var observerResp = Observer<Boolean> {
        requireActivity().replaceView(DetailsFragment())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ListFragmentBinding.bind(view)
        viewModel = ViewModelProvider(this).get(ListViewModel::class.java)
        viewModel.changes.observe(viewLifecycleOwner, observerResp)
        recycler = binding.recyclerViewNoXml
        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = adapter
        SingletonRepoResponse.resp?.let { adapter.refresh(it) }
    }


}