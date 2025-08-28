package com.example.demo.solid.dip;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepo repo; // depends on abstraction
    public OrderService(OrderRepo repo) { this.repo = repo; }

    public Order create(String name) { return repo.save(name); }
    public List<Order> all() { return repo.findAll(); }
    public String using() { return repo.repoName(); }
}
