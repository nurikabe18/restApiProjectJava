package com.example.restservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.bean.Greeting;
import com.example.restservice.mapper.GreetingMapper;

@Service
public class GreetingService {
    @Autowired
    private GreetingMapper greetingMapper;

    public List<Greeting> selectAll(){
        return greetingMapper.selectAll();
    }
}
