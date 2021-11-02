package com.test.mono.service;

import com.test.mono.model.RequestPayment;
import com.test.mono.repository.RequestRepository;
import org.springframework.stereotype.Service;

@Service
public class RequestService {
    private final RequestRepository requestRepository;

    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public Integer addNewRequest(RequestPayment requestPayment){
        RequestPayment payment = requestRepository.save(requestPayment);

        return payment.getRequestId();
    }
    public String checkRequestStatus(Integer requestId){
        RequestPayment status = requestRepository.getById(requestId);
        return status.getStatusRequest();
    }
}
