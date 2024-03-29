package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
