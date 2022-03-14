package com.praveen.persistance.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

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
}
