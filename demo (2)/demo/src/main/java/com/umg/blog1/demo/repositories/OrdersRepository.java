package com.umg.blog1.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.umg.blog1.demo.entities.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
