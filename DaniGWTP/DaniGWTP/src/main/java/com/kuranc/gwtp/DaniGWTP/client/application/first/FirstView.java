package com.kuranc.gwtp.DaniGWTP.client.application.first;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

class FirstView extends ViewWithUiHandlers<FirstUiHandlers> implements FirstPresenter.MyView {
    interface Binder extends UiBinder<Widget, FirstView> {
    }

    @UiField
    SimplePanel main;

    @Inject
    FirstView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    @Override
    public void setInSlot(Object slot, IsWidget content) {
        if (slot == FirstPresenter.SLOT_First) {
            main.setWidget(content);
        } else {
            super.setInSlot(slot, content);
        }
    }
}