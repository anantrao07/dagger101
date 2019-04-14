package com.mindorks.bootcamp.learndagger.di.component;

import com.mindorks.bootcamp.learndagger.di.module.FragmentModule;
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope;

import androidx.fragment.app.Fragment;
import dagger.Component;


@FragmentScope
@Component(dependencies = {ApplicationComponent.class}, modules = {FragmentModule.class})
public interface FragmentComponent {
    void inject(Fragment fragment);
}