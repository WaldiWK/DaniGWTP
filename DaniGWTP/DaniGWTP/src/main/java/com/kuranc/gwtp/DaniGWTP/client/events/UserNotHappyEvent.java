package com.kuranc.gwtp.DaniGWTP.client.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class UserNotHappyEvent extends GwtEvent<UserNotHappyEvent.UserNotHappyHandler> {
    private static Type<UserNotHappyHandler> TYPE = new Type<UserNotHappyHandler>();
    
    public interface UserNotHappyHandler extends EventHandler {
        void onUserNotHappy(UserNotHappyEvent event);
    }
    
    
    private final String message;
   
    public UserNotHappyEvent(final String message) {
        this.message = message;
    }

    public static Type<UserNotHappyHandler> getType() {
        return TYPE;
    }

    @Override
    protected void dispatch(final UserNotHappyHandler handler) {
        handler.onUserNotHappy(this);
    }

    @Override
    public Type<UserNotHappyHandler> getAssociatedType() {
        return TYPE;
    }
    
    public String getMessage() {
        return this.message;
    }
}