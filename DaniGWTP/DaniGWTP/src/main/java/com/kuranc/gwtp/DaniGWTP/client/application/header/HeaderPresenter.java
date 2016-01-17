package com.kuranc.gwtp.DaniGWTP.client.application.header;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.Proxy;

public class HeaderPresenter extends
		Presenter<HeaderPresenter.MyView, HeaderPresenter.MyProxy> {
	

	
	interface MyView extends View {
	}

	@ProxyCodeSplit
	interface MyProxy extends Proxy<HeaderPresenter> {
	}

	
	public static final NestedSlot SLOT_content = new NestedSlot();
	

	@Inject
	HeaderPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, RevealType.RootLayout);

	}

	protected void onBind() {
		super.onBind();
	}

	protected void onReset() {
		super.onReset();
	}
}