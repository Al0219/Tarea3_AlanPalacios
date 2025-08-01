package com.umg.blog1.demo.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq")
    @SequenceGenerator(name = "order_seq", sequenceName = "order_seq", allocationSize = 1)
    private int order_id;

    @Column(name = "product_id", nullable = false)
    private int product_id;

    @Column(name = "product_quantity", nullable = false)
    private Float product_quantity;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime order_date;

    @Column(name = "order_status", nullable = false, length = 15)
    private String order_status;

    @Column(name = "customer_dpi", nullable = false)
    private int customer_dpi;

    public Orders() {
    }

    public Orders(int order_id, int product_id, Float product_quantity, LocalDateTime order_date, String order_status, int customer_dpi) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.product_quantity = product_quantity;
        this.order_date = order_date;
        this.order_status = order_status;
        this.customer_dpi = customer_dpi;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public Float getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(Float product_quantity) {
        this.product_quantity = product_quantity;
    }

    public LocalDateTime getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDateTime order_date) {
        this.order_date = order_date;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public int getCustomer_dpi() {
        return customer_dpi;
    }

    public void setCustomer_dpi(int customer_dpi) {
        this.customer_dpi = customer_dpi;
    }

}
