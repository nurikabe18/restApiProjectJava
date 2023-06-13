package com.example.restservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.restservice.bean.Calendar;

@Mapper
public interface CalendarMapper {
    List<Calendar> selectCalendarAll();
}