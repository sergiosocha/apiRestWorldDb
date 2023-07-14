package com.api.worldquery.persistence.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.core.annotation.Order;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "country")
@Getter
@Setter
@NoArgsConstructor
public class countryEntity implements Serializable {

    @Id
    @Column(name = "Code",nullable = false, length = 3)
    private String code;

    @Column(name = "Name", nullable = false, length = 52)
    private String name;

    @Column(name = "Continent",nullable = false, length = 150)
    private String continent;

    @Column(name = "Region", nullable = false, length = 26)
    private String region;

    @Column(name = "surfaceArea", nullable = false, columnDefinition = "Decimal (10,2)")
    private Double surfaceArea;

    @Column(name = "IndepYear", nullable = false)
    private Integer indepYear;

    @Column(name = "LifeExpectancy", nullable = false, columnDefinition = "Decimal (3,1)")
    private Double lifeExpectancy;

    @Column(name = "GNP", nullable = false, columnDefinition = "Decimal (10,2)")
    private Double gnp;

    @Column(name = "GNPOld", nullable = false, columnDefinition = "Decimal (10,2)")
    private Double gnpOld;

    @Column(name = "LocalName", nullable = false, length = 45)
    private String localName;

    @Column(name = "GovernmentForm", nullable = false, length = 45)
    private String governmentForm;

    @Column(name = "HeadOfState", nullable = false, length = 60)
    private String headOfState;

    @Column(name = "Capital", nullable = false)
    private Integer capital;

    @Column(name="Code2", nullable = false, length = 2)
    private String code2;


    @OneToMany(mappedBy = "CountryCode", fetch = FetchType.EAGER)
    private List<cityEntity> city;



    @OneToMany(mappedBy = "CountryCode", fetch = FetchType.EAGER)
    private List<countryLanguageEntity> language;

}
