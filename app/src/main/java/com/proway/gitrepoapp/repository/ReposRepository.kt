package com.proway.gitrepoapp.repository


import com.proway.gitrepoapp.BuildConfig
import com.proway.gitrepoapp.services.RetrofitBuilder

class ReposRepository {
    fun getAllRepos(){
        RetrofitBuilder.getInstance(BuildConfig.GITHUB_API_URL)


    }
}