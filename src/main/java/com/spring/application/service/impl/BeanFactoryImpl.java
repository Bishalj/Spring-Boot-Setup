package com.spring.application.service.impl;


import com.spring.application.dao.IDemoDao;
import com.spring.application.service.IBeanFactory;
import com.spring.application.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeanFactoryImpl implements IBeanFactory {

    @Autowired
    IDemoDao demoDao;

    @Autowired
    IDemoService demoService;

    public IDemoDao getDemoDao() {
        return demoDao;
    }

    public IDemoService getDemoService() {
        return demoService;
    }
}
