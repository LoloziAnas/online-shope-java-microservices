package com.mavistro.orderservice.controller;


import com.mavistro.orderservice.model.Order;
import com.mavistro.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/orders")
public class OrderControllerImpl implements OrderController{
    @Autowired
    private final OrderRepository orderRepository;

    public OrderControllerImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    @GetMapping("/{id}")
    @Override
    public boolean getOrder(@RequestParam("id") Long orderId) {
        return false;
    }
    @GetMapping("/{name}")
    @Override
    public boolean getOrder(@RequestParam("name") String orderName) {
        return orderRepository.findByName(orderName).isPresent();
    }
    @GetMapping
    @Override
    public void getAllOrders() {
        orderRepository.findAll();
    }

    @PostMapping
    @Override
    public int createOrder(@RequestBody Order order) {
        orderRepository.save(order);
        return 1;
    }

}
