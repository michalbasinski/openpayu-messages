package com.payu.sdk.messages.response;

import com.payu.sdk.messages.entities.Order;
import com.payu.sdk.messages.entities.Status;

import java.util.List;

public class OrderRetrieveResponse implements OpenPayUResponse {
    private Status status;
    private List<Order> orders;

    @Override
    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
