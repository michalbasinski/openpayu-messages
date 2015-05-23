package com.payu.sdk.messages.converters;

import com.payu.sdk.messages.request.OpenPayURequest;
import com.payu.sdk.messages.response.OpenPayUResponse;
import com.payu.sdk.messages.response.OrderCancelResponse;
import com.payu.sdk.messages.response.OrderCreateResponse;
import com.payu.sdk.messages.response.RefundCreateResponse;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JSONConverter {

    public static String convertToJSON(OpenPayURequest request) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(request);
    }

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
            default: response = null;
                     break;
        }
        return response;
    }
}
