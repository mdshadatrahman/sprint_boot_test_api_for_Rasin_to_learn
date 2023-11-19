package com.example.TestapiforRasintolearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class TestController {
    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }
    @GetMapping("/test_get")
    public Map<String, Object> testGetRequest() {
        Map<String, Object> newMap = new HashMap<>();
        newMap.put("id", 1);
        newMap.put("name", "Rasin");
        newMap.put("age", 23);
        newMap.put("occupation", "Intern");
        newMap.put("gender", "male");
        newMap.put("institute", "South East University");

        return newMap;
    }
}
