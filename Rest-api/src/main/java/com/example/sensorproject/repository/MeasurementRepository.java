package com.example.sensorproject.repository;

import com.example.sensorproject.entity.Measurement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

    @Query(value = "SELECT * FROM sensor.measurements WHERE sensor.measurements.id = ?1", nativeQuery = true)
    Measurement getById(@Param("id") int id);
}
