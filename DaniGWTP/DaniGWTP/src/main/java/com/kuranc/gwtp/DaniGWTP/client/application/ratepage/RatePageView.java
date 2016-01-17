package com.kuranc.gwtp.DaniGWTP.client.application.ratepage;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

class RatePageView extends ViewWithUiHandlers<RatePageUiHandlers> implements RatePagePresenter.MyView {
    interface Binder extends UiBinder<Widget, RatePageView> {
    }

    @UiField
    Button yesButton;
    
    @UiField
    Button noButton;
    
    @UiHandler("yesButton") 
    public void onYesButtonClicked(ClickEvent event){
    	getUiHandlers().onClicked(true);
    }
    
    @UiHandler("noButton") 
    public void onNoButtonClicked(ClickEvent event){
    	getUiHandlers().onClicked(false);
    }
    
    @Inject
    RatePageView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
}