package com.spring.application.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class AbstractBaseDaoImpl<T> {

    @Autowired
    MongoTemplate mongoTemplate;

    public T findById(String id, Class<T> clazz){
        return mongoTemplate.findById(id, clazz,  clazz.getSimpleName());
    }

    public T save(T object, Class<T> clazz){
         return mongoTemplate.save(object, clazz.getSimpleName());
    }
}
