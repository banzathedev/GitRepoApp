package com.proway.gitrepoapp.services

import com.proway.gitrepoapp.model.RepositoriesResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {


   fun getInstance(path: String): Retrofit {
       return Retrofit.Builder().baseUrl(path)
           .addConverterFactory(GsonConverterFactory.create())
           .build()

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