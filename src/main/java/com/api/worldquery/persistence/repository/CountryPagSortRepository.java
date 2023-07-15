package com.api.worldquery.persistence.repository;

import com.api.worldquery.persistence.entity.countryEntity;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface CountryPagSortRepository extends ListPagingAndSortingRepository<countryEntity, String> {
    
}
