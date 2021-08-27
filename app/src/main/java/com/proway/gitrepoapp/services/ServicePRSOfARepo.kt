package com.proway.gitrepoapp.services

import com.proway.gitrepoapp.model.RepoPullRequestResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServicePRSOfARepo {
    @GET("/repos/{userP}/{repoName}/pulls")
    fun getPRS(
        @Path("userP") user: String,
        @Path("repoName") repoName: String
    ): Call<List<RepoPullRequestResponse >>
}