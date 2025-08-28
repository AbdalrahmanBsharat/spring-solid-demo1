package com.example.demo.solid.srp;

import java.util.List;

public class Invoice {
    private final long id;
    private final List<Item> items;
    public Invoice(long id,List<Item> items){
        this.id=id;
        this.items=items;
    }

    public long getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }
}
