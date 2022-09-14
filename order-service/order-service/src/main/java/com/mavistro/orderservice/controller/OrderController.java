package com.mavistro.orderservice.controller;

import com.mavistro.orderservice.model.Order;

public interface OrderController{
    boolean getOrder(Long orderId);
    boolean getOrder(String orderName);
    void getAllOrders();
    int createOrder(Order order);

}
