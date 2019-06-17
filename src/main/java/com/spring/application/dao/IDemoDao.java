package com.spring.application.dao;


import com.spring.application.model.Demo;

public interface IDemoDao {
    public Demo findById(String id, Class<Demo> clazz);
    public Demo save(Demo id, Class<Demo> clazz);
}
