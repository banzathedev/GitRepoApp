package com.proway.gitrepoapp.services

import com.proway.gitrepoapp.model.RepositoriesResponse
import retrofit2.Call
import retrofit2.http.GET

interface ServiceAllRepos {
    @GET("/repositories")
    fun getRepos() : Call<List<RepositoriesResponse>>

}