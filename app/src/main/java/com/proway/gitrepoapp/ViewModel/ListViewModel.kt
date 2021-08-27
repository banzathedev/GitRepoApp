package com.proway.gitrepoapp.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.proway.gitrepoapp.repository.ReposRepository

class ListViewModel : ViewModel() {
    private val repo = ReposRepository()

    private val _changes = MutableLiveData<Boolean>()
    var changes: LiveData<Boolean> = _changes

    fun callGetRepoPrs(user: String, repoName: String) {
        repo.getPrsOfARepo(user, repoName){
            _changes.value = true
        }


    }

}