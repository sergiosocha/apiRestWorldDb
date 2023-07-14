package com.api.worldquery.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class countryLanguageId implements Serializable {
    private String CountryCode;
    private String Language;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        countryLanguageId that = (countryLanguageId) o;
        return Objects.equals(CountryCode, that.CountryCode) && Objects.equals(Language, that.Language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CountryCode, Language);
    }
}



