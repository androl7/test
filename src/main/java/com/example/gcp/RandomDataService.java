package com.example.gcp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomDataService {

    private final RandomDataRepository repository;

    @Autowired
    public RandomDataService(RandomDataRepository repository) {
        this.repository = repository;
    }

    public void generateAndSaveRandomData() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            RandomDataEntity entity = new RandomDataEntity();
            entity.setRandomField("Random Data " + random.nextInt(100));
            repository.save(entity);
        }
    }
}
