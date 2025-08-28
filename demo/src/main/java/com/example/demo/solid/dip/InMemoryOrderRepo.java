package com.example.demo.solid.dip;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Primary @Repository
public class InMemoryOrderRepo implements OrderRepo {
    private final AtomicLong seq = new AtomicLong(1);
    private final List<Order> data = new ArrayList<>();
    public Order save(String name){ Order o = new Order(seq.getAndIncrement(), name); data.add(o); return o; }
    public List<Order> findAll(){ return List.copyOf(data); }
    public String repoName(){ return "InMemoryOrderRepo"; }
}
