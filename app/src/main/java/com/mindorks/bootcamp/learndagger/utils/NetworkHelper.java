package com.mindorks.bootcamp.learndagger.utils;

import android.content.Context;

import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext;

import javax.inject.Inject;

public class NetworkHelper {
    // Should be Application Context
    @ApplicationContext
    private Context context;

    @Inject
    public NetworkHelper( Context context) {

        this.context = context;
        //initialisation here
    }

    public boolean isNetworkConnected() {
// check network using context
        return false;
    }
}
