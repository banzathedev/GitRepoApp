package com.proway.gitrepoapp.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.proway.gitrepoapp.repository.ReposRepository

class ListViewModel : ViewModel() {
    private val repo = ReposRepository()

    private val _changes = MutableLiveData<Boolean>()
    var changes: LiveData<Boolean> = _changes

    private val _refresh = MutableLiveData<Boolean>()
    var refresh: LiveData<Boolean> = _refresh

    fun callGetRepoPrs(user: String, repoName: String) {
        repo.getPrsOfARepo(user, repoName) {
            _changes.value = it
        }
    }
//    fun callRepoByLangs(lang: String){
//        val fullLang = "language:${lang}"
//        repo.getReposBylang(fullLang){
//            _refresh.value = it
//        }
//    }
}
