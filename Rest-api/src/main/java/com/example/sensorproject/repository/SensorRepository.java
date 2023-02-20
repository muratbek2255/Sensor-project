package com.example.sensorproject.repository;

import com.example.sensorproject.entity.Sensor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SensorRepository extends JpaRepository<Sensor, Integer> {

    @Query(value = "SELECT * FROM sensor.sensors WHERE sensor.sensors.id = ?1", nativeQuery = true)
    Sensor getById(@Param("id") int id);

}
