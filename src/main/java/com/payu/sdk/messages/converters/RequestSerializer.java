package com.payu.sdk.messages.converters;

import com.payu.sdk.messages.request.OpenPayURequest;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class RequestSerializer {

    public static String serializeRequest(OpenPayURequest request) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(request);
    }


}
