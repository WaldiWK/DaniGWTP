package com.kuranc.gwtp.DaniGWTP.client.application.header;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;


class HeaderView extends ViewImpl implements HeaderPresenter.MyView {
	interface Binder extends UiBinder<Widget, HeaderView> {
	}

	@UiField
	HTMLPanel contentPanel;

	@Inject
	HeaderView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
		bindSlot(HeaderPresenter.SLOT_content, contentPanel);
	}

}