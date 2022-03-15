package com.praveen.persistance.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.stream.Stream;

@Getter
@RequiredArgsConstructor
public enum Planet {
  MERCURY("gemini"),
  VENUS("taurus"),
  EARTH("virgo"),
  MARS("scorpio"),
  JUPITER("sagittarius"),
  SATURN("capricorn"),
  URANUS("libra"),
  NEPTUNE("aquarius");

  private final String zodiacSign;

  public static Planet getPlanetForZodiacSign(String zodiacSign) {

    return Stream.of(values())
        .filter(planet -> planet.getZodiacSign().equals(zodiacSign))
        .findFirst()
        .orElse(null);
  }
}
