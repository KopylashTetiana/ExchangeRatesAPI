package com.tetianakopylash.exchangeratesapi.domain;

import javax.persistence.*;

@Entity
@Table(name = "currency")
public class Currency {

    @Id
    private String code;

    @Column(name = "name")
    private String name;

    public Currency() {}

    public Currency(String code, String name) {
        this.code = code;
        this.name = name;
    }

    //getters & setters
}