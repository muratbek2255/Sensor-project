package com.example.sensorproject.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "measurements", schema = "sensor")
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "raining")
    private Boolean raining;

    @Column(name = "value")
    private Double value;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sensor_id")
    private Sensor sensor;

    public Boolean isRaining() {
        return raining;
    }
}
