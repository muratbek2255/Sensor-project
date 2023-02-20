package com.example.sensorproject.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class MeasurementDto {

    private Double value;
    private Boolean raining;
    private SensorDto sensorDto;
}
