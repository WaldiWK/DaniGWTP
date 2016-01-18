package com.kuranc.gwtp.DaniGWTP.client.application.whynot;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class WhyNotModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
            bindPresenterWidget(WhyNotPresenter.class, WhyNotPresenter.MyView.class, WhyNotView.class);
    }
}