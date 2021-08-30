package com.proway.gitrepoapp.services

import com.proway.gitrepoapp.model.ItemRepoList
import com.proway.gitrepoapp.model.RepositoriesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceRepoByLanguage {
    @GET("search/repositories?q={lang}&sort=fork&order=desc")
    fun getByLang(@Path("lang") lang: String): Call<ItemRepoList>
}