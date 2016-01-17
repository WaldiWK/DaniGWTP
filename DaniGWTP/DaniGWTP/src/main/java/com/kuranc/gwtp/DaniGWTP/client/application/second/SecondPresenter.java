package com.kuranc.gwtp.DaniGWTP.client.application.second;


import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.common.client.IndirectProvider;
import com.gwtplatform.common.client.StandardProvider;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.presenter.slots.Slot;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.kuranc.gwtp.DaniGWTP.client.application.header.HeaderPresenter;
import com.kuranc.gwtp.DaniGWTP.client.application.ratepage.RatePagePresenter;
import com.kuranc.gwtp.DaniGWTP.client.place.NameTokens;
public class SecondPresenter extends Presenter<SecondPresenter.MyView, SecondPresenter.MyProxy>  {
    interface MyView extends View  {
    	public Label getSecondLabel() ;
    }
   
    @NameToken(NameTokens.SECOND)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<SecondPresenter> {
    }
	
    static final Slot<PresenterWidget<?>> SLOT_list = new Slot<>();
    
    
    private IndirectProvider<RatePagePresenter> ratePageFactory;

    @Inject
    SecondPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy,
            Provider<RatePagePresenter> ratePageFactory) {
     
    	super(eventBus, view, proxy, HeaderPresenter.SLOT_content);
        this.ratePageFactory = new StandardProvider<RatePagePresenter>(ratePageFactory);
    }
    
    protected void onBind() {
        super.onBind();
    }
    
    protected void onReset() {
        super.onReset();
        
        getView().getSecondLabel().setText(name);
        
        for (int i=0 ;i<3;i++){
        	ratePageFactory.get(new AsyncCallback<RatePagePresenter>() {
				
				@Override
				public void onSuccess(RatePagePresenter result) {
					addToSlot(SLOT_list	, result);
					
				}
				
				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					
				}
			});
        }
    }
    private String name="";
    @Override
    public void prepareFromRequest(PlaceRequest request) {
    	super.prepareFromRequest(request);
    	name=request.getParameter("name", "Default value");
    	
    }
}