package com.davideploy.repository.searcher

import android.app.Application
import com.davideploy.repository.searcher.data.di.DataModule
import com.davideploy.repository.searcher.domain.di.DomainModule
import com.davideploy.repository.searcher.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}