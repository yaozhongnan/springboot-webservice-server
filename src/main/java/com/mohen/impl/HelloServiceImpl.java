package com.mohen.impl;

import com.mohen.HelloService;
import org.springframework.stereotype.Service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(@WebParam(name = "task") String task) {
        System.out.println("task = " + task);
        return task + "hello !!!";
    }

    @Override
    public String sayHello2(@WebParam(name = "task2") String task2) {
        System.out.println("task2 = " + task2);
        return task2 + "hello !!!";
    }
}
