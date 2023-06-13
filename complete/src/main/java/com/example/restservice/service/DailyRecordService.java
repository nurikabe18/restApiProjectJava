package com.example.restservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.bean.DailyRecord;
import com.example.restservice.mapper.DailyRecordMapper;

@Service
public class DailyRecordService {
    @Autowired
    private DailyRecordMapper recordMapper;
    
    public List<DailyRecord> selectRecordAll(){
        return recordMapper.selectRecordAll();
    }
}
