package com.praveen.persistance.repository;

import com.praveen.persistance.constants.Planet;
import com.praveen.persistance.entity.PlanetEntity;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PlanetRepositoryTest {

  @Autowired PlanetRepository planetRepository;

  @Test
  @Disabled("Don't execute this test as it will insert records into database.")
  void savePlanets() {

    final var closerToSun =
        PlanetEntity.builder()
            .planets(List.of(Planet.EARTH))
            .description("Middle of the planetary")
            .build();

    final var awayFromSun =
        PlanetEntity.builder()
            .planets(List.of(Planet.JUPITER))
            .description("High mass planet")
            .build();

    planetRepository.saveAll(List.of(closerToSun, awayFromSun));
  }

  @Test
  void fetchPlanets() {

    final var planetEntities = planetRepository.findAll();
    planetEntities.forEach(
        planetEntity ->
            planetEntity
                .getPlanets()
                .forEach(
                    planet ->
                        System.out.println(
                            "Planet "
                                + planet
                                + " and it's Zodiac sign "
                                + planet.getZodiacSign())));
    assertThat(planetEntities).isNotEmpty();
  }
}
