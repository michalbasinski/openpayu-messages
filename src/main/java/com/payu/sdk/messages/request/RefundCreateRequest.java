package com.payu.sdk.messages.request;

import com.payu.sdk.messages.entities.Refund;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class RefundCreateRequest {
    private Refund refund;

    public Refund getRefund() {
        return refund;
    }

    public void setRefund(Refund refund) {
        this.refund = refund;
    }
}
