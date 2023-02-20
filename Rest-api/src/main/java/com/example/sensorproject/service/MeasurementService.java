package com.example.sensorproject.service;

import com.example.sensorproject.dto.MeasurementDto;
import com.example.sensorproject.entity.Measurement;

import java.util.List;

public interface MeasurementService {

    public String addMeasurement(MeasurementDto measurementDto);

    public List<Measurement> getAllMeasurement();
}
