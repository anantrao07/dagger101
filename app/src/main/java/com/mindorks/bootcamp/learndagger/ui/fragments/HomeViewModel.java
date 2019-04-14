package com.mindorks.bootcamp.learndagger.ui.fragments;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.qualifier.FragmentContext;
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope;
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper;

import javax.inject.Inject;

@FragmentScope
public class HomeViewModel {

    private DatabaseService databaseService;
    private NetworkService networkInfo;
    private NetworkHelper networkHelper;

    @Inject
    public HomeViewModel(DatabaseService databaseService, NetworkService networkInfo, NetworkHelper networkHelper){
        this.databaseService = databaseService;
        this.networkInfo = networkInfo;
        this.networkHelper = networkHelper;
    }
}
