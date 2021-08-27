package com.proway.gitrepoapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.proway.gitrepoapp.R
import com.proway.gitrepoapp.databinding.ItemListBinding
import com.proway.gitrepoapp.model.RepositoriesResponse
import com.proway.gitrepoapp.singletons.SingletonRepoResponse

class AdapterRepositorios(val OnItemClick: (RepositoriesResponse) -> Unit ) : RecyclerView.Adapter<RepositoriesViewHolder>() {
    private var listOfRepos = mutableListOf<RepositoriesResponse>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoriesViewHolder {
        LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false).apply {
            return RepositoriesViewHolder(this)
        }
    }

    override fun onBindViewHolder(holder: RepositoriesViewHolder, position: Int) {
        listOfRepos[position].apply {
            holder.bind(this)
        }
    }

    override fun getItemCount(): Int = listOfRepos.size

}

class RepositoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
    private  var binding = ItemListBinding.bind(itemView)

    fun bind(repositories: RepositoriesResponse){
        binding.textViewRepoName.text = repositories.fullName
    }
}