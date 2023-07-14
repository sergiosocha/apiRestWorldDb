package com.api.worldquery.persistence.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "countryLanguage")
@IdClass(countryLanguageId.class)
@Getter
@Setter
@NoArgsConstructor
public class countryLanguageEntity implements Serializable {

    @Id
    @Column(name = "CountryCode", nullable = false, length = 3)
    private String countryCode;


    @Id
    @Column(name = "Language", nullable = false, length = 30)
    private String language;

    @Column(name = "IsOfficial", nullable = false)
    @Enumerated(EnumType.STRING)
    private enumValues isOfficial;

    @Column(name = "Percentage",  nullable = false, columnDefinition = "Decimal (4,1)")
    private Double percentage;

    @ManyToOne
    @JoinColumn(name ="CountryCode", referencedColumnName = "Code",  insertable = false, updatable = false )
    @JsonIgnore
    private countryEntity Code;

    @Override
    public String toString() {
        return "countryLanguageEntity{" +
                "countryCode='" + countryCode + '\'' +
                ", language='" + language + '\'' +
                ", isOfficial=" + isOfficial +
                ", percentage=" + percentage +
                '}';
    }

    public enum enumValues{ T, F}
}
