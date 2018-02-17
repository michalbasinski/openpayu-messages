package com.payu.sdk.messages.entities.builders;

import com.payu.sdk.messages.entities.Refund;

public class RefundBuilder {
    private Refund refundBuilder = new Refund();

    public RefundBuilder withAmount(long amount) {
        refundBuilder.setAmount(amount);
        return this;
    }

    public RefundBuilder withDescription(String description) {
        refundBuilder.setDescription(description);
        return this;
    }

    public Refund build() {
        return refundBuilder;
    }
}
