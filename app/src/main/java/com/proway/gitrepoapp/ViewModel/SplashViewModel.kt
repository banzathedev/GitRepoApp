package com.proway.gitrepoapp.ViewModel

import androidx.lifecycle.ViewModel
import com.proway.gitrepoapp.repository.ReposRepository

class SplashViewModel : ViewModel() {
    private val repo = ReposRepository()

    fun LoadModels() {
        repo.getAllReposAndLangs()
    }

}