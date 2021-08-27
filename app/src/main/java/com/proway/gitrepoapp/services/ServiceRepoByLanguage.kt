package com.proway.gitrepoapp.services

import com.proway.gitrepoapp.model.RepositoriesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceRepoByLanguage {
    @GET("search/repositories?q=language:{lg}&sort=stars&page=1`")
    fun getByLang(@Path("lg") lang: String): Call<List<RepositoriesResponse>>
}