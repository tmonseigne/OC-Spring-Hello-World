package com.kuro.helloworld.service;

import com.kuro.helloworld.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    public HelloWorld getHelloWorld(){
        return new HelloWorld();
    }
}
