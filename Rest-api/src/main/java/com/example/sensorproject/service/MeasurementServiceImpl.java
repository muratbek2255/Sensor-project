package com.example.sensorproject.service;

import com.example.sensorproject.dto.MeasurementDto;
import com.example.sensorproject.entity.Measurement;
import com.example.sensorproject.entity.Sensor;
import com.example.sensorproject.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasurementServiceImpl implements MeasurementService {

    @Autowired
    private MeasurementRepository measurementRepository;

    @Autowired
    private SensorServiceImpl sensorService;

    @Override
    public List<Measurement> getAllMeasurement() {
        List<Measurement> measurements = measurementRepository.findAll();

        return measurements;
    }

    @Override
    public String addMeasurement(MeasurementDto measurementDto) {

        Measurement measurement = new Measurement();

        Sensor sensor = sensorService.getById(measurementDto.getSensorDto().getId());


        measurement.setValue(measurementDto.getValue());
        measurement.setRaining(measurementDto.getRaining());
        measurement.setSensor(sensor);

        measurementRepository.save(measurement);

        return "Measurement created!!!";

    }
}
