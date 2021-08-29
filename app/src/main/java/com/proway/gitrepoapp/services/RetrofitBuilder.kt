package com.proway.gitrepoapp.services


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {


   fun getInstance(path: String): Retrofit {
       return Retrofit.Builder().baseUrl(path)
           .addConverterFactory(GsonConverterFactory.create())
           .build()

   }


}
