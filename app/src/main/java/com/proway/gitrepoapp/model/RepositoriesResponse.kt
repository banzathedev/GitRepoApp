package com.proway.gitrepoapp.model

import com.google.gson.annotations.SerializedName

data class ItemRepoList(
    @SerializedName("items")
    val repolist: List<RepositoriesResponse>
)

data class RepositoriesResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val repoName: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("private")
    val privaceType: Boolean,
    @SerializedName("owner")
    val ownerInfo: Owner,
    @SerializedName("html_url")
    val repoHtmlUrl: String,
    @SerializedName("description")
    val repoDescripition: String,
    @SerializedName("url")
    val urlToApiConsume: String,
    @SerializedName("languages_url")
    val languagesUrl: String,
    @SerializedName("contributors_url")
    val contributorsUrl: String,
    @SerializedName("forks_count")
    val forksCount: String,
    @SerializedName("stargazers_count")
    val starsCount: String,


    )

data class Owner(
    @SerializedName("login")
    val login: String,
    @SerializedName("id")
    val userId: Int,
    @SerializedName("avatar_url")
    val avatarUrl: String,
    @SerializedName("url")
    val userUrl: String,
    @SerializedName("html_url")
    val htmlUrl: String,
)
