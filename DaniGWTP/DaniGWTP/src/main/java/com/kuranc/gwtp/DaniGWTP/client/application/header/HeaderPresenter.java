package com.kuranc.gwtp.DaniGWTP.client.application.header;

import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.kuranc.gwtp.DaniGWTP.client.events.UserNotHappyEvent;
import com.kuranc.gwtp.DaniGWTP.client.events.UserNotHappyEvent.UserNotHappyHandler;

public class HeaderPresenter extends
		Presenter<HeaderPresenter.MyView, HeaderPresenter.MyProxy> {
		
	interface MyView extends View {
		public Label getHappyLabel();
	}

	@ProxyCodeSplit
	interface MyProxy extends Proxy<HeaderPresenter> {
	}

	
	public static final NestedSlot SLOT_content = new NestedSlot();
	
	private UserNotHappyHandler notHappyHandler = new UserNotHappyHandler() {
		
		@Override
		public void onUserNotHappy(UserNotHappyEvent event) {
			getView().getHappyLabel().setText("");
			
		}
	};
	

	@Inject
	HeaderPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, RevealType.RootLayout);

	}

	protected void onBind() {
		super.onBind();
		registerHandler(getEventBus().addHandler(UserNotHappyEvent.getType(), notHappyHandler));
	}

	
	protected void onReset() {
		super.onReset();
	}
}