package com.kuranc.gwtp.DaniGWTP.client.application.second;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.kuranc.gwtp.DaniGWTP.client.place.NameTokens;
public class SecondPresenter extends Presenter<SecondPresenter.MyView, SecondPresenter.MyProxy>  {
    interface MyView extends View  {
    	public Label getSecondLabel() ;
    }
    @ContentSlot
    public static final Type<RevealContentHandler<?>> SLOT_Second = new Type<RevealContentHandler<?>>();

    @NameToken(NameTokens.SECOND)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<SecondPresenter> {
    }

    @Inject
    SecondPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
        
    }
    
    protected void onBind() {
        super.onBind();
    }
    
    protected void onReset() {
        super.onReset();
        
        getView().getSecondLabel().setText(name);
    }
    private String name="";
    @Override
    public void prepareFromRequest(PlaceRequest request) {
    	super.prepareFromRequest(request);
    	name=request.getParameter("name", "Default value");
    	
    }
}