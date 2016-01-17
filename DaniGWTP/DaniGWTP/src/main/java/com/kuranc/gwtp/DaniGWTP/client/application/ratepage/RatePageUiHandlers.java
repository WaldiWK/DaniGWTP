package com.kuranc.gwtp.DaniGWTP.client.application.ratepage;

import com.gwtplatform.mvp.client.UiHandlers;

interface RatePageUiHandlers extends UiHandlers {
	/**
	 * takes answer yes or no
	 * @param answer
	 */
	public void onClicked(boolean answer) ;
}