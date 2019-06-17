package com.spring.application.service.impl;


import com.spring.application.model.Demo;
import com.spring.application.service.IBeanFactory;
import com.spring.application.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements IDemoService {

    @Autowired
    IBeanFactory beanFactory;

    public Demo createDemo(Demo demo){
        return beanFactory.getDemoDao().save(demo, Demo.class);
    }

    public Demo getDemoById(String id){
        return beanFactory.getDemoDao().findById(id, Demo.class);
    }
}
