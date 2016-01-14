package com.kuranc.gwtp.DaniGWTP.client.application.first;

import com.gwtplatform.mvp.client.UiHandlers;

interface FirstUiHandlers extends UiHandlers {
	/**
	 * Sends text witch was in TextBox when button is clicket
	 * @param text
	 */
	public void onClicked(String text); 
}