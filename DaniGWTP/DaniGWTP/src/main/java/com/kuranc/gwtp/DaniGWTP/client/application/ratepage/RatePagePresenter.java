package com.kuranc.gwtp.DaniGWTP.client.application.ratepage;


import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.HasUiHandlers;
public class RatePagePresenter extends PresenterWidget<RatePagePresenter.MyView> implements RatePageUiHandlers {
    interface MyView extends View , HasUiHandlers<RatePageUiHandlers> {
    }

    @Inject
    RatePagePresenter(
            EventBus eventBus,
            MyView view) {
        super(eventBus, view);
        
        getView().setUiHandlers(this);
    }
    
    protected void onBind() {
        super.onBind();
    }

	@Override
	public void onClicked(boolean answer) {
		if (answer == true) Window.alert	("That is great") ;
		else Window.alert("I'm sorry to hear that");	
	}
    
}