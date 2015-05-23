package com.payu.sdk.messages.request.builders;

import com.payu.sdk.messages.request.OrderStatusUpdateRequest;

public class OrderStatusUpdateRequestBuilder {
    private OrderStatusUpdateRequest orderStatusUpdateRequest = new OrderStatusUpdateRequest();

    private OrderStatusUpdateRequestBuilder withOrderId(String orderId) {
        orderStatusUpdateRequest.setOrderId(orderId);
        return this;
    }

    private OrderStatusUpdateRequestBuilder withStatus(String status) {
        orderStatusUpdateRequest.setStatus(status);
        return this;
    }
}
