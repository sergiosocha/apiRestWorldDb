package com.api.worldquery.persistence.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "city")
@Getter
@Setter
@NoArgsConstructor
public class cityEntity implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "CountryCode", nullable = false, length = 3)
    private String countryCode;

    @Column(name = "District", nullable = false, length = 20)
    private String district;

    @Column(name = "Population", nullable = false)
    private Integer population;

    @ManyToOne
    @JoinColumn(name ="CountryCode", referencedColumnName = "Code",  insertable = false, updatable = false )
    @JsonIgnore
    private countryEntity Code;

}

