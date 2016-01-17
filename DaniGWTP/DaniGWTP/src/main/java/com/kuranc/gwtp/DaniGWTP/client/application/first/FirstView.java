package com.kuranc.gwtp.DaniGWTP.client.application.first;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

class FirstView extends ViewWithUiHandlers<FirstUiHandlers> implements
		FirstPresenter.MyView {
	interface Binder extends UiBinder<Widget, FirstView> {
	}

	@UiField
	Label firstLabel;
	@UiField
	TextBox firstTextBox;
	@UiField
	Button firstButton;
	@UiHandler("firstButton")
	void onFirstButtonClicked (ClickEvent event){
		String text = firstTextBox.getText();
		getUiHandlers().onClicked(text);
	}
	

	public Label getFirstLabel() {
		return firstLabel;
	}

	public TextBox getFirstTextBox() {
		return firstTextBox;
	}

	public Button getFirstButton() {
		return firstButton;
	}

	@Inject
	FirstView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

}