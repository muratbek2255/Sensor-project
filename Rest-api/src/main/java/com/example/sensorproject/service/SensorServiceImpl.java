package com.example.sensorproject.service;

import com.example.sensorproject.dto.SensorDto;
import com.example.sensorproject.entity.Sensor;
import com.example.sensorproject.repository.SensorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SensorServiceImpl implements SensorService {

    @Autowired
    private SensorRepository sensorRepository;

    @Override
    public String addSensor(SensorDto sensorDto) {

        Sensor sensor = new Sensor();

        sensor.setId(sensorDto.getId());
        sensor.setName(sensorDto.getSensorName());

        sensorRepository.save(sensor);

        return "Sensor created";
    }

    @Override
    public Sensor getById(int id) {
        Sensor sensor = sensorRepository.getById(id);

        return sensor;
    }
}
