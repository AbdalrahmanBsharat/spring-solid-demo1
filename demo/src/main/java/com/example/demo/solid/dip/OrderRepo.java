package com.example.demo.solid.dip;

import java.util.List;

public interface OrderRepo {
    Order save(String name);
    List<Order> findAll();
    String repoName();
}
