package com.payu.sdk.messages.request.builders;

import com.payu.sdk.messages.request.RefundCreateRequest;

public class RefundCreateRequestBuilder {
    private RefundCreateRequest refundCreateRequest = new RefundCreateRequest();

    public RefundCreateRequestBuilder withOrderId(String orderId) {
        refundCreateRequest.setOrderId(orderId);
        return this;
    }

    public RefundCreateRequestBuilder withAmount(long amount) {
        refundCreateRequest.setAmount(amount);
        return this;
    }

    public RefundCreateRequestBuilder withDescription(String description) {
        refundCreateRequest.setDescription(description);
        return this;
    }

    public RefundCreateRequest build() {
        return refundCreateRequest;
    }
}
