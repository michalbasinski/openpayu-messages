package com.payu.sdk.messages.response;

import com.payu.sdk.messages.entities.Status;

public class OrderCreateResponse implements OpenPayUResponse {

    private String orderId;
    private String redirectUri;
    private Status status;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
