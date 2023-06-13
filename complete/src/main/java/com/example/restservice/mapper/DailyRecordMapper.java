package com.example.restservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.restservice.bean.DailyRecord;
@Mapper
public interface DailyRecordMapper {
    List<DailyRecord> selectRecordAll();
    
}
