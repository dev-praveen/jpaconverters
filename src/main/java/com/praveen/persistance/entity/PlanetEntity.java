package com.praveen.persistance.entity;

import com.praveen.persistance.constants.Planet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "planet")
public class PlanetEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PLANET_SEQUENCE")
  @SequenceGenerator(name = "PLANET_SEQUENCE", sequenceName = "PLANET_SEQUENCE", allocationSize = 1)
  private Long id;

  @Column(name = "planets")
  @Convert(converter = PlanetConverter.class)
  private List<Planet> planets;

  @Column(name = "description")
  private String description;
}
