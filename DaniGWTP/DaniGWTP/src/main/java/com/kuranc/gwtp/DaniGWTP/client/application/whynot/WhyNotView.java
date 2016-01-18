package com.kuranc.gwtp.DaniGWTP.client.application.whynot;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupViewImpl;

class WhyNotView extends PopupViewImpl implements WhyNotPresenter.MyView {
    interface Binder extends UiBinder<Widget, WhyNotView> {
    }

    @UiField
    Button okButton;

    public Button getOkButton() {
		return okButton;
	}

	@Inject
    WhyNotView(EventBus eventBus, Binder uiBinder) {
        super(eventBus);
    
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    
    
}