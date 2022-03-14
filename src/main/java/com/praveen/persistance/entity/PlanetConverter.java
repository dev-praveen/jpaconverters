package com.praveen.persistance.entity;

import com.praveen.persistance.constants.Planet;
import org.springframework.util.CollectionUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Converter
public class PlanetConverter implements AttributeConverter<List<Planet>, String> {
  @Override
  public String convertToDatabaseColumn(List<Planet> planets) {
    if (CollectionUtils.isEmpty(planets)) return "";
    return String.join(",", planets.toString());
  }

  @Override
  public List<Planet> convertToEntityAttribute(String dbData) {

    return Stream.of(dbData.split(","))
        .map(Planet::valueOf)
        .collect(Collectors.toList());
  }
}
