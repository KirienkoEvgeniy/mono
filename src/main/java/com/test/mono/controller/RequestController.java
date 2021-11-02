package com.test.mono.controller;

import com.test.mono.model.RequestPayment;
import com.test.mono.service.RequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("request")
public class RequestController {

    Logger logger =  LoggerFactory.getLogger(RequestController.class);

    private final RequestService requestService;
    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping("add")
    public Integer addRequest(@RequestBody RequestPayment requestPayment){
        return requestService.addNewRequest(requestPayment);
    }

    @GetMapping("get")
    public String getStatus(Integer requestId){
    return requestService.checkRequestStatus(requestId);
    }


}
