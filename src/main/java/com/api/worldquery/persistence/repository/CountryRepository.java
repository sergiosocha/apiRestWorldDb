package com.api.worldquery.persistence.repository;

import com.api.worldquery.persistence.entity.countryEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CountryRepository extends ListCrudRepository<countryEntity, String> {
    List<countryEntity> findByCode();
}