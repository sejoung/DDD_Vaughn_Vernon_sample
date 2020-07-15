package com.github.sejoung.ddd.chapter5;

public abstract class Validator {

    private ValidationNotificationHandler notificationHandler;

    public Validator(ValidationNotificationHandler notificationHandler) {
        this.setNotificationHandler(notificationHandler);
    }

    public abstract void validate();

    protected ValidationNotificationHandler notificationHandler() {
        return this.notificationHandler;
    }

    private void setNotificationHandler(
        ValidationNotificationHandler notificationHandler) {
        this.notificationHandler = notificationHandler;
    }
}
