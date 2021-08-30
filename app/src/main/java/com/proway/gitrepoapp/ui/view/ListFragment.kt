package com.proway.gitrepoapp.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.proway.gitrepoapp.R
import com.proway.gitrepoapp.ViewModel.ListViewModel
import com.proway.gitrepoapp.adapter.AdapterRepositorios
import com.proway.gitrepoapp.databinding.ListFragmentBinding
import com.proway.gitrepoapp.model.LanguagesResponse
import com.proway.gitrepoapp.singletons.SingletonLangs
import com.proway.gitrepoapp.singletons.SingletonRepoResponse
import com.proway.gitrepoapp.utils.replaceView

class ListFragment : Fragment(R.layout.list_fragment) {

    companion object {
        fun newInstance() = ListFragment()
    }

    private lateinit var viewModel: ListViewModel
    private lateinit var recycler: RecyclerView
    private lateinit var selectedLang: LanguagesResponse
    private var adapter = AdapterRepositorios() { rr ->
        viewModel.callGetRepoPrs(rr.ownerInfo.login, rr.repoName)
    }
    private lateinit var binding: ListFragmentBinding
    private var observerResp = Observer<Boolean> {
        if (it == true) {
            requireActivity().replaceView(DetailsFragment())
        } else {
            Snackbar.make(
                requireView(),
                "Ah.. parece que esse reposiotorio nao teve pull requests.",
                Snackbar.LENGTH_LONG
            ).show()
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ListFragmentBinding.bind(view)
        viewModel = ViewModelProvider(this).get(ListViewModel::class.java)
        viewModel.changes.observe(viewLifecycleOwner, observerResp)
        recycler = binding.recyclerViewNoXml
        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = adapter
        createDropCategories(SingletonLangs.resp)
        SingletonRepoResponse.resp?.let { adapter.refresh(it) }
    }

    private fun createDropCategories(lang: List<LanguagesResponse>?) {
        lang?.toMutableList()?.let { lang ->
            val adapter = ArrayAdapter(
                requireContext(),
                android.R.layout.simple_dropdown_item_1line, lang
            )
            binding.spinnerIdXML.adapter = adapter

            binding.spinnerIdXML.onItemSelectedListener =
                object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                        selectedLang = p0?.getItemAtPosition(p2) as LanguagesResponse
                        // TODO call a method to get a new list by langs.
                    }

                    override fun onNothingSelected(p0: AdapterView<*>?) {
                       Snackbar.make(requireView(), "Ops parece que ocorreu um erro.", Snackbar.LENGTH_LONG).show()
                    }

                }
        }



    }
}