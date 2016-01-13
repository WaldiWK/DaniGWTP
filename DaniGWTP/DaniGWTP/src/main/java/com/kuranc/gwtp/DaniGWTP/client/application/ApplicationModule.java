package com.kuranc.gwtp.DaniGWTP.client.application;

import com.kuranc.gwtp.DaniGWTP.client.application.home.HomeModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.kuranc.gwtp.DaniGWTP.client.application.first.FirstModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new FirstModule());
		install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
