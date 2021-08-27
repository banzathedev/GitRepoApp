package com.proway.gitrepoapp.repository


import com.proway.gitrepoapp.BuildConfig
import com.proway.gitrepoapp.model.LanguagesResponse
import com.proway.gitrepoapp.model.RepoPullRequestResponse
import com.proway.gitrepoapp.model.RepositoriesResponse
import com.proway.gitrepoapp.services.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ReposRepository {

    fun getAllReposAndLangs() {
        RetrofitBuilder.getInstance(BuildConfig.GITHUB_API_URL).create(ServiceAllRepos::class.java)
            .getRepos().clone().enqueue(object: Callback<List<RepositoriesResponse>>  {
                override fun onResponse(
                    call: Call<List<RepositoriesResponse>>,
                    response: Response<List<RepositoriesResponse>>
                ) {
                    response.body().apply {

                    }
                }

                override fun onFailure(call: Call<List<RepositoriesResponse>>, t: Throwable) {
                    //n quero fazer nada aqui fÉ
                }


            } )
        RetrofitBuilder.getInstance(BuildConfig.GITHUB_LANGS_URL).create(Langs::class.java)
            .getLangs().clone().enqueue(object: Callback<List<LanguagesResponse>>{
                override fun onResponse(
                    call: Call<List<LanguagesResponse>>,
                    response: Response<List<LanguagesResponse>>
                ) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<List<LanguagesResponse>>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
    }

    fun getPrsOfARepo(user: String, repoName: String) {
        val api = RetrofitBuilder.getInstance(BuildConfig.GITHUB_API_URL)
            .create(ServicePRSOfARepo::class.java)
        api.getPRS(user, repoName).clone().enqueue(object: Callback<List<RepoPullRequestResponse>>{
            override fun onResponse(
                call: Call<List<RepoPullRequestResponse>>,
                response: Response<List<RepoPullRequestResponse>>
            ) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<List<RepoPullRequestResponse>>, t: Throwable) {
                TODO("Not yet implemented")
            }


        })
    }

    fun getReposBylang(lang: String) {
        val api = RetrofitBuilder.getInstance(BuildConfig.GITHUB_API_URL)
            .create(ServiceRepoByLanguage::class.java)
       api.getByLang(lang).clone().enqueue(object : Callback<List<RepositoriesResponse>>{
           override fun onFailure(call: Call<List<RepositoriesResponse>>, t: Throwable) {
               TODO("Not yet implemented")
           }

           override fun onResponse(
               call: Call<List<RepositoriesResponse>>,
               response: Response<List<RepositoriesResponse>>
           ) {
              // nunca que falha
           }
       })
    }

}