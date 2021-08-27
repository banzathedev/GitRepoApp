package com.proway.gitrepoapp.model

import com.google.gson.annotations.SerializedName

data class LanguagesResponse(
    @SerializedName("name")
    val name: String,
    @SerializedName("id")
    val id: Int,
)
