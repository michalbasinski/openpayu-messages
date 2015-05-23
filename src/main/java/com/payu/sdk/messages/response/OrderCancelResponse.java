package com.payu.sdk.messages.response;

import com.payu.sdk.messages.entities.Status;

public class OrderCancelResponse implements OpenPayUResponse {
    private Status status;
    private String orderId;
    private String extOrderId;

    @Override
    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getExtOrderId() {
        return extOrderId;
    }

    public void setExtOrderId(String extOrderId) {
        this.extOrderId = extOrderId;
    }
}
