package com.example.sensorproject.controller;


import com.example.sensorproject.dto.MeasurementDto;
import com.example.sensorproject.entity.Measurement;
import com.example.sensorproject.service.MeasurementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/measurement")
public class MeasurementController {

    @Autowired
    private MeasurementServiceImpl measurementService;

    @GetMapping
    public ResponseEntity<List<Measurement>> getAllMeasurement() {
        return ResponseEntity.status(200).body(measurementService.getAllMeasurement());
    }

    @PostMapping
    public ResponseEntity<String> addMeasurement(@RequestBody MeasurementDto measurementDto) {
        return ResponseEntity.status(201).body(measurementService.addMeasurement(measurementDto));
    }

    @GetMapping("/rainingCount")
    public Long getRainyDaysCount() {
        return measurementService.getAllMeasurement().stream().filter(Measurement::isRaining).count();
    }
}
