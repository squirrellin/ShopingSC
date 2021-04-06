package com.shaolin.nacos9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: leisl
 * @Date: 2021/4/5 19:45
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/nacos/{id}")
    public String getPort(@PathVariable("id") Long id){

        return "nacos register; port" + port +  "id: " + id;

    }
}
