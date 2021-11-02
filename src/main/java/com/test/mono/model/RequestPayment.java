package com.test.mono.model;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.Date;

@Data
@Entity
@Table( name = "requestpayment")
public class RequestPayment {
    @Column(name = "route_number")
    private  Integer routeNumber;
    @Column (name = "date")
    private Date date;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private Integer requestId;

    @Column(name = "status_request", columnDefinition = "varchar(255) default 'processing'")
//    @GeneratedValue(generator = "processing")
    private String statusRequest;
}
