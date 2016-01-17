package com.kuranc.gwtp.DaniGWTP.client.application.second;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class SecondView extends ViewImpl implements SecondPresenter.MyView {
	interface Binder extends UiBinder<Widget, SecondView> {
	}

	@UiField
	Label secondLabel;

	public Label getSecondLabel() {
		return secondLabel;
	}

	@Inject
	SecondView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

}