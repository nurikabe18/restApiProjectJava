package com.example.restservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.restservice.bean.Greeting;
@Mapper
public interface GreetingMapper {
    List<Greeting> selectAll();
}
