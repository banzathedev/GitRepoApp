package com.proway.gitrepoapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.proway.gitrepoapp.R
import com.proway.gitrepoapp.databinding.ItemListBinding
import com.proway.gitrepoapp.model.RepositoriesResponse
import com.proway.gitrepoapp.singletons.SingletonRepoResponse

class AdapterRepositorios(val OnItemClick: (RepositoriesResponse) -> Unit) :
    RecyclerView.Adapter<RepositoriesViewHolder>() {
    private var listOfRepos = mutableListOf<RepositoriesResponse>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoriesViewHolder {
        LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false).apply {
            return RepositoriesViewHolder(this)
        }
    }

    override fun onBindViewHolder(holder: RepositoriesViewHolder, position: Int) {
        listOfRepos[position].apply {
            holder.bind(this)
            holder.itemView.setOnClickListener { OnItemClick(this) }
        }
    }

    fun refresh(mLista: List<RepositoriesResponse>) {
        listOfRepos.addAll(mLista)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = listOfRepos.size

}

class RepositoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var binding = ItemListBinding.bind(itemView)

    fun bind(repositories: RepositoriesResponse) {
        binding.textViewRepositoryName.text = " Repo Name: ${repositories.repoName}"
        binding.textViewRepositoryDescription.text = "Repo Desc: ${repositories.repoDescripition}"
        binding.textViewAuthorName.text = "Author: ${repositories.ownerInfo.login}"
        binding.textViewForks.text = "${repositories.forksCount}K"
        binding.textViewStars.text = "${repositories.starsCount}K"
        binding.imageViewAuthor.apply {
            Glide.with(this)
                .load(repositories.ownerInfo.avatarUrl)
                .placeholder(R.drawable.github_logo_white)
                .into(this)
        }
    }
}