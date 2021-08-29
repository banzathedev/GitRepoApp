package com.proway.gitrepoapp.services

import com.proway.gitrepoapp.model.ItemRepoList
import com.proway.gitrepoapp.model.RepositoriesResponse
import retrofit2.Call
import retrofit2.http.GET

interface ServiceAllRepos {
    @GET("search/repositories?q=language:Java&sort=fork&order=desc")
    fun getRepos(): Call<ItemRepoList>

}