package com.kuranc.gwtp.DaniGWTP.client.application.third;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ThirdModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ThirdPresenter.class, ThirdPresenter.MyView.class, ThirdView.class, ThirdPresenter.MyProxy.class);
    }
}