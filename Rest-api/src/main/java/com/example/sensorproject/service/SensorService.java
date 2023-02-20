package com.example.sensorproject.service;

import com.example.sensorproject.dto.SensorDto;
import com.example.sensorproject.entity.Sensor;

public interface SensorService {

    public String addSensor(SensorDto sensorDto);

    public Sensor getById(int id);
}
