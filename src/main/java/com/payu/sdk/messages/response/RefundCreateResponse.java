package com.payu.sdk.messages.response;

import com.payu.sdk.messages.entities.Status;

public class RefundCreateResponse implements OpenPayUResponse {

    private Status status;

    @Override
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
