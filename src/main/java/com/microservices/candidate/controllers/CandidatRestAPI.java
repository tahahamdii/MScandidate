package com.microservices.candidate.controllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidatRestAPI {
    private String title ="hello , i'm the candiate";
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println(title);
        return title;
    }

}
