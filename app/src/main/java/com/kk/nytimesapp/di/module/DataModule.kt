package com.kk.nytimesapp.di.module

import com.kk.nytimesapp.di.scope.ActivityScope
import com.kk.nytimesapp.network.RemoteData
import com.kk.nytimesapp.network.RemoteDataImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {
    @Binds
    @ActivityScope
    fun bindRemoteData(remoteDataImpl: RemoteDataImpl): RemoteData
}