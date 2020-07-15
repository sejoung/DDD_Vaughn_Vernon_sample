package com.github.sejoung.ddd.chapter5;

import java.util.Objects;

public class WarbleValidator extends Validator {

    private Warble warble;

    public WarbleValidator(
        ValidationNotificationHandler notificationHandler,
        Warble warble) {
        super(notificationHandler);
        this.setWarble(warble);
    }

    private Warble getWarble() {
        return warble;
    }

    private void setWarble(Warble warble) {
        this.warble = warble;
    }

    @Override
    public void validate() {

        if (this.hasWarpedWarbleCondition(this.getWarble())) {
            this.notificationHandler().handleError("값이 없다");
        }


    }

    private boolean hasWarpedWarbleCondition(Warble warble) {
        return !Objects.isNull(warble);
    }


}
