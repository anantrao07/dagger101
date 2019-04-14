package com.mindorks.bootcamp.learndagger.di.module;

import com.mindorks.bootcamp.learndagger.di.qualifier.FragmentContext;

import androidx.fragment.app.Fragment;
import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModule {

    private Fragment fragment ;


    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @FragmentContext
    @Provides
    Fragment provideFragment () {
        return  fragment;
    }
}
