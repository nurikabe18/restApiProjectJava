package com.example.restservice.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.restservice.bean.Greeting;
@Mapper
public interface GreetingMapper {
    Greeting selectAll();
}
