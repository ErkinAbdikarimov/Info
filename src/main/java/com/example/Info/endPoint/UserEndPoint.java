package com.example.Info.endPoint;


import com.example.Info.service.UserService;
import mypackage.GetResponse;
import mypackage.GetUser;
import mypackage.User;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndPoint {

    private final UserService userService;

    public UserEndPoint(UserService userService){
        this.userService = userService;
    }

    @PayloadRoot(namespace = "http://example.com/spring-boot-soap-example", localPart = "getUser")
    @ResponsePayload
    public GetResponse getUserByIin(@RequestPayload GetUser getUser){
        User userByIIn = userService.getUser(getUser.getIin());
        GetResponse getResponse = new GetResponse();
        getResponse.setUser(userByIIn);
        return getResponse;
    }


}
