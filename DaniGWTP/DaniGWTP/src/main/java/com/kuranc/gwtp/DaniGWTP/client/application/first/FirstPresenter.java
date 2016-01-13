package com.kuranc.gwtp.DaniGWTP.client.application.first;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
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

		public Label getFirstLabel();

		public TextBox getFirstTextBox();

		public Button getFirstButton();
	}

	@ContentSlot
	public static final Type<RevealContentHandler<?>> SLOT_First = new Type<RevealContentHandler<?>>();

	@NameToken(NameTokens.FIRST)
	@ProxyCodeSplit
	interface MyProxy extends ProxyPlace<FirstPresenter> {
	}

	@Inject
	FirstPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, RevealType.Root);

		getView().setUiHandlers(this);
	}

	protected void onBind() {
		super.onBind();
	}

	@Inject
	PlaceManager placeManager;

	protected void onReset() {
		super.onReset();

		getView().getFirstTextBox().setText("First text");

		getView().getFirstButton().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				PlaceRequest request = new PlaceRequest(NameTokens.SECOND).with("name", getView().getFirstTextBox().getText());
				placeManager.revealPlace(request);

			}
		});

	}
}