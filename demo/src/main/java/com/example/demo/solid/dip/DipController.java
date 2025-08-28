package com.example.demo.solid.dip;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/solid/dip")
public class DipController {
    private final OrderService service;
    public DipController(OrderService service){ this.service = service; }

    @GetMapping("/create")
    public Map<String,Object> create(@RequestParam String name){
        Order o = service.create(name);
        return Map.of("createdId", o.getId(), "name", o.getName(), "repo", service.using());
    }

    @GetMapping("/all")
    public List<Map<String,Object>> all(){
        return service.all().stream()
                .map(o -> Map.<String,Object>of("id", o.getId(), "name", o.getName()))
                .toList();
    }
}

//Try:
//
//        /solid/dip/create?name=Milk
//
//        /solid/dip/all