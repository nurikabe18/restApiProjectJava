package com.example.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.bean.Calendar;
import com.example.restservice.bean.DailyRecord;
import com.example.restservice.bean.Detail;
import com.example.restservice.bean.MoneyDiary;
import com.example.restservice.service.CalenderService;
import com.example.restservice.service.DailyRecordService;
import com.example.restservice.service.DetailService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MoneyDiaryController {
	@Autowired
	private CalenderService calenderService;
	@Autowired
	private DetailService detailService;
	@Autowired
	private DailyRecordService recordService;

	@GetMapping("/calender")
	public List<Calendar> calender(
			@RequestParam(value = "id", defaultValue = "1") String id
		,	@RequestParam(value = "name", defaultValue = "name") String name
		,	@RequestParam(value = "completed", defaultValue = "0") int completed) {
		MoneyDiary moneyDiary = new MoneyDiary();
		moneyDiary.setCalendar(calenderService.selectCalendarAll());
		return moneyDiary.getCalendar();
	}

	@GetMapping("/detail")
	public List<Detail> detail(
			@RequestParam(value = "id", defaultValue = "1") String id
		,	@RequestParam(value = "name", defaultValue = "name") String name
		,	@RequestParam(value = "completed", defaultValue = "0") int completed) {
		MoneyDiary moneyDiary = new MoneyDiary();
		moneyDiary.setDetail(detailService.selectDetailAll());
		return moneyDiary.getDetail();
	}

	@GetMapping("/dailyRecord")
	public List<DailyRecord> record(
			@RequestParam(value = "id", defaultValue = "1") String id
		,	@RequestParam(value = "name", defaultValue = "name") String name
		,	@RequestParam(value = "completed", defaultValue = "0") int completed) {
		MoneyDiary moneyDiary = new MoneyDiary();
		moneyDiary.setDailyRecord(recordService.selectRecordAll());
		return moneyDiary.getDailyRecord();
	}
}
