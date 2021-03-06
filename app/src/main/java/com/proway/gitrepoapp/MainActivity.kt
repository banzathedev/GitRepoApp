package com.proway.gitrepoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proway.gitrepoapp.ui.view.MainFragment
import com.proway.gitrepoapp.ui.view.SplashFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SplashFragment())
                .commitNow()
        }
    }
}