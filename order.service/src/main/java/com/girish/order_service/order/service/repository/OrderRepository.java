package com.girish.order_service.order.service.repository;

import com.girish.order_service.order.service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
