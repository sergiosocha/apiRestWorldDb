package com.api.worldquery.service;

import com.api.worldquery.persistence.entity.countryEntity;
import com.api.worldquery.persistence.repository.CountryPagSortRepository;
import com.api.worldquery.persistence.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class CountryService {

    private final CountryRepository countryRepository;
    private final CountryPagSortRepository countryPagSortRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository, CountryPagSortRepository countryPagSortRepository) {
        this.countryRepository = countryRepository;
        this.countryPagSortRepository = countryPagSortRepository;
    }

    public Page<countryEntity> getAll(int page, int elements){
        Pageable pageRequest = PageRequest.of(page,elements);

        return this.countryPagSortRepository.findAll(pageRequest);
    }


}
