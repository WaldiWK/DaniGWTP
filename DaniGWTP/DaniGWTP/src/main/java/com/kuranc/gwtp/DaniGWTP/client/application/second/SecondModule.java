package com.kuranc.gwtp.DaniGWTP.client.application.second;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class SecondModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(SecondPresenter.class, SecondPresenter.MyView.class, SecondView.class, SecondPresenter.MyProxy.class);
    }
}