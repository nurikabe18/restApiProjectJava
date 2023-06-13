package com.example.restservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.bean.Calendar;
import com.example.restservice.mapper.CalendarMapper;

@Service
public class CalenderService {
    @Autowired
    private CalendarMapper calendarMapper;

    public List<Calendar> selectCalendarAll(){
        return calendarMapper.selectCalendarAll();
    }
}
