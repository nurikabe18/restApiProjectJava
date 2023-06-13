package com.example.restservice.bean;

import java.util.List;

import lombok.Data;

@Data
public class GreetingList {
    private List<Greeting> greetingList;
}
