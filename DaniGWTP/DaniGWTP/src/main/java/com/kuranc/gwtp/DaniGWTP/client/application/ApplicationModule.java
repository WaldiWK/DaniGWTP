package com.kuranc.gwtp.DaniGWTP.client.application;

import com.kuranc.gwtp.DaniGWTP.client.application.home.HomeModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.kuranc.gwtp.DaniGWTP.client.application.first.FirstModule;
import com.kuranc.gwtp.DaniGWTP.client.application.second.SecondModule;
import com.kuranc.gwtp.DaniGWTP.client.application.header.HeaderModule;
import com.kuranc.gwtp.DaniGWTP.client.application.third.ThirdModule;
import com.kuranc.gwtp.DaniGWTP.client.application.ratepage.RatePageModule;
import com.kuranc.gwtp.DaniGWTP.client.application.whynot.WhyNotModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new WhyNotModule());
		install(new RatePageModule());
		install(new ThirdModule());
		install(new HeaderModule());
		install(new SecondModule());
		install(new FirstModule());
		install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
