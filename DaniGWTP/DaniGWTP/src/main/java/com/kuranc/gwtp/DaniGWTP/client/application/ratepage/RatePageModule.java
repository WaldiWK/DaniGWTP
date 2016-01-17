package com.kuranc.gwtp.DaniGWTP.client.application.ratepage;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class RatePageModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
            bindPresenterWidget(RatePagePresenter.class, RatePagePresenter.MyView.class, RatePageView.class);
    }
}