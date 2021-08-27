package com.proway.gitrepoapp.services

import com.proway.gitrepoapp.model.RepositoriesResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private val retrofitBase = Retrofit.Builder()
        .baseUrl("https://api.github.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getServiceAllRepositories(): ServiceAllRepos{
        return retrofitBase.create(ServiceAllRepos::class.java)
    }

    // TODO make services.
}

//    fun getServiceCarInstance() : ServiceCar {
//        return retrofitCar.create(ServiceCar::class.java)
//    }
//    fun getUserAuth(): ServiceUser {
//        return retrofitUser.create((ServiceUser::class.java))
//    }
//    fun postUserAuth(): ServiceAUTH {
//        return retrofitUser.create((ServiceAUTH::class.java))
//    }
//}