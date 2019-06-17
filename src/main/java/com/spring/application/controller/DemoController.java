package com.spring.application.controller;


import com.spring.application.model.Demo;
import com.spring.application.service.IBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    IBeanFactory beanFactory;

    @GetMapping("/health")
    public ResponseEntity healthCheck(){
        return ResponseEntity.ok("Successful done");
    }

    @PostMapping("/save")
    public ResponseEntity create(@RequestBody Demo demo){
        return ResponseEntity.ok(beanFactory.getDemoService().createDemo(demo));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity get(@PathVariable("id") String id){
        return ResponseEntity.ok(beanFactory.getDemoService().getDemoById(id));
    }
}
