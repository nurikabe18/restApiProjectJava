package com.example.restservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.restservice.bean.Detail;

@Mapper
public interface DetailMapper {
    List<Detail> selectDetailAll();
    
}
