package com.proway.gitrepoapp.repository


import com.proway.gitrepoapp.BuildConfig
import com.proway.gitrepoapp.model.LanguagesResponse
import com.proway.gitrepoapp.model.RepoPullRequestResponse
import com.proway.gitrepoapp.model.RepositoriesResponse
import com.proway.gitrepoapp.services.*
import com.proway.gitrepoapp.singletons.SingletonRepoPrs
import com.proway.gitrepoapp.singletons.SingletonRepoResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ReposRepository {

    fun getAllReposAndLangs(callback: (Boolean) -> Unit) {
        RetrofitBuilder.getInstance(BuildConfig.GITHUB_API_URL).create(ServiceAllRepos::class.java)
            .getRepos().clone().enqueue(object : Callback<List<RepositoriesResponse>> {
                override fun onResponse(
                    call: Call<List<RepositoriesResponse>>,
                    response: Response<List<RepositoriesResponse>>
                ) {
                    response.body().let { resp ->
                        if (resp != null) {
                            SingletonRepoResponse.resp = resp
                            callback(true)

                        } else {
                            getAllReposAndLangs() {

                            }
                        }

                    }
                }

                override fun onFailure(call: Call<List<RepositoriesResponse>>, t: Throwable) {
                    println(t.message)
                }


            })
        RetrofitBuilder.getInstance(BuildConfig.GITHUB_LANGS_URL).create(Langs::class.java)
            .getLangs().clone().enqueue(object : Callback<List<LanguagesResponse>> {
                override fun onResponse(
                    call: Call<List<LanguagesResponse>>,
                    response: Response<List<LanguagesResponse>>
                ) {

                }

                override fun onFailure(call: Call<List<LanguagesResponse>>, t: Throwable) {

                }

            })
    }

    fun getPrsOfARepo(user: String, repoName: String, callback: (Boolean) -> Unit) {
        val api = RetrofitBuilder.getInstance(BuildConfig.GITHUB_API_URL)
            .create(ServicePRSOfARepo::class.java)
        api.getPRS(user, repoName).clone()
            .enqueue(object : Callback<List<RepoPullRequestResponse>> {
                override fun onResponse(
                    call: Call<List<RepoPullRequestResponse>>,
                    response: Response<List<RepoPullRequestResponse>>
                ) {
                        if (response.body() != null){
                            SingletonRepoPrs.resp = response.body()
                            callback(true)
                        }
                }

                override fun onFailure(call: Call<List<RepoPullRequestResponse>>, t: Throwable) {
                }

            })
    }


    fun getReposBylang(lang: String) {
        val api = RetrofitBuilder.getInstance(BuildConfig.GITHUB_API_URL)
            .create(ServiceRepoByLanguage::class.java)
        api.getByLang(lang).clone().enqueue(object : Callback<List<RepositoriesResponse>> {
            override fun onFailure(call: Call<List<RepositoriesResponse>>, t: Throwable) {

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