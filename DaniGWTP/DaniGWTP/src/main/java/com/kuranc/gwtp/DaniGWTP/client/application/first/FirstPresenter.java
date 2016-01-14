package com.kuranc.gwtp.DaniGWTP.client.application.first;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.kuranc.gwtp.DaniGWTP.client.place.NameTokens;

public class FirstPresenter extends
		Presenter<FirstPresenter.MyView, FirstPresenter.MyProxy> implements
		FirstUiHandlers {
	interface MyView extends View, HasUiHandlers<FirstUiHandlers> {

	}

	PlaceManager placeManager;

	@ContentSlot
	public static final Type<RevealContentHandler<?>> SLOT_First = new Type<RevealContentHandler<?>>();

	@NameToken(NameTokens.FIRST)
	@ProxyCodeSplit
	interface MyProxy extends ProxyPlace<FirstPresenter> {
	}

	@Inject
	FirstPresenter(EventBus eventBus, MyView view, MyProxy proxy,
			PlaceManager placeManager) {
		super(eventBus, view, proxy, RevealType.Root);

		this.placeManager = placeManager;
		getView().setUiHandlers(this);
	}

	protected void onBind() {
		super.onBind();
	}

	protected void onReset() {
		super.onReset();
	}

	@Override
	public void onClicked(String text) {
		PlaceRequest request = new PlaceRequest.Builder()
			.nameToken(NameTokens.SECOND)
			.with("name", text)
			.build();
		placeManager.revealPlace(request);

	}
}