package com.github.sejoung.ddd.chapter5;

public class ValidationNotificationHandler {

    public void handleError(String message) {
        throw new IllegalArgumentException(message);
    }

}
