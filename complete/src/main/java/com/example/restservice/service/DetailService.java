package com.example.restservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.bean.Detail;
import com.example.restservice.mapper.DetailMapper;

@Service
public class DetailService {
    @Autowired
    private DetailMapper detailMapper;
    
    public List<Detail> selectDetailAll(){
        return detailMapper.selectDetailAll();
    }
}
