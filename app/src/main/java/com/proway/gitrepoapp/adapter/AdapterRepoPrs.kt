package com.proway.gitrepoapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.proway.gitrepoapp.R
import com.proway.gitrepoapp.databinding.ItemListBinding
import com.proway.gitrepoapp.model.RepoPullRequestResponse
import com.proway.gitrepoapp.model.RepositoriesResponse

class AdapterRepoPrs(val OnItemClick: (RepoPullRequestResponse) -> Unit ) : RecyclerView.Adapter<RepositoriesPrsViewHolder>() {
    private var listOfReposPrs = mutableListOf<RepoPullRequestResponse>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoriesPrsViewHolder {
        LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false).apply {
            return RepositoriesPrsViewHolder(this)
        }
    }

    override fun onBindViewHolder(holder: RepositoriesPrsViewHolder, position: Int) {
        listOfReposPrs[position].apply {
            holder.bind(this)
            holder.itemView.setOnClickListener { OnItemClick(this) }
        }
    }

    fun refresh(newList: List<RepoPullRequestResponse>){
        listOfReposPrs.addAll(newList)
        notifyDataSetChanged()
    }
    override fun getItemCount(): Int = listOfReposPrs.size

}

class RepositoriesPrsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
    private  var binding = ItemListBinding.bind(itemView)

    fun bind(repositoriesPrs: RepoPullRequestResponse){
       // binding.textViewRepoName.text = "Nome do PR: ${repositoriesPrs.titleOfThePr}"
       // binding.textRepoAlgo.text = repositoriesPrs.userOfThePr.loginOfUserOfPr
    }
}