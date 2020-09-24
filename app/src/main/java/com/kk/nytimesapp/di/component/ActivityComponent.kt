package com.kk.nytimesapp.di.component

import com.kk.nytimesapp.di.module.DataModule
import com.kk.nytimesapp.di.module.ViewModelFactoryModule
import com.kk.nytimesapp.di.scope.ActivityScope
import com.kk.nytimesapp.view.NewsListActivity
import dagger.Subcomponent

@Subcomponent(modules = [ViewModelFactoryModule::class, DataModule::class])
@ActivityScope
interface ActivityComponent {

    fun inject(resutActivity: NewsListActivity)
}