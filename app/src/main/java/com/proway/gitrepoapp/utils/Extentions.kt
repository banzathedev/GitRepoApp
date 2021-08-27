package com.proway.gitrepoapp.utils

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.proway.gitrepoapp.R

fun FragmentActivity.replaceView(fragment: Fragment, @IdRes containerId: Int = R.id.container){
    supportFragmentManager.beginTransaction()
        .replace(containerId, fragment)
        .commitNow()
}