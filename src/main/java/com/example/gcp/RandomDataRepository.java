package com.example.gcp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RandomDataRepository extends JpaRepository<RandomDataEntity, Long> {
}