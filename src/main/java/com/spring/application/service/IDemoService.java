package com.spring.application.service;


import com.spring.application.model.Demo;

public interface IDemoService {

    public Demo createDemo(Demo demo);

    public Demo getDemoById(String id);
}
