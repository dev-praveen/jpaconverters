package com.praveen.persistance.repository;

import com.praveen.persistance.entity.PlanetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PlanetRepository extends JpaRepository<PlanetEntity, Long> {}
