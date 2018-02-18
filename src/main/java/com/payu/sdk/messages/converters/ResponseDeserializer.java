package com.payu.sdk.messages.converters;

import com.payu.sdk.messages.response.*;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class ResponseDeserializer {
    public static OpenPayUResponse parseResponse(String rawResponse, ResponseType type) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        OpenPayUResponse response;
        switch (type) {
            case ORDER_CREATE_RESPONSE:  response = mapper.readValue(rawResponse, OrderCreateResponse.class);
                break;
            case REFUND_CREATE_RESPONSE: response = mapper.readValue(rawResponse, RefundCreateResponse.class);
                break;
            case ORDER_CANCEL_RESPONSE:  response = mapper.readValue(rawResponse, OrderCancelResponse.class);
                break;
            case ORDER_RETRIEVE_RESPONSE:response = mapper.readValue(rawResponse, OrderRetrieveResponse.class);
                break;
            default: response = null;
                break;
        }
        return response;
    }
}
