package com.example.restservice.bean;

import java.util.List;

import lombok.Data;

@Data
public class MoneyDiary {
    private List<DailyRecord> dailyRecord;
    private List<Detail> detail;
    private List<Calendar> calendar;
    
}
