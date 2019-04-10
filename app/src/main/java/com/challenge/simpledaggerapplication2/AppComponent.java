package com.challenge.simpledaggerapplication2;

import dagger.Component;

@Component
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
