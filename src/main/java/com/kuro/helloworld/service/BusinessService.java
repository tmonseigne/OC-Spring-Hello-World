package com.kuro.helloworld.service;

import com.kuro.helloworld.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component	// Annotation permettant de voir la classe pour Spring
public class BusinessService {

    public HelloWorld getHelloWorld(){
        return new HelloWorld();
    }
}
