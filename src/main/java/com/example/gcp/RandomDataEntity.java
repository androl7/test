package com.example.gcp;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "random_data")
@Data
public class RandomDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String randomField;

}
