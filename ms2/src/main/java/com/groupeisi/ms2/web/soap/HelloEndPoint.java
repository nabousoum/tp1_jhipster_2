package com.groupeisi.ms2.web.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class HelloEndPoint {
//    @PayloadRoot(namespace="http://ws.groupeisi.com",localPart = "getInfoRequest")
//    public @ResponsePayload GetInfoResponse getInfos(@RequestPayload GetInfoRequest){
//        GetInfoResponse getInfoResponse = new GetInfoRespnse();
//         getInfoResponse.setOutput("Hello world");
//         return getInfoResponse;
//    }
}
