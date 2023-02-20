package com.example.sensorproject.controller;


import com.example.sensorproject.dto.SensorDto;
import com.example.sensorproject.service.SensorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensors")
public class SensorController {

    @Autowired
    private SensorServiceImpl sensorService;

    @PostMapping
    public ResponseEntity<String> addSensor(@RequestBody SensorDto sensorDto) {
        return ResponseEntity.status(201).body(sensorService.addSensor(sensorDto));
    }
}
