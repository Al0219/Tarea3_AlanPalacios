package com.umg.blog1.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
    @SequenceGenerator(name = "product_seq", sequenceName = "product_seq", allocationSize = 1)
    private int product_id;

    @Column(name = "product_cost_price", nullable = false)
    private Float product_cost_price;

    @Column(name = "product_sale_price", nullable = false)
    private Float product_sale_price;

    @Column(name = "product_stock", nullable = false)
    private Float product_stock;

    @Column(name = "product_description", nullable = false, length = 250)
    private String product_description;

    @Column(name = "coffee_type_id", nullable = false)
    private int coffee_type_id;

    @Column(name = "category_id", nullable = false)
    private int category_id;

    public Products() {
    }

    public Products(int product_id, Float product_cost_price, Float product_sale_price, Float product_stock, String product_description, int coffee_type_id, int category_id) {
        this.product_id = product_id;
        this.product_cost_price = product_cost_price;
        this.product_sale_price = product_sale_price;
        this.product_stock = product_stock;
        this.product_description = product_description;
        this.coffee_type_id = coffee_type_id;
        this.category_id = category_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public Float getProduct_cost_price() {
        return product_cost_price;
    }

    public void setProduct_cost_price(Float product_cost_price) {
        this.product_cost_price = product_cost_price;
    }

    public Float getProduct_sale_price() {
        return product_sale_price;
    }

    public void setProduct_sale_price(Float product_sale_price) {
        this.product_sale_price = product_sale_price;
    }

    public Float getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(Float product_stock) {
        this.product_stock = product_stock;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getCoffee_type_id() {
        return coffee_type_id;
    }

    public void setCoffee_type_id(int coffee_type_id) {
        this.coffee_type_id = coffee_type_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
