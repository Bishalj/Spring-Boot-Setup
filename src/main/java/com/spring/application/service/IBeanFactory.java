package com.spring.application.service;


import com.spring.application.dao.IDemoDao;

public interface IBeanFactory {
    IDemoDao getDemoDao();
    IDemoService getDemoService();
}
