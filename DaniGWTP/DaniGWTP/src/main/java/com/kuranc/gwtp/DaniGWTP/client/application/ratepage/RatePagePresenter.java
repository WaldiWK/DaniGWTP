package com.kuranc.gwtp.DaniGWTP.client.application.ratepage;


import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.kuranc.gwtp.DaniGWTP.client.application.whynot.WhyNotPresenter;
import com.kuranc.gwtp.DaniGWTP.client.events.UserNotHappyEvent;
public class RatePagePresenter extends PresenterWidget<RatePagePresenter.MyView> implements RatePageUiHandlers {
    interface MyView extends View , HasUiHandlers<RatePageUiHandlers> {
    }
    
   

    private WhyNotPresenter whyNotPresenter;
    private EventBus eventBus;
    
    
    @Inject
    RatePagePresenter(
            EventBus eventBus,
            MyView view,
            WhyNotPresenter whyNotPresenter) {
        super(eventBus, view);
        
        this.whyNotPresenter = whyNotPresenter;
        this.eventBus= eventBus;
        getView().setUiHandlers(this);
    }
    
    protected void onBind() {
        super.onBind();
    }

	@Override
	public void onClicked(boolean answer) {
		if (answer == true) Window.alert	("That is great") ;
		else {
			UserNotHappyEvent userNotHappy = new UserNotHappyEvent("Not Happy");
			this.eventBus.fireEvent(userNotHappy);
		
			addToPopupSlot(whyNotPresenter);	
		}
	}
    
}