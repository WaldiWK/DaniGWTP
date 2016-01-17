package com.kuranc.gwtp.DaniGWTP.client.application.third;


import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.kuranc.gwtp.DaniGWTP.client.application.header.HeaderPresenter;
import com.kuranc.gwtp.DaniGWTP.client.place.NameTokens;
public class ThirdPresenter extends Presenter<ThirdPresenter.MyView, ThirdPresenter.MyProxy>  {
    interface MyView extends View  {
    }
    
    @NameToken(NameTokens.THIRD)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<ThirdPresenter> {
    }

    @Inject
    ThirdPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, HeaderPresenter.SLOT_content);
        
    }
    
    protected void onBind() {
        super.onBind();
    }
    
    protected void onReveal() {
        super.onReveal();
    }
    
}