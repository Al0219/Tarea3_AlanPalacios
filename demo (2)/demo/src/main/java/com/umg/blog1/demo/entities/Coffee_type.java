package com.umg.blog1.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "coffee_type")
public class Coffee_type {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coffee_seq")
    @SequenceGenerator(name = "coffee_seq", sequenceName = "coffee_id_seq", allocationSize = 1)
    private Long coffee_type_id;

    @Column(name = "coffee_type_name", nullable = false, length = 50)
    private String coffee_type_name;

    @Column(name = "coffee_type_description", nullable = false, length = 250)
    private String coffee_type_description;

    public Coffee_type() {
    }

    public Coffee_type(Long coffee_type_id, String coffee_type_name, String coffee_type_description) {
        this.coffee_type_id = coffee_type_id;
        this.coffee_type_name = coffee_type_name;
        this.coffee_type_description = coffee_type_description;
    }

    public Long getCoffee_type_id() {
        return coffee_type_id;
    }

    public void setCoffee_type_id(Long coffee_type_id) {
        this.coffee_type_id = coffee_type_id;
    }

    public String getCoffee_type_name() {
        return coffee_type_name;
    }

    public void setCoffee_type_name(String coffee_type_name) {
        this.coffee_type_name = coffee_type_name;
    }

    public String getCoffee_type_description() {
        return coffee_type_description;
    }

    public void setCoffee_type_description(String coffee_type_description) {
        this.coffee_type_description = coffee_type_description;
    }
}
