package com.praveen.persistance.repository;

import com.praveen.persistance.constants.Planet;
import com.praveen.persistance.entity.PlanetEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PlanetRepositoryTest {

  @Autowired PlanetRepository planetRepository;

  @Test
  void savePlanets() {

    final var closerToSun =
        PlanetEntity.builder()
            .planets(List.of(Planet.VENUS, Planet.MARS))
            .description("Closer to sun")
            .build();

    final var awayFromSun =
        PlanetEntity.builder()
            .planets(List.of(Planet.NEPTUNE, Planet.SATURN))
            .description("Away from sun")
            .build();

    planetRepository.saveAll(List.of(closerToSun, awayFromSun));
  }
}
